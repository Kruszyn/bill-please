package org.myfuturecompany.invoicer.storage;

import lombok.extern.slf4j.Slf4j;
import org.myfuturecompany.invoicer.storage.model.Document;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class DocumentStorageService implements DocumentStorage {

    private final FileStorage fileStorage;

    public DocumentStorageService(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

    @Override
    public void saveDocument(Document doc) {
        log.warn("Not implemented yet!");
    }

    @Override
    public List<Document> createNewDocuments(List<MultipartFile> files) {
        log.warn("Not implemented yet!");
        return Collections.emptyList();
    }

    @Override
    public Optional<Document> getDocument(String param) {
        log.warn("Not implemented yet!");
        return Optional.empty();
    }

    @Override
    public void updateDocument(Document doc) {
        log.warn("Not implemented yet!");
    }

    @Override
    public void deleteDocument() {
        log.warn("Not implemented yet!");
    }
}
