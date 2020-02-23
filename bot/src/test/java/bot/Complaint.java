package bot;

import java.util.ArrayList;
import java.util.List;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public class Complaint {
private SlackChannel channel;
	
	public Complaint(SlackChannel channel) {
		this.channel = channel;
	}
	
	public List<String> ComplaintPhrase() {
		List<String> ComplaintPhrase = new ArrayList<String>();
		ComplaintPhrase.add("ちょっときいて");
		return (ComplaintPhrase);
		}
	public void ComplaintResponse(SlackSession session) {
		session.sendMessage(this.channel, "ご要望ありがとうございます!");
	}
}
