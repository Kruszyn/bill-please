package org.myfuturecompany.invoicer.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = {"/", "/index", "/dashboard"})
    public String index(){
        return "index";
    }

    @GetMapping(value = {"/upload"})
    public String upload(){
        return "upload";
    }

    @GetMapping(value = {"/repo"})
    public String repo(){
        return "repo";
    }

    @GetMapping(value = {"/template"})
    public String template(){
        return "template";
    }
}
