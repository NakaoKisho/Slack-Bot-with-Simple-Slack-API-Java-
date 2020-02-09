package bot;

import java.util.Iterator;
import java.util.List;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public class Identifier { 
	
	private String content;
	private SlackChannel channel;
	
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}
	public void setChannel(SlackChannel channel) {
		this.channel = channel;
	}
	public SlackChannel getChannel() {
		return this.channel;
	}

	public Identifier(String content, SlackChannel channel) {
		this.content = content.replaceAll("[<@UP83M6ATD>]", "");
		this.channel = channel;
	}
	
	public void identifier(SlackSession session) { 
		Greeting gr = new Greeting(this.channel); 
		List<String> greeting =gr.Greetings(); 
		List<String> Mgreeting =gr.MorningGreetings(); 
		List<String> Ngreeting =gr.NoonGreetings(); 
		List<String> Egreeting =gr.EveningGreetings(); 
		Iterator<String> it1 = greeting.iterator();
		while(it1.hasNext()) {
			String e = it1.next();
			if(content.contains(e)) {  
				gr.GreetingResponse(session);
				break;
			}
		}
		Iterator<String> it2 = Mgreeting.iterator();
		while(it2.hasNext()) {
			String e = it2.next();
			if(content.contains(e)) {  
				gr.MorningGreetingResponse(session);
				break;
			}
		}
		Iterator<String> it3 = Ngreeting.iterator();
		while(it3.hasNext()) {
			String e = it3.next();
			if(content.contains(e)) {  
				gr.NoonGreetingResponse(session);
				break;
			}
		}
		Iterator<String> it4 = Egreeting.iterator();
		while(it4.hasNext()) {
			String e = it4.next();
			if(content.contains(e)) {  
				gr.EveningGreetingResponse(session);
				break;
			}
		}
	  Weather we = new Weather(this.channel);
	  List<String> WeatherPhrase =we.WeatherPhrase(); 
		Iterator<String> itFwp = WeatherPhrase.iterator();
		while(itFwp.hasNext()) {
			String e = itFwp.next();
			if(content.contains(e)) {
				we.WeatherResponse(session);
				break;
			}
		}
	 Complaint cpt = new Complaint(this.channel);
	 List<String> ComplaintPhrase = cpt.ComplaintPhrase();
	 Iterator<String> itCpt = ComplaintPhrase.iterator();
		while(itCpt.hasNext()) {
			String e = itCpt.next();
			if(content.contains(e)) {
				cpt.ComplaintResponse(session);
				break;
			}
		}
	}
}
