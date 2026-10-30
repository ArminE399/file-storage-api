package com.WOH.file_storage_api.DTO;
/*this class is a data transfer object it's role is to hold data from s3
and transfer the data into the frontend portion part of the app as a list in table


*/
import java.time.Instant;
public record FileInfo(String key,String fileName,Long sizeByte,Instant lastModified,String contentType) {


}
