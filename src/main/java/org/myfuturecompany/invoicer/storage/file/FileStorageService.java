package org.myfuturecompany.invoicer.storage.file;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class FileStorageService implements FileStorage {

    private final AmazonClient amazonClient;

    @Override
    public String saveFile(MultipartFile file) throws IOException {
        log.debug("Saving file " + file.getName());
        File convFile = convertMultiPartToFile(file);
        String fileID = UUID.randomUUID().toString();
        amazonClient.uploadFileToMainRepo(fileID, convFile);
        log.debug("File with id [{}] uploaded", fileID);
        return fileID;
    }

    @Override
    public void saveFiles(List<MultipartFile> files) {
        files.forEach(o -> log.debug(o.getName()));
        log.warn("Not implemented yet!");
    }

    @Override
    public Optional<File> getFile(String fileID) {
        log.warn("Not implemented yet!");
        return Optional.empty();
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }

}
