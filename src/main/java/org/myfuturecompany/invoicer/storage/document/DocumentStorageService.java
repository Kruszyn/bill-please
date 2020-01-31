package org.myfuturecompany.invoicer.storage.document;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.myfuturecompany.invoicer.storage.document.model.DocumentRepository;
import org.myfuturecompany.invoicer.storage.file.FileStorage;
import org.myfuturecompany.invoicer.storage.document.model.Document;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class DocumentStorageService implements DocumentStorage {

    private final FileStorage fileStorage;
    private final DocumentRepository documentRepository;

    @Override
    public void saveDocument(Document doc) {
        log.warn("Not implemented yet!");
    }

    @Override
    public Document createNewDocument(MultipartFile file) {
        Document doc = new Document();
        UUID fileUUID = fileStorage.saveFile(file);
        doc.setMainFileID("file-id-123456");
        return documentRepository.save(doc);
    }

    @Override
    public List<Document> createNewDocuments(List<MultipartFile> files) {
        List<Document> docs = new ArrayList<>();

        for (MultipartFile f : files) {
            docs.add(createNewDocument(f));
        }
        return docs;
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
