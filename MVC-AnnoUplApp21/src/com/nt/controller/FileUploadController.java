package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.nt.command.FileUploadForm;

@Controller
public class FileUploadController {

	@RequestMapping(value = "/home.htm", 
			                              method = RequestMethod.GET)
	public String displayForm(Model model) {
		return "file_upload_form"; //returns the page name to ViewResolver ultimately
	}

	@RequestMapping(value = "/save.htm", method = RequestMethod.POST)
	public String upload(Model map,@ModelAttribute("uploadForm") FileUploadForm cmd) {
		
       File dir=new File("E:/springfileuploads/");
		//get Uploaded file
		MultipartFile file = cmd.getFile();

		String fileName = "";
		if (file != null) {
			fileName = file.getOriginalFilename();
			
			System.out.println("orginal file name="+fileName);
			
			//Handle file content - multipartFile.getInputStream()
			InputStream inputStream=null;
			OutputStream outputStream;
			try {  
				   inputStream = file.getInputStream();  
				   //If file is not present then only create a file and write the data into them
				   if(!dir.exists()){
					   dir.mkdir();  
					  }
				   File newFile = new File("E:/springfileUploads/"+fileName);
				outputStream = new FileOutputStream(newFile);
				
				   int read = 0;
					byte[] buffer = new byte[1024];

					while ((read = inputStream.read(buffer)) != -1) {
						
						outputStream.write(buffer, 0, read);
					}
					outputStream.close();
					inputStream.close();
				
			} catch (IOException e) {
					System.out.println("Exception "+e);
			} 
						
		}
			

		map.addAttribute("files", fileName);
		return "file_upload_success";
	}

}
