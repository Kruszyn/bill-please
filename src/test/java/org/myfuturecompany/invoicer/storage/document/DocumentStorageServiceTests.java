package org.myfuturecompany.invoicer.storage.document;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.io.File;
import java.util.UUID;

import org.mockito.junit.MockitoJUnitRunner;
import org.myfuturecompany.invoicer.JUnitSoftlyTest;
import org.myfuturecompany.invoicer.storage.document.model.Document;
import org.myfuturecompany.invoicer.storage.file.FileStorageService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DocumentStorageServiceTests extends JUnitSoftlyTest {

    @Mock
    private FileStorageService fileStorageService;

    @InjectMocks
    private DocumentStorageService documentStorage;

    @Test
    public void testDocumentCreate(){
        //given
        UUID generatedFileUUID = UUID.randomUUID();
        //when
        when(fileStorageService.saveFile(any())).thenReturn(generatedFileUUID);
        Document doc = documentStorage.createNewDocument(any());
        //then
        softly.assertThat(doc).isNotNull();
        softly.assertThat(doc.getDocumentUUID()).isNotNull();
        softly.assertThat(doc.getTitle()).isEqualTo(doc.getDocumentUUID().toString());
        softly.assertThat(doc.getMainFileUUID()).isEqualTo(generatedFileUUID);
    }



}
