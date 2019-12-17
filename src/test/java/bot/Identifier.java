package bot;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public class Identifier { //messageContentの中身を認識し応答するクラス
	
	private String content;
	private SlackChannel channel;
	
	public Identifier(String content, SlackChannel channel) { //コンストラクタ
		this.content = content.replaceAll("[<@UP83M6ATD>]", "");
		this.channel = channel;
	}
	
	public void identifier(SlackSession session) { //中身を認識し応答するクラス
		Greeting gr = new Greeting(); //Greetingクラスの生成
		List<String> greeting =gr.Greetings();  //GreetingクラスのGreetingsメソッドを代入
		Iterator<String> itFgr = greeting.iterator(); //iteratorを生成
		while(itFgr.hasNext()) {
			String e = itFgr.next();
			if(content.contains(e)) {  //コメント内容がGreetingメソッドの中身と一致していたらtrue
				session.sendMessage(channel, "こんにちは！！"); //返信コメントもListに格納して、ランダム数字を生成。その数字をget(int)で取り出し
				break; //無駄に回さないよう止める
			}
		}
	  Weather we = new Weather();
	  List<String> WeatherPhrase =we.WeatherPhrase();  //WeatherクラスのWeatherPhraseメソッドを代入
		Iterator<String> itFwp = WeatherPhrase.iterator(); //iteratorを生成
		while(itFwp.hasNext()) {
			String e = itFwp.next();
			if(content.contains(e)) {  //コメント内容がWeatherPhraseメソッドの中身と一致していたらtrue
				GetWeatherByOkHttp gw = new GetWeatherByOkHttp();
				String weather;
				try {
					weather = gw.getWeatherByOkHttp();
					Gson gson = new Gson();
					WeatherEntity WeE = gson.fromJson(weather, WeatherEntity.class);
					session.sendMessage(channel, gson.toJson(WeE.getForecast().));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break; //無駄に回さないよう止める
			}
		}
	}
}
