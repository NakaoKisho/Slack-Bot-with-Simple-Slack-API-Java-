package bot;

import java.util.HashMap;
import java.util.Map;

import com.ullink.slack.simpleslackapi.SlackChannel;

public class City {

private SlackChannel channel;
	
	public City(SlackChannel channel) {
		this.channel = channel;
	}
	
	public Map<String, String> City() {
		Map<String, String> City = new HashMap<String, String>(); //ArrayListを生成
		//DoHoku
		City.put("稚内", "011000");
		City.put("旭川", "012010");
		City.put("留萌", "012020");
		//DoTou
		City.put("網走", "013010");
		City.put("北見", "013020");
		City.put("紋別", "013030");
		City.put("根室", "014020");
		City.put("帯広", "014030");
		//DoNan
		City.put("室蘭", "015010");
		City.put("浦河", "015020");
		//DoOu
		City.put("札幌", "016010");
		City.put("岩見沢", "016020");
		City.put("倶知安", "016030");
		//DoNan
		City.put("函館", "017010");
		City.put("江差", "017020");
		//Aomori
		City.put("青森", "020010");
		City.put("むつ", "020020");
		City.put("八戸", "020030");
		//Iwate
		City.put("盛岡", "030010");
		City.put("宮古", "030020");
		City.put("大船渡", "030030");
		//Miyagi
		City.put("仙台", "040010");
		City.put("白石", "040020");
		//Akita
		City.put("秋田", "050010");
		City.put("横手", "050020");
		//Yamagata
		City.put("山形", "060010");
		City.put("米沢", "060020");
		City.put("酒田", "060030");
		City.put("新庄", "060040");
		//Fukushima
		City.put("福島", "070010");
		City.put("米名浜", "070020");
		City.put("若松", "070030");
		//Ibaragi
		City.put("水戸", "080010");
		City.put("土浦", "080020");
		//Tochigi
		City.put("宇都宮", "090010");
		City.put("大田原", "090020");
		//Gunma
		City.put("前橋", "100010");
		City.put("みなかみ", "1000020");
		//Saitama
		City.put("さいたま", "110010");
		City.put("熊谷", "110020");
		City.put("秩父", "110030");
		//Chiba
		City.put("千葉", "120010");
		City.put("銚子", "120020");
		City.put("館山", "120030");
		//Tokyo
		City.put("東京", "130010");
		City.put("大島", "130020");
		City.put("八丈島", "130030");
		City.put("父島", "130040");
		//Kanagawa
		City.put("横浜", "140010");
		City.put("小田原", "140020");
		//Niigata
		City.put("新潟", "150010");
		City.put("長岡", "150020");
		City.put("高田", "150030");
		City.put("相川", "150040");
		//Toyama
		City.put("富山", "160010");
		City.put("伏木", "160020");
		//Ishikawa
		City.put("金沢", "170010");
		City.put("輪島", "170020");
		//Fukui
		City.put("福井", "180010");
		City.put("敦賀", "180020");
		//Yamanashi
		City.put("甲府", "190010");
		City.put("河口湖", "190020");
		//Nagano
		City.put("長野", "200010");
		City.put("松本", "200020");
		City.put("飯田", "200030");
		//Gifu
		City.put("岐阜", "210010");
		City.put("高山", "210020");
		//Shizuoka
		City.put("静岡", "220010");
		City.put("横代", "220020");
		City.put("三島", "220030");
		City.put("浜松", "220040");
		//Aichi
		City.put("名古屋", "230010");
		City.put("豊橋", "230020");
		//Mie
		City.put("津", "240010");
		City.put("尾鷲", "240020");
		//Shiga
		City.put("大津", "250010");
		City.put("彦根", "250020");
		//Kyoto
		City.put("京都", "260010");
		City.put("舞鶴", "260020");
		//Osaka
		City.put("大阪", "270000");
		//Hyogo
		City.put("神戸", "280010");
		City.put("富岡", "280020");
		//Nara
		City.put("奈良", "290010");
		City.put("風屋", "290020");
		 //Wakayama
		City.put("和歌山", "300010");
		City.put("潮岬", "300020");
		//Tottori
		City.put("鳥取", "310010");
		City.put("米子", "310020");
		//Shimane
		City.put("松江", "320010");
		City.put("浜田", "320020");
		City.put("西郷", "320030");
		//Okayama
		City.put("岡山", "330010");
		City.put("津山", "330020");
		//Hiroshima
		City.put("広島", "340010");
		City.put("庄原", "340020");
		//Yamaguchi
		City.put("下関", "350010");
		City.put("山口", "350020");
		City.put("柳井", "350030");
		City.put("萩", "350040");
		//Tokushima
		City.put("徳島", "360010");
		City.put("日和佐", "360020");
		//Kagawa
		City.put("高松", "370000");
		//Ehime
		City.put("松山", "380010");
		City.put("新居浜", "380020");
		City.put("宇和島", "380030");
		//Kouchi
		City.put("高知", "390010");
		City.put("室戸岬", "390020");
		City.put("清水", "390030");
		//Fukuoka
		City.put("福岡", "400010");
		City.put("八幡", "400020");
		City.put("飯塚", "400030");
		City.put("久留米", "400040");
		//Saga
		City.put("佐賀", "410010");
		City.put("伊万里", "410020");
		//Nagasaki
		City.put("長崎", "420010");
		City.put("佐世保", "420020");
		City.put("厳原", "420030");
		City.put("福江", "420040");
		//Kumamoto
		City.put("熊本", "430010");
		City.put("阿蘇乙姫", "430020");
		City.put("牛深", "430030");
		City.put("人吉", "430040");
		//Oita
		City.put("大分", "440010");
		City.put("中津", "440020");
		City.put("日田", "440030");
		City.put("佐伯", "440040");
		//Miyazaki
		City.put("宮崎", "450010");
		City.put("延岡", "450020");
		City.put("都城", "450030");
		City.put("高千穂", "450040");
		//Kagoshima
		City.put("鹿児島", "460010");
		City.put("鹿屋", "460020");
		City.put("種子島", "460030");
		City.put("名瀬", "460040");
		//Okinawa
		City.put("那覇", "471010");
		City.put("名護", "471020");
		City.put("久米島", "471030");
		City.put("南大東", "472000");
		City.put("宮古島", "473000");
		City.put("石垣島", "474010");
		City.put("与那国島", "474020");
		return (City);
		}
}
