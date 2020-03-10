package org.myfuturecompany.invoicer.webapp.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.myfuturecompany.invoicer.storage.document.DocumentStorage;
import org.myfuturecompany.invoicer.webapp.dto.RestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class FilesController {

    private static final String FILES_UPLOADED_MSG = "Yay! Your files uploaded successfully!";
    private static final String FILE_UPLOAD_ERROR_MSG = "Nay! Baby don't hurt me!";
    private final DocumentStorage documentStorage;


    @PostMapping("/files/upload")
    public RestResponse uploadFiles(@RequestParam List<MultipartFile> files){
        log.info("{} files uploaded", files.size());
        try {
            documentStorage.createNewDocuments(files);
            return new RestResponse(HttpStatus.OK, FILES_UPLOADED_MSG);
        } catch (IOException e) {
            log.error("Upload files error", e);
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR, FILE_UPLOAD_ERROR_MSG);
        }
    }
}
