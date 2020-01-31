package org.myfuturecompany.invoicer.storage.document.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends MongoRepository<Document, String> {
    Document save(Document doc);
}
