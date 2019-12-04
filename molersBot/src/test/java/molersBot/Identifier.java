package molersBot;

import java.util.Iterator;
import java.util.List;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public class Identifier { //messageContent�̒��g��F������������N���X
	
	private String content;
	private SlackChannel channel;
	
	public Identifier(String content, SlackChannel channel) { //�R���X�g���N�^
		this.content = content;
		this.channel = channel;
	}
	public void identifier(SlackSession session) { //���g��F������������N���X
		Greeting gr = new Greeting(); //Greeting�N���X�̐���
		List<String> greeting =gr.Greetings();  //Greeting�N���X��Greetings���\�b�h����
		Iterator<String> it = greeting.iterator(); //iterator�𐶐�
		while(it.hasNext()) {
			String e = it.next();
			if(content.contains(e)) {  //�R�����g���e��Greeting���\�b�h�̒��g�ƈ�v���Ă�����true
				session.sendMessage(channel, "����ɂ��́I�I"); //�ԐM�R�����g�𑗐M
				break; //���ʂɉ񂳂Ȃ��悤�~�߂�
			}
		}
	}
}
