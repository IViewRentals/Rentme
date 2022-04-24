package com.example.rentsummary.server.impl;

import com.example.rentsummary.server.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.UnsupportedEncodingException;

/**
 * @description: 邮件处理类
 * @author: luohanye
 * @create: 2019-04-19
 **/
@Service
public class MailServiceImpl implements MailService {
    @Autowired
    JavaMailSenderImpl mailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendMimeMail(String to, String subject, String content) {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(new InternetAddress(from, "RentMe", "UTF-8"));
            helper.setSubject(subject);
            helper.setTo(to);
            helper.setText(content, true);
            mailSender.send(message);
            //日志信息
            System.out.println("邮件已经发送。");
        } catch (MessagingException e) {
            System.out.println("发送邮件时发生异常！" + e);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId) {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = null;

        try{
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(new InternetAddress(from, "RentMe", "UTF-8"));
            helper.setSubject(subject);
            helper.setTo(to);
            helper.setText(content, true);

            FileSystemResource fs = new FileSystemResource(new File(rscPath));
            helper.addInline(rscId, fs);

            mailSender.send(message);
        }catch (MessagingException e) {
            System.out.println("发送邮件时发生异常！" + e);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}