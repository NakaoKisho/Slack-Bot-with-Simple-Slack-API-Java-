package bot;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public class Identifier { //messageContent�̒��g��F������������N���X
	
	private String content;
	private SlackChannel channel;
	
	public Identifier(String content, SlackChannel channel) { //�R���X�g���N�^
		this.content = content.replaceAll("[<@UP83M6ATD>]", "");
		this.channel = channel;
	}
	
	public void identifier(SlackSession session) { //���g��F������������N���X
		Greeting gr = new Greeting(); //Greeting�N���X�̐���
		List<String> greeting =gr.Greetings();  //Greeting�N���X��Greetings���\�b�h����
		Iterator<String> itFgr = greeting.iterator(); //iterator�𐶐�
		while(itFgr.hasNext()) {
			String e = itFgr.next();
			if(content.contains(e)) {  //�R�����g���e��Greeting���\�b�h�̒��g�ƈ�v���Ă�����true
				session.sendMessage(channel, "����ɂ��́I�I"); //�ԐM�R�����g��List�Ɋi�[���āA�����_�������𐶐��B���̐�����get(int)�Ŏ��o��
				break; //���ʂɉ񂳂Ȃ��悤�~�߂�
			}
		}
	  Weather we = new Weather();
	  List<String> WeatherPhrase =we.WeatherPhrase();  //Weather�N���X��WeatherPhrase���\�b�h����
		Iterator<String> itFwp = WeatherPhrase.iterator(); //iterator�𐶐�
		while(itFwp.hasNext()) {
			String e = itFwp.next();
			if(content.contains(e)) {  //�R�����g���e��WeatherPhrase���\�b�h�̒��g�ƈ�v���Ă�����true
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
				break; //���ʂɉ񂳂Ȃ��悤�~�߂�
			}
		}
	}
}
