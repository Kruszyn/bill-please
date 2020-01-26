package org.myfuturecompany.invoicer.storage.document;

import lombok.extern.slf4j.Slf4j;
import org.myfuturecompany.invoicer.storage.file.FileStorage;
import org.myfuturecompany.invoicer.storage.document.model.Document;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
    public Document createNewDocument(File file) {
        Document doc = new Document();
        //save in db
        //save file into file storage
        //obtain file uuid
        UUID fileUUID = fileStorage.saveFile(file);
        doc.setMainFileUUID(fileUUID);
        return doc;
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
