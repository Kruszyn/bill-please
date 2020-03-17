package org.myfuturecompany.invoicer.storage.file;

import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.io.File;

@Service
class AmazonClient {

    private final AmazonConfig config;
    private final S3Client s3client;

    public AmazonClient(AmazonConfig config) {
        this.config = config;
        this.s3client = S3Client.builder().build();
    }

    void uploadFileToMainRepo(String fileName, File file) {
        s3client.putObject(PutObjectRequest.builder()
                .bucket(config.getBucketName())
                .key(fileName).build(), RequestBody.fromFile(file));
    }

}