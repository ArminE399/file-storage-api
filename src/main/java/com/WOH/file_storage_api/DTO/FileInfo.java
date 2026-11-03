package com.WOH.file_storage_api.DTO;
/*this class is a data transfer object it's role is to hold data from s3
and transfer the data into the frontend portion part of the app as a list in table

S3 stores and returns key,sizeByte and lastModified automatically as metadata if we want it to store more metadata
we have to provide it as custom metadata. When we want to retrieve the custom metadata we need to call additional requests
which adds network time and billable requests. 
*/
import java.time.Instant;
public record FileInfo(String key,Long sizeByte,Instant lastModified) {


}
