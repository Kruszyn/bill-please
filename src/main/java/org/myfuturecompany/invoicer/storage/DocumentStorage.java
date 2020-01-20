package org.myfuturecompany.invoicer.storage;

import org.myfuturecompany.invoicer.storage.model.Document;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface DocumentStorage {
    //C
    void saveDocument(Document doc);
    List<Document> createNewDocuments(List<MultipartFile> files);
    //R
    Optional<Document> getDocument(String param);
    //U
    void updateDocument(Document doc);
    //D
    void deleteDocument();

}
