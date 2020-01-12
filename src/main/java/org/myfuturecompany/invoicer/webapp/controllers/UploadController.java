package org.myfuturecompany.invoicer.webapp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {


    @PostMapping("upload")
    public String uploadFiles(){


        return "OK";
    }

}
