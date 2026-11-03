package com.WOH.file_storage_api.Controller;

import org.springframework.web.bind.annotation.RestController;
import com.WOH.file_storage_api.DTO.FileInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.WOH.file_storage_api.Service.FileService;
import java.util.List;
@RestController //tells spring that this class is an endpoint and that it should return in Json format
@RequestMapping("/files")//creates a common path for the endpoints
public class FileController {
    private final FileService fileService;
    public FileController(FileService fileService){
        this.fileService=fileService;
    }

@GetMapping //get request
// we get the get request and return the list of fileinfo objects to display in the frontend
public List<FileInfo> getList(){ 
    return fileService.listFiles();

}


}
