package bot;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;

public class ListeningToMessageEvents {
	//繝輔ぅ繝ｼ繝ｫ繝�
	private String content;
	private String botName = "@UP83M6ATD"; //繝懊ャ繝亥錐(荳ｭ蟆ｾ蜻ｽ蜷�)繧剃ｻ｣蜈･
	private String pattern = ("[\\n]|[\\r]|[\\t]");//繝懊ャ繝亥錐縺ｨ繧ｿ繝悶�∵隼陦後ｒ豁｣隕剰｡ｨ迴ｾ縺ｧ陦ｨ縺嶺ｻ｣蜈･
	
	public void registeringAListener(SlackSession session)
    {
        // first define the listener
        SlackMessagePostedListener messagePostedListener = new SlackMessagePostedListener()
        {
            public void onEvent(SlackMessagePosted event, SlackSession session)
            {
            	SlackChannel channel = event.getChannel();
            	String messageContent = event.getMessageContent();
            	content = messageContent.replaceAll(pattern,"").trim();
            	Identifier id = new Identifier(content, channel); //毎回生成されるのでif分内に入れてもよいかもしれない
            	
            	//メンションされれば別にどのチャンネルで反応してもよい
            	if(content.contains(botName) && !(event.getSender().getId().contentEquals("UP83M6ATD"))) {
            		id.identifier(session);
            	} else if(event.getChannel().getId().equals("DP83M6BK5") && !(event.getSender().getId().contentEquals("UP83M6ATD"))) { 
            		id.identifier(session);
            	}
            }
        };
        //add it to the session
        session.addMessagePostedListener(messagePostedListener);
    }
}

//System.out.println("-------------------------");