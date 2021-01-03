package org.zerock;

import org.zerock.mail.MailConfig;
import org.zerock.mail.MailSender;
import org.zerock.mail.MessageVO;

public class Main {

    public static void main(String[] args) {

        MailConfig mailConfig = new MailConfig("이메일@gmail.com","password");

        MailSender mailSender = new MailSender(mailConfig);
        
        MessageVO vo = new MessageVO("cookie_00@naver.com","Test메일 전송","Test 메일의 내용입니다.");

        boolean result = mailSender.sendMail(vo);
        
        System.out.println("result" + result);

    }
}
