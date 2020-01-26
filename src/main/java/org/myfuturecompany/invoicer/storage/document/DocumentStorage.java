package org.myfuturecompany.invoicer.storage.document;

import org.myfuturecompany.invoicer.storage.document.model.Document;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Optional;

public interface DocumentStorage {
    //C
    void saveDocument(Document doc);
    Document createNewDocument(File file);
    List<Document> createNewDocuments(List<MultipartFile> files);
    //R
    Optional<Document> getDocument(String param);
    //U
    void updateDocument(Document doc);
    //D
    void deleteDocument();

}
