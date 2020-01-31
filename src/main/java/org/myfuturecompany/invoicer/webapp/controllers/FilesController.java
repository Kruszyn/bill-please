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

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class FilesController {

    private final DocumentStorage documentStorage;
    private static final String FILES_UPLOADED_MSG = "Yay! Your files uploaded succesfully!";


    @PostMapping("/files/upload")
    public RestResponse uploadFiles(@RequestParam List<MultipartFile> files){
        log.info("{} files uploaded", files.size());
        documentStorage.createNewDocuments(files);
        return new RestResponse(HttpStatus.OK, FILES_UPLOADED_MSG);
    }
}
