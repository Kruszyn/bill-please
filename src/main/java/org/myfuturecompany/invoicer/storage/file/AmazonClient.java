package org.myfuturecompany.invoicer.storage.file;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.stereotype.Service;
import java.io.File;

@Service
class AmazonClient {

    private final AmazonConfig config;
    private final AmazonS3 s3client;

    public AmazonClient(AmazonConfig config) {
        this.config = config;
        AWSCredentials credentials = new BasicAWSCredentials(config.getAccessKey(), config.getSecretKey());
        this.s3client = new AmazonS3Client(credentials);
    }

    void uploadFileToMainRepo(String fileName, File file) {
        s3client.putObject(new PutObjectRequest(config.getBucketName(), fileName, file)
                .withCannedAcl(CannedAccessControlList.PublicRead));
    }

}