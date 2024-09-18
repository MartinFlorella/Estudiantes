
package com.Sistema.Estudiantes.Service;


import com.Sistema.Estudiantes.Model.EmailDetails;

 

public interface IEmailService {
    
     String sendSimpleMail(EmailDetails details);
 
    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
