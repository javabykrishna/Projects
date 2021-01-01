package com.balasoft;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUtil {
	@Autowired
	private JavaMailSender mailsender;

	public boolean send(String to, String subject, String text, FileSystemResource file) {
		boolean flag = false;

		try {
			// create Mimemessage Object
			MimeMessage message = mailsender.createMimeMessage();
			// helper class object
			MimeMessageHelper helper = new MimeMessageHelper(message, file != null ? true : false);
			// set details
			helper.setTo("raagulakiran@gmail.com");
			helper.setFrom("nagapuribalakrishna94@gmail.com");
			helper.setSubject("good morning....");
			helper.setText("Hello");
			if (file != null) {
				helper.addAttachment(file.getFilename(), file);
				mailsender.send(message);
				flag = true;
			}
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();

		}

		return flag;
	}

}
