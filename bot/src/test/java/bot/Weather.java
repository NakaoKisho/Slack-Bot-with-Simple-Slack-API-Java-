package bot;

import java.util.ArrayList;
import java.util.List;

public class Weather {
	public List<String> WeatherPhrase() {
		List<String> WeatherPhrase = new ArrayList<String>(); //ArrayList�𐶐�
		//�V�C�t���[�Y�ǉ�
		WeatherPhrase.add("�V�C");
		WeatherPhrase.add("�V�C�ɂ��ċ�����");
		WeatherPhrase.add("�V�C�m�肽��");
		WeatherPhrase.add("weather");
		WeatherPhrase.add("�V�C�\��");
		WeatherPhrase.add("�����̓V�C");
		WeatherPhrase.add("�J�ӂ�");
		WeatherPhrase.add("�����");
		WeatherPhrase.add("�܂�");
		//��L�̈��A���R�����g�����ƕԐM�ł���
		return (WeatherPhrase); //���̃N���X���Ăяo����"return"������̓��e��Ԃ��B���̏ꍇ��Weather�z����̕�����Ԃ�
		}
}
