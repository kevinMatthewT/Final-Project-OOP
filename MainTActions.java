package Final-Project-OOP;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class MainTActions {
	public static void main(String[] args) throws LoginException{
		//code for connecting to the bot address
		JDABuilder Turbot = JDABuilder.createDefault("Token");
		
		//shows the visuals of bot current activity
		Turbot.setActivity(Activity.listening("Nothing"));
		Turbot.setStatus(OnlineStatus.IDLE);
		Turbot.addEventListeners(new TurbotCommands());
		Turbot.build();
	}
		
	
}
