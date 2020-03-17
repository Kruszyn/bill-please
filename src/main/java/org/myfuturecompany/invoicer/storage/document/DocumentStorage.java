package org.myfuturecompany.invoicer.storage.document;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface DocumentStorage {
    void saveDocument(Document doc);
    Document createNewDocument(MultipartFile file) throws IOException;
    List<Document> createNewDocuments(List<MultipartFile> files) throws IOException;

    Optional<Document> getDocument(String param);

    void updateDocument(Document doc);

    void deleteDocument();

}
