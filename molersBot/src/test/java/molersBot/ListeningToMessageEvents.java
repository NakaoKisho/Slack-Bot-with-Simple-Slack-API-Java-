package molersBot;


import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;

public class ListeningToMessageEvents {
	//フィールド
	private String content;
	private String botName = "@UP83M6ATD"; //ボット名(中尾命名)を代入
	private String pattern = ("[<@UP83M6ATD>]|[\\n]|[\\r]|[\\t]");//ボット名とタブ、改行を正規表現で表し代入
	
	public void registeringAListener(SlackSession session)
    {
        // first define the listener
        SlackMessagePostedListener messagePostedListener = new SlackMessagePostedListener()
        {
            @Override
            public void onEvent(SlackMessagePosted event, SlackSession session)
            {
            	
            	SlackChannel channel = session.findChannelByName("molers専用botを作る"); //チャンネル名を取得し代入
            	
            	if (!channel.getId().equals(event.getChannel().getId())) { //上記のチャンネル名とコメントされたチャンネルが一致しないなら
                    return; //動作しない
                }
            	
                String messageContent = event.getMessageContent(); //コメント内容を取得
                
                if(messageContent.contains(botName)) { //コメント内容でメンション(@モラ男)されているなら
                	 content = messageContent.replaceAll(pattern,"").trim(); //上記の正規表現と一致している部分は消去し代入
                	Identifier id = new Identifier(content, channel); //Identifierクラスを生成しコントラクタに引き渡し
                	id.identifier(session); //Identifierクラスのidentifierメソッドを使用
                }
            }
        };
        //add it to the session
        session.addMessagePostedListener(messagePostedListener);
    }
}
