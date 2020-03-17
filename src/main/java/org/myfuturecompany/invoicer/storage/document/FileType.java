package org.myfuturecompany.invoicer.storage.document;

public enum FileType {
    PDF,
    UNKNOWN;

    static FileType getFileType(String name) {
        if(name == null || !name.contains(".")) return UNKNOWN;

        int splitIndex = name.split("\\.").length;
        String extension = name.split("\\.")[splitIndex-1];

        switch (extension.toLowerCase()) {
            case "pdf":
                return PDF;
            default:
                return UNKNOWN;
        }
    }
}
