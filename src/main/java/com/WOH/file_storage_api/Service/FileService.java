package com.WOH.file_storage_api.Service;
/*Storage Service will handle crud operations and will make requests to S3 and will also handel business rules */ 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.s3.S3Client;

import java.util.List;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Request;
import com.WOH.file_storage_api.DTO.FileInfo;
//DTO.fileInfo;
@Service
public class FileService {
private final S3Client s3Client;
private final String bucketName;
 
 public FileService(S3Client S3Client, @Value("${s3.bucket}") String bucketName){
    this.s3Client=S3Client;

    this.bucketName=bucketName;

 }   

//lists all the objects we have in our bucket
 public List<FileInfo> listFiles(){
   //prepares a requst to aws s3 by creating an object
ListObjectsV2Request request = ListObjectsV2Request.builder().bucket(bucketName).build();

/*sends a request to s3 and asks for one page of objects it also populates/converts the objects into File Info objects and returns them */
return s3Client.listObjectsV2(request).contents().stream().map(object->new FileInfo(object.key(),object.size(),object.lastModified())).toList();
 }


 public void upload(){

 }




}
