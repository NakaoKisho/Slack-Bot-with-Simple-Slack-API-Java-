package bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;


public class Greeting {
	private SlackChannel channel;
	
	public Greeting(SlackChannel channel) {
		this.channel = channel;
	}
	
	public List<String> Greetings() {
	List<String> Greeting = new ArrayList<String>();
	Greeting.add("やあ");
	Greeting.add("よう");
	Greeting.add("おう");
	Greeting.add("Hi");
	return (Greeting); 
	}
	public List<String> MorningGreetings() {
		List<String> MG = new ArrayList<String>();
		MG.add("おはよう");
		MG.add("Good Morning");
		MG.add("Hello");
		return (MG);
	}
	public List<String> NoonGreetings() {
		List<String> NG = new ArrayList<String>();
		NG.add("こんにちは");
		NG.add("Good Afternoon");
		NG.add("Hello");
		return (NG);
	}
	public List<String> EveningGreetings() {
		List<String> EG = new ArrayList<String>();
		EG.add("こんばんは");
		EG.add("Good Evening");
		return (EG);
	}
	public void GreetingResponse(SlackSession session) {
		Random random = new Random();
		int randomValue = random.nextInt(Greetings().size());
		session.sendMessage(this.channel, Greetings().get(randomValue));
	}
	public void MorningGreetingResponse(SlackSession session) {
		Random random = new Random();
		int randomValue = random.nextInt(MorningGreetings().size());
		session.sendMessage(this.channel, MorningGreetings().get(randomValue));
	}
	public void NoonGreetingResponse(SlackSession session) {
		Random random = new Random();
		int randomValue = random.nextInt(NoonGreetings().size());
		session.sendMessage(this.channel, NoonGreetings().get(randomValue));
	}
	public void EveningGreetingResponse(SlackSession session) {
		Random random = new Random();
		int randomValue = random.nextInt(EveningGreetings().size());
		session.sendMessage(this.channel, EveningGreetings().get(randomValue));
	}
}
