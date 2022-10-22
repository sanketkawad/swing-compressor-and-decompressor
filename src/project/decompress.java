/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author sanket kawad
 */
public class decompress {
     public static void method(File file) throws IOException
    {
        String fileDirectory = file.getParent();
        System.out.println(fileDirectory);
        
        
         FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/decompress.txt");
        
        GZIPInputStream gzipOS = new GZIPInputStream(fis);
        
        byte[] buffer = new byte[1024];
        
        int len ;      
                 
        while((len = fis.read(buffer)) != -1){
        System.out.println(len);
          fos.write(buffer,0,len);
        }
        
        gzipOS.close();
        fos.close();
        fis.close();
    }   
     
         public static void main(String[] args) throws IOException
    {
       File path = new File("C:\\Users\\sanket kawad\\Documents\\NetBeansProjects\\compressorDecompressor\\src\\project\\compressedfile.gz");
       method(path);
    }
}
