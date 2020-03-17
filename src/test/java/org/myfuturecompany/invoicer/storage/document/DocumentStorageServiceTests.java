package org.myfuturecompany.invoicer.storage.document;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.myfuturecompany.invoicer.JUnitSoftlyTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class DocumentStorageServiceTests extends JUnitSoftlyTest {

    private DocumentRepository testRepo = new TestDocumentRepository();
    private DocumentStorageService documentStorage =
            new DocumentStorageService(new TestFileStorage(), testRepo);

    @Test
    public void testMultipartFileDocumentCreation() throws IOException {
        //given
        MultipartFile file = new MockMultipartFile("test.pdf", new byte[10]);
        //when
        Document doc = documentStorage.createNewDocument(file);
        softly.assertThat(doc).isNotNull();

        Optional<Document> optionalDocument = testRepo.findByDocumentID(doc.getDocumentID());
        softly.assertThat(optionalDocument).isNotNull();
        softly.assertThat(optionalDocument.isPresent());
        Document document = optionalDocument.get();
        softly.assertThat(document.getMainFileType()).isEqualTo(FileType.PDF);
    }

    @Test
    public void testMultipartFileMultipleDocumentCreation() throws IOException {
        //given
        List<MultipartFile> files = new ArrayList<>();
        MultipartFile file = new MockMultipartFile("test.pdf", new byte[10]);
        files.add(file);
        MultipartFile secondFile = new MockMultipartFile("test.abc", new byte[10]);
        files.add(secondFile);
        //when
        List<Document> doc = documentStorage.createNewDocuments(files);
        softly.assertThat(doc).isNotNull();
        softly.assertThat(doc.size()).isEqualTo(2);
    }

}
