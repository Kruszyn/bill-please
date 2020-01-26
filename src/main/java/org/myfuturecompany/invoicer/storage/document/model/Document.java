package org.myfuturecompany.invoicer.storage.document.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
public class Document {
    private final UUID documentUUID;
    private String title;
    private UUID mainFileUUID;

    public Document(){
        this.documentUUID = UUID.randomUUID();
        this.title = this.documentUUID.toString();
    }


}
