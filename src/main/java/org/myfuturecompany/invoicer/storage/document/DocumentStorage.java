package org.myfuturecompany.invoicer.storage.document;

import org.myfuturecompany.invoicer.storage.document.model.Document;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface DocumentStorage {
    //C
    void saveDocument(Document doc);
    Document createNewDocument(MultipartFile file) throws IOException;
    List<Document> createNewDocuments(List<MultipartFile> files) throws IOException;
    //R
    Optional<Document> getDocument(String param);
    //U
    void updateDocument(Document doc);
    //D
    void deleteDocument();

}
