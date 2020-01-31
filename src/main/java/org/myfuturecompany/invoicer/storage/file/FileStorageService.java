package org.myfuturecompany.invoicer.storage.file;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class FileStorageService implements FileStorage{

    @Override
    public UUID saveFile(MultipartFile file) {
        log.debug("Saving file " + file.getName());
        log.warn("Not implemented yet!");
        return null;
    }

    @Override
    public void saveFiles(List<MultipartFile> files) {
        files.forEach(o -> log.debug(o.getName()));
        log.warn("Not implemented yet!");
    }

    @Override
    public Optional<File> getFile(UUID fileUUID) {
        log.warn("Not implemented yet!");
        return Optional.empty();
    }
}
