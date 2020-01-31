package org.myfuturecompany.invoicer.storage.document.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@org.springframework.data.mongodb.core.mapping.Document
public class Document {
    @Id
    private String documentID;
    private String title;
    private String mainFileID;

}
