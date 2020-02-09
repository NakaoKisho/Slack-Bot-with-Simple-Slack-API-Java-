package bot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;

public class ListeningToMessageEvents {
	//受け取ったメッセージのふるい分け
	private String content;
	private String botName = "@UP83M6ATD"; //ボット番号
	private String pattern = ("[\\n]|[\\r]|[\\t]");//空白・段落・！・？を消去
	
	public void registeringAListener(SlackSession session)
    {
        // first define the listener
        SlackMessagePostedListener messagePostedListener = new SlackMessagePostedListener(){
            public void onEvent(SlackMessagePosted event, SlackSession session){
            	SlackChannel channel = event.getChannel();
            	String messageContent = event.getMessageContent();
            	content = messageContent.replaceAll(pattern,"").trim();
            	Identifier id = new Identifier(content, channel);
            	
            	if(!(event.getSender().getUserName().equals("molersbot"))&&!(content.contains("ちょっときいて"))) {
            		try{
              		  File file = new File("C:\\Users\\kisho\\Documents\\MolersBot\\MeesageContents.txt");
              		  FileWriter filewriter = new FileWriter(file, true);
              		  String br = System.getProperty("line.separator");
              		  filewriter.write(br + "名前 : " + event.getSender().getUserName()+ br + " " + "内容 : " + content);
              		  filewriter.close();
              		}catch(IOException e){
              		  System.out.println(e);
              		}
            	}
            	
            	if(content.contains("ちょっときいて")) {
            		try{
                		  File file = new File("C:\\Users\\kisho\\Documents\\MolersBot\\ComplaintMeesageContents.txt");
                		  FileWriter filewriter = new FileWriter(file, true);
                		  String br = System.getProperty("line.separator");
                		  filewriter.write(br + "内容 : " + content);
                		  filewriter.close();
                		}catch(IOException e){
                		  System.out.println(e);
                		}
            	}
            	
            	//メンションされれば別にどのチャンネルで反応してもよい
            	if(content.contains(botName) && !(event.getSender().getUserName().equals("molersbot"))) {
            		id.identifier(session);
            	} else if(!(event.getSender().getUserName().equals(/*"UP83M6ATD"*/"molersbot"))) { 
            		id.identifier(session);
            	}
            }
        };
        //add it to the session
        session.addMessagePostedListener(messagePostedListener);
    }
}

//System.out.println("-------------------------");
/*event.getChannel().getId().equals("DP83M6BK5""DS3P9QUAK") && */
/*System.out.println("---------------------------"); 
System.out.println(event.getChannel());
System.out.println(event.getSender());
System.out.println(event.getSender().getUserName());
System.out.println("---------------------------");*/