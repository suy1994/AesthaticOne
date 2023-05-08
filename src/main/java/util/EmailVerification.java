package util;

/**
 * Created by Mayur on 20/04/18.
 */

import javax.mail.*;
import javax.mail.search.SubjectTerm;
import java.io.IOException;
import java.util.Properties;

public class EmailVerification
{
    private boolean textIsHtml = false;
    String URL;
    /**
     * Return the primary text content of the message.
     */
    private String getSourceText(Part p) throws MessagingException,IOException {

        System.out.println("Content Type Is -"+p.getContentType());

        if (p.isMimeType("text/html"))
        {
            //System.out.println("TYPE-text/html");
            String s = (String)p.getContent();
            textIsHtml = p.isMimeType("text/html");
            return s;
        }

        if (p.isMimeType("multipart/alternative"))
        {
            //System.out.println("TYPE-multipart/alternative");
            // prefer html text over plain text
            Multipart mp = (Multipart)p.getContent();
            String text = null;
            for (int i = 0; i < mp.getCount(); i++)
            {
                Part bp = mp.getBodyPart(i);
                if (bp.isMimeType("text/plain"))
                {
                    //System.out.println("SUB TYPE-text/plain");
                    if (text == null)
                        text = getSourceText(bp);
                    continue;
                }
                else if (bp.isMimeType("text/html"))
                {
                    //System.out.println("SUB TYPE-text/html");
                    String s = getSourceText(bp);
                    if (s != null)
                        return s;
                }
                else
                {
                    return getSourceText(bp);
                }
            }
            return text;
        }
        else if (p.isMimeType("multipart"))
        {
            //System.out.println("TYPE-multipart");
            Multipart mp = (Multipart)p.getContent();
            for (int i = 0; i < mp.getCount(); i++)
            {
                String s = getSourceText(mp.getBodyPart(i));
                if (s != null)
                    return s;
            }
        }
        return null;
    }

    public  String getMailData(String foldername, String subjectName, String username, String password) throws Exception {
        //Multipart_Sample m=new Multipart_Sample();
        Properties props = System.getProperties();

        props.setProperty("mail.store.protocol", "imaps");

        Session session = Session.getDefaultInstance(props, null);
        Store store = session.getStore("imaps");
        store.connect("imap.gmail.com", username,password);

        Folder folder = store.getFolder(foldername);
        folder.open(Folder.READ_WRITE);

        System.out.println("Total Message:" + folder.getMessageCount());
        System.out.println("Unread Message:"
                + folder.getUnreadMessageCount());

        Message[] messages = null;
        boolean isMailFound = false;
        Message mailFromGod= null;

        //Search for mail from God
        for (int i = 0;i<5;i++) {
            messages = folder.search(new SubjectTerm(subjectName),folder.getMessages());
            //System.out.println("message -"+messages.toString());
            //Wait for 10 seconds
            if (messages.length == 0) {
                Thread.sleep(2000);
            }
        }

        //Search for unread mail from God
        //This is to avoid using the mail for which
        //Registration is already done
        for (Message mail : messages) {
            if (mail.isSet(Flags.Flag.SEEN)) {
                mailFromGod = mail;
                System.out.println("Message Count is: "+ mailFromGod.getMessageNumber());
                //System.out.println(""+mailFromGod.isMimeType("text/html"));
                isMailFound = true;
            }
        }

        // System.out.println("from get "+m.getText(mailFromGod));

        //Test fails if no unread mail was found from God
        if (!isMailFound) {
            throw new Exception(
                    "Could not find new mail from Inbox :-(");
            //Read the content of mail and launch registration URL
        } else {
            //System.out.println("Data "+m.getText(mailFromGod));
            String s=getSourceText(mailFromGod);
            int startindex=s.indexOf("Go To");
            int endindex=s.indexOf("Lead",startindex);
            String URL=s.substring(startindex,endindex);
            System.out.println("");
            System.out.println(URL);
        }
        return URL;
    }
    public  String getMailData1(String foldername, String subjectName, String username, String password) throws Exception {
        //Multipart_Sample m=new Multipart_Sample();
        Properties props = System.getProperties();

        props.setProperty("mail.store.protocol", "imaps");

        Session session = Session.getDefaultInstance(props, null);
        Store store = session.getStore("imaps");
        store.connect("imap.gmail.com", username,password);

        Folder folder = store.getFolder(foldername);
        folder.open(Folder.READ_WRITE);

        System.out.println("Total Message:" + folder.getMessageCount());
        System.out.println("Unread Message:"
                + folder.getUnreadMessageCount());

        Message[] messages = null;
        boolean isMailFound = false;
        Message mailFromGod= null;

        //Search for mail from God
        for (int i = 0;i<5;i++) {
            messages = folder.search(new SubjectTerm(subjectName),folder.getMessages());
            //System.out.println("message -"+messages.toString());
            //Wait for 10 seconds
            if (messages.length == 0) {
                Thread.sleep(2000);
            }
        }

        //Search for unread mail from God
        //This is to avoid using the mail for which
        //Registration is already done
        for (Message mail : messages) {
            if (mail.isSet(Flags.Flag.SEEN)) {
                mailFromGod = mail;
                System.out.println("Message Count is: "+ mailFromGod.getMessageNumber());
                //System.out.println(""+mailFromGod.isMimeType("text/html"));
                isMailFound = true;
            }
        }

        // System.out.println("from get "+m.getText(mailFromGod));

        //Test fails if no unread mail was found from God
        if (!isMailFound) {
            throw new Exception(
                    "Could not find new mail from Inbox :-(");
            //Read the content of mail and launch registration URL
        } else {
            //System.out.println("Data "+m.getText(mailFromGod));
            String s=getSourceText(mailFromGod);
            int startindex=s.indexOf("Go To");
            int endindex=s.indexOf("Lead",startindex);
            String URL=s.substring(startindex,endindex);
            System.out.println("");
            System.out.println(URL);
        }
        return URL;
    }

}
