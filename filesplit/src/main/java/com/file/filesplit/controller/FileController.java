package com.file.filesplit.controller;

import com.file.filesplit.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/file")
public class FileController
{
    @Autowired
    FileService fileService;  //Create Object for FileService using Autowired annotation.

    @PostMapping("/random/{id}")
    public ResponseEntity<String> generateRandomText(@PathVariable int id){  //This method calls the service method to generate the Random text file based on input.
        String fileName = fileService.generateRandomText(id);
        return ResponseEntity.ok("Successfully created Random texts in your File and file name is - " + fileName);
    }

    @PostMapping("/split/{filePath}")
    public ResponseEntity<String> splitFiles(@PathVariable String filePath){
        fileService.splitFiles(filePath);
        return ResponseEntity.ok("Successfully split the files based on input !");
    }
}
