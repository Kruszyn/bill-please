package org.myfuturecompany.invoicer.storage.document;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.myfuturecompany.invoicer.JUnitSoftlyTest;
import org.myfuturecompany.invoicer.storage.document.model.Document;
import org.myfuturecompany.invoicer.storage.document.model.DocumentRepository;
import org.myfuturecompany.invoicer.storage.file.FileStorageService;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DocumentStorageServiceTests extends JUnitSoftlyTest {

    @Mock
    private DocumentRepository documentRepository;
    @Mock
    private FileStorageService fileStorageService;
    @InjectMocks()
    private DocumentStorageService documentStorage;

    @Test
    public void testMultipartFilesDocumentsCreation() throws IOException {
        //given
        List<MultipartFile> list = new ArrayList<>();
        list.add(new MockMultipartFile("test", new byte[10]));
        list.add(new MockMultipartFile("test2", new byte[2]));
        //when
        //when(fileStorageService.saveFile(any())).thenReturn(generatedFileUUID);
        List<Document> doc = documentStorage.createNewDocuments(list);
        //then
        verify(fileStorageService, times(2)).saveFile(any());
        softly.assertThat(doc).isNotNull();
        softly.assertThat(doc.size()).isEqualTo(2);

    }


}
