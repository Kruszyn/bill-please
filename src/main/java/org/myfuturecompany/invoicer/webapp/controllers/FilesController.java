package org.myfuturecompany.invoicer.webapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.myfuturecompany.invoicer.storage.DocumentStorage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@Slf4j
public class FilesController {

    private final DocumentStorage documentStorage;

    public FilesController(DocumentStorage documentStorage) {
        this.documentStorage = documentStorage;
    }

    @PostMapping("/files/upload")
    public ResponseEntity uploadFiles(List<MultipartFile> files){
        log.info("{} files uploaded", files.size());
        documentStorage.createNewDocuments(files);
        return new ResponseEntity(HttpStatus.OK);
    }
}
