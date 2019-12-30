package bot;

import java.io.IOException;

import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;


public class Main {
	public static void main(String[] args) throws IOException {
		SlackSession session = SlackSessionFactory.createWebSocketSlackSession("xoxb-427362873652-874461681891-JTsZTsKlcILS7BbK23hhd5FX");
		ListeningToMessageEvents ltme = new ListeningToMessageEvents();
		ltme.registeringAListener(session);
		session.connect();
		
	}
}

/*対応予定内容*/
//googleカレンダーとの連携
//天気
//所在確認(本社にいるか)