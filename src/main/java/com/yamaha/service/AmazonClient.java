package com.yamaha.service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@Service
public class AmazonClient {
    private AmazonS3 s3client;

    @Value("${amazonProperties.endpointUrl}")
    private String endpointUrl;
    @Value("${amazonProperties.bucketName}")
    private String bucketName;
    @Value("${amazonProperties.accessKey}")
    private String accessKey;
    @Value("${amazonProperties.secretKey}")
    private String secretKey;

    @PostConstruct
    private void initializeAmazon() {
        AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
        this.s3client = new AmazonS3Client(credentials);
//        s3client.putObject(bucketName,  "tem file amh", InputStream.nullInputStream())
    }

    //public String uploadFileWithBase64(String base64){}
    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }

    //có thể upload một file nhiều lần vì thế chúng ta tạo ra một tên duy nhất cho mỗi lần upload /can upload a file multiple times so we create a unique name for each upload
    private String generateFileName(MultipartFile multiPart) {
        return new Date().getTime() + "-" + multiPart.getOriginalFilename().replace(" ", "_");
    }

    //Tiếp theo thêm phương thức uploadFileTos3bucket có chức năng upload file lên S3 bucket
    private void uploadFileTos3bucket(String fileName, File file, String folderName) {
        String source = bucketName + "/" + folderName;
        s3client.putObject(new PutObjectRequest(source, fileName, file).withCannedAcl(CannedAccessControlList.PublicRead));
    }

    // cho nay la bat dau upload file
    public String uploadFilewithFolder(MultipartFile multipartFile, String folderName) {

        String fileUrl = "";
        try {
            File file = convertMultiPartToFile(multipartFile);
            String fileName = generateFileName(multipartFile);
            if (fileName.length() > 20) {
                fileName = fileName.substring(fileName.length() - 20);
            }
            fileUrl = endpointUrl + "/" + folderName + "/" + fileName;
            uploadFileTos3bucket(fileName, file, folderName);
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileUrl;
    }

    // neu chua co folder
    public String uploadFileTos3bucketIfNotExits(MultipartFile multipartFile, String folderName) {
        String fileUrl = "";
        boolean doesItExists = s3client.doesObjectExist(bucketName, folderName + "/" + multipartFile.getOriginalFilename());
        if (doesItExists = false) {
            System.out.println("File already exists");
        } else {
            try {
                File file = convertMultiPartToFile(multipartFile);
                String fileName = generateFileName(multipartFile);
                fileUrl = endpointUrl + "/" + folderName + "/" + fileName;
                uploadFileTos3bucket(fileName, file, folderName);
                file.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return fileUrl;
    }

    public String deleteFileFromS3BucketInFolder(String fileUrl, String folderName) {
        System.out.println("delete file: " + fileUrl);
        System.out.println("folder: " + this.bucketName + "/" + folderName);
        s3client.deleteObject(this.bucketName + "/" + folderName + "/", fileUrl.replace(this.endpointUrl + "/", ""));
        return "Delete success!";
    }

    public String deleteObjectFromBucket (String bucketName, String keyName){
        System.out.println(bucketName);
        try {
//            Regions clientRegion = Regions.DEFAULT_REGION;
//            AmazonS3 s3client = AmazonS3ClientBuilder.standard()
//                    .withCredentials(new ProfileCredentialsProvider())
//                    .withRegion(clientRegion)
//                    .build();
            s3client.deleteObject(new DeleteObjectRequest(bucketName, keyName));
            return ("okie");
        } catch (AmazonServiceException e) {
            // The call was transmitted successfully, but Amazon S3 couldn't process
            // it, so it returned an error response.
            e.printStackTrace();
            return ("an lz tap 1");
        } catch (SdkClientException e) {
            // Amazon S3 couldn't be contacted for a response, or the client
            // couldn't parse the response from Amazon S3.
            e.printStackTrace();
            return ("an lz tap 2");
        }
    }


}