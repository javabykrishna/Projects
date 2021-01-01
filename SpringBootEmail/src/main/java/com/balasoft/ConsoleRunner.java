package com.balasoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;
@Component
public class ConsoleRunner  implements CommandLineRunner{
	@Autowired
	private EmployeeUtil util;
	

	@Override
	public void run(String... args) throws Exception {
		FileSystemResource file=new FileSystemResource("C:\\Users\\nagap\\OneDrive\\Pictures\\Screenshots\\Screenshot (2).png");
		 boolean flag=util.send("nagapurikrishna789@gmail.com", "AA","hello", file);
		 if(flag)
		 {
			 System.out.println("sent");
		
		 }
		 else
		 {
			 System.out.println("check problems");
		 }
	}

}
