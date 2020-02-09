package bot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public class Weather {
	
	private SlackChannel channel;
	
	public Weather(SlackChannel channel) {
		this.channel = channel;
	}
	
	public List<String> WeatherPhrase() {
		List<String> WeatherPhrase = new ArrayList<String>(); //ArrayListを生成
		//天気フレーズ追加
		WeatherPhrase.add("天気");
		WeatherPhrase.add("天気について教えて");
		WeatherPhrase.add("天気知りたい");
		WeatherPhrase.add("weather");
		WeatherPhrase.add("天気予報");
		WeatherPhrase.add("今日の天気");
		WeatherPhrase.add("雨ふる");
		WeatherPhrase.add("晴れる");
		WeatherPhrase.add("曇る");
		//上記の挨拶をコメントされると返信できる
		return (WeatherPhrase); //このクラスを呼び出すと"return"から後ろの内容を返す。この場合はWeather配列内の文字を返す
		}
	public void WeatherResponse(SlackSession session) {
		GetWeatherByOkHttp gw = new GetWeatherByOkHttp();
		try {
			Gson gson = new Gson();
			WeatherEntity WeE = gson.fromJson(gw.getWeatherByOkHttp(), WeatherEntity.class);
			session.sendMessage(this.channel, "東京の今日の天気は" + gson.toJson(WeE.getForecasts().get(1).getTelop()) + "です" + "\n" + "最高気温 : " + gson.toJson(WeE.getForecasts().get(1).getTemperature().getMax().getCelsius()).replace("\"", "") + "度" + "\n" + "最低気温 : " +  gson.toJson(WeE.getForecasts().get(1).getTemperature().getMin().getCelsius()).replace("\"", "") + "度");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
