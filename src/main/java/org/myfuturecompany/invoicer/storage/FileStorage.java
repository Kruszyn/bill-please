package org.myfuturecompany.invoicer.storage;

import java.io.File;

public interface FileStorage {
    void saveFile();
    File getFile(String ID);


}
