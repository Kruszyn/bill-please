package org.myfuturecompany.invoicer.storage.document;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.myfuturecompany.invoicer.JUnitSoftlyTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class DocumentStorageServiceTests extends JUnitSoftlyTest {

    private DocumentRepository testRepo = new TestDocumentRepository();
    private DocumentStorageService documentStorage =
            new DocumentStorageService(new TestFileStorage(), testRepo);

    @Test
    public void testMultipartFilesDocumentsCreation() throws IOException {
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


}
