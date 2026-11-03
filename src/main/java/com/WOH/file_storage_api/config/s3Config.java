package com.WOH.file_storage_api.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import org.springframework.beans.factory.annotation.Value;  
/*this class creates a s3client bean */ 
@Configuration 
public class s3Config {

    @Bean
    S3Client s3Client(@Value("${s3.region}") String region){
        return S3Client.builder().region(Region.of(region)).build();
    }



}


