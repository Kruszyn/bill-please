package org.myfuturecompany.invoicer.storage.document;

import org.myfuturecompany.invoicer.storage.file.FileStorage;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class TestFileStorage implements FileStorage {
    @Override
    public String saveFile(MultipartFile file) throws IOException {
        return null;
    }

    @Override
    public void saveFiles(List<MultipartFile> files) {

    }

    @Override
    public Optional<File> getFile(String fileID) {
        return Optional.empty();
    }
}
