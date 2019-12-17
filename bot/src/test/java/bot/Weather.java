package bot;

import java.util.ArrayList;
import java.util.List;

public class Weather {
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
}
