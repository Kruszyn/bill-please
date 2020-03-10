package org.myfuturecompany.invoicer.storage.file;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FileStorage {
    String saveFile(MultipartFile file) throws IOException;
    void saveFiles(List<MultipartFile> files);

    Optional<File> getFile(String fileID);
}
