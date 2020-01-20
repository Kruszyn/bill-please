package org.myfuturecompany.invoicer.storage;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FileStorage {
    void saveFiles(List<MultipartFile> files);
    Optional<File> getFile(UUID fileUUID);
}
