package com.file.filesplit.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class FileService
{
    int TotalRows;

    public String generateRandomText(int id)
    {
        int noOfRows = 1000000;   //Default 1 Million rows and if id is greater than 0 and lesser than or equal to 5 means multiple with this id.
        if(id > 0 && id < 5)
            noOfRows = id * noOfRows;
        TotalRows = noOfRows;

        String fileName = "mainFile.txt";

        String file_path = "E:\\Projects\\filesplit\\files\\" + fileName;
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_path))){
            for(int i = 1; i <= noOfRows; i++)
            {
                String randomString = ""+i;   //Generate a random text.
                bufferedWriter.write(randomString);  //write the random text in file.
                bufferedWriter.newLine();  //moves to the next row.
            }
            System.out.println("Random text created in this given file");
        } catch (IOException e) {   throw new RuntimeException(e);  }
        return fileName + " and File path here - " + file_path;
    }

    public void splitFiles(String filepath){
        int No_Of_Rows = TotalRows / 50;
        ExecutorService executorService = Executors.newFixedThreadPool(12);
        for(int m = 0; m < 50; m++){
            int rows = m * No_Of_Rows;
            int finalM = m;
            String readPath = "E:\\Projects\\filesplit\\files\\" + filepath;
            executorService.submit( ()->{
                String fileName = (finalM+1) +".txt";
                String Path = "E:\\Projects\\filesplit\\files\\" + fileName;
                try{
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(readPath));
                    for(int i = 0; i < rows; i++)  //skips the rows.
                        bufferedReader.readLine();

                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Path));
                    for(int i = 0; i < No_Of_Rows; i++) {
                        bufferedWriter.write(bufferedReader.readLine());
                        bufferedWriter.newLine();
                    }

                    bufferedReader.close();
                    bufferedWriter.close();
                }
                catch (Exception exception){
                    System.out.println("Error");
                }
            });
        }
        executorService.shutdown();
    }
}
