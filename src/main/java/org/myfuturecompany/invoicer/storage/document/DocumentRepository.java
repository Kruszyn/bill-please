package org.myfuturecompany.invoicer.storage.document;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocumentRepository extends MongoRepository<Document, String> {
    Document save(Document doc);
    Optional<Document> findByDocumentID(String uuid);
}
