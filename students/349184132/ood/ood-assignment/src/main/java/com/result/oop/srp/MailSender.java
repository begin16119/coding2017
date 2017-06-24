package com.result.oop.srp;

/**
 * Created by wang on 2017/6/24.
 */
public class MailSender {

    private String fromAddress;
    private String smtpHost;
    private String altSmtpHost;

    public MailSender(Configuration config){
        this.fromAddress = config.getProperty(ConfigurationKeys.EMAIL_ADMIN);
        this.smtpHost = config.getProperty(ConfigurationKeys.SMTP_SERVER);
        this.altSmtpHost = config.getProperty(ConfigurationKeys.ALT_SMTP_SERVER);
    }


    public void sendMail(Mail mail){
        try{
            sendMail(mail,this.smtpHost);
        }catch (Exception e){
            try{
                sendMail(mail,this.altSmtpHost);
            }catch (Exception ex){
                System.out.println("通过备用 SMTP服务器发送邮件失败: " + ex.getMessage());
            }
        }
    }

    public void sendMail(Mail mail,String smtpHost){
        String toAddress = mail.getAddress();
        String subject = mail.getSubject();
        String msg = mail.getBody();

        StringBuilder builder = new StringBuilder();
        builder.append("From:").append(fromAddress).append("\n");
        builder.append("To:").append(toAddress).append("\n");
        builder.append("Subject:").append(subject).append("\n");
        builder.append("Contend:").append(msg).append("\n");

        System.out.println(builder.toString());

    }

}
