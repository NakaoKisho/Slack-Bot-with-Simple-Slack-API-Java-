package molersBot;

import java.util.Iterator;
import java.util.List;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public class Identifier { //messageContentの中身を認識し応答するクラス
	
	private String content;
	private SlackChannel channel;
	
	public Identifier(String content, SlackChannel channel) { //コンストラクタ
		this.content = content;
		this.channel = channel;
	}
	public void identifier(SlackSession session) { //中身を認識し応答するクラス
		Greeting gr = new Greeting(); //Greetingクラスの生成
		List<String> greeting =gr.Greetings();  //GreetingクラスのGreetingsメソッドを代入
		Iterator<String> it = greeting.iterator(); //iteratorを生成
		while(it.hasNext()) {
			String e = it.next();
			if(content.contains(e)) {  //コメント内容がGreetingメソッドの中身と一致していたらtrue
				session.sendMessage(channel, "こんにちは！！"); //返信コメントを送信
				break; //無駄に回さないよう止める
			}
		}
	}
}
