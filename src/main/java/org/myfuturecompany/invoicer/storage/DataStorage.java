package org.myfuturecompany.invoicer.storage;

import org.myfuturecompany.invoicer.storage.model.Document;

public interface DataStorage {
    Document getDocument(String param);
    void saveDocument(Document doc);
    void updateDocument(Document doc);
    void deleteDocument();
}
