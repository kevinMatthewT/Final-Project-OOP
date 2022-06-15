package Final-Project-OOP;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class TurbotCommands extends ListenerAdapter{
	//making a command call
	String[] RemindSentence = new String[32];
	
	String[] RemindWeek=new String[8];
	
	String[] RemindDaily=new String[5];
	
	public String CommandCall ="!";
	boolean Run=true;
	
	//main code
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		String[] Command= event.getMessage().getContentRaw().split(" ");
		
		
		//to allow us to use the Remind and calendar java file
		RemindAndCalen RNC= new RemindAndCalen();
		RNC.FindHour();
		
		
		
		//if command to show whether you make 
		if (Command[0].equalsIgnoreCase(CommandCall+"commands")){
			event.getChannel().sendMessage("Here are the list of commands: !help (to make reminder) | !ShowEventsToday | !ShowReminders | !ShowRemindersThisWeek | !ShowDailyReminders | !ShowremindersRemaining | !checkTime | !reset").queue();
		
			
		//help command to teach on how to make a reminder
	    }else if (Command[0].equalsIgnoreCase(CommandCall+"help")) {
	    	event.getChannel().sendMessage("TO make a basic one time reminder use this format ").queue();
	    	event.getChannel().sendMessage("Format Day-> !ReminderDay1 'your-sentence' **numbers 1-31 available**").queue();
	    	event.getChannel().sendMessage("Format Week-> !Reminder**day** 'your sentence' EG: !reminderSaturday").queue();
	    	event.getChannel().sendMessage("Format Daily-> !ReminderDaily1 'your sentence' **number 1-5 available**").queue();
			
	    	
		
		//until reminder day 31 all used to make an item on that day
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay1")) {
			String X=Command[1];
			RemindSentence[1]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay2")) {
			String X=Command[1];
			RemindSentence[2]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay3")) {
			String X=Command[1];
			RemindSentence[3]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay4")) {
			String X=Command[1];
			RemindSentence[4]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay5")) {
			String X=Command[1];
			RemindSentence[5]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay6")) {
			String X=Command[1];
			RemindSentence[6]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay7")) {
			String X=Command[1];
			RemindSentence[7]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay8")) {
			String X=Command[1];
			RemindSentence[8]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay9")) {
			String X=Command[1];
			RemindSentence[9]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay10")) {
			String X=Command[1];
			RemindSentence[10]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay11")) {
			String X=Command[1];
			RemindSentence[11]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay12")) {
			String X=Command[1];
			RemindSentence[12]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay13")) {
			String X=Command[1];
			RemindSentence[13]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay14")) {
			String X=Command[1];
			RemindSentence[14]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay15")) {
			String X=Command[1];
			RemindSentence[15]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay16")) {
			String X=Command[1];
			RemindSentence[16]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay17")) {
			String X=Command[1];
			RemindSentence[17]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay18")) {
			String X=Command[1];
			RemindSentence[18]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay19")) {
			String X=Command[1];
			RemindSentence[19]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay20")) {
			String X=Command[1];
			RemindSentence[20]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay21")) {
			String X=Command[1];
			RemindSentence[21]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay22")) {
			String X=Command[1];
			RemindSentence[22]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay23")) {
			String X=Command[1];
			RemindSentence[23]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay24")) {
			String X=Command[1];
			RemindSentence[24]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay25")) {
			String X=Command[1];
			RemindSentence[25]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay26")) {
			String X=Command[1];
			RemindSentence[26]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay27")) {
			String X=Command[1];
			RemindSentence[27]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay28")) {
			String X=Command[1];
			RemindSentence[28]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay29")) {
			String X=Command[1];
			RemindSentence[29]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay30")) {
			String X=Command[1];
			RemindSentence[30]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDay31")) {
			String X=Command[1];
			RemindSentence[31]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderSunday")) {
			String X=Command[1];
			RemindWeek[1]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderMonday")) {
			String X=Command[1];
			RemindWeek[2]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderTuesday")) {
			String X=Command[1];
			RemindWeek[3]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderWednesday")) {
			String X=Command[1];
			RemindWeek[4]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderThursday")) {
			String X=Command[1];
			RemindWeek[5]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderFriday")) {
			String X=Command[1];
			RemindWeek[6]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderSaturday")) {
			String X=Command[1];
			RemindDaily[0]=X;
			
			
			//makes daily reminders
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDaily1")) {
			String X=Command[1];
			RemindDaily[0]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDaily2")) {
			String X=Command[1];
			RemindDaily[1]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDaily3")) {
			String X=Command[1];
			RemindDaily[2]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDaily4")) {
			String X=Command[1];
			RemindDaily[3]=X;
			
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ReminderDaily5")) {
			String X=Command[1];
			RemindDaily[4]=X;
			
			
			
		//used to show what reminders exist today
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ShowEventsToday")) {
			
			//get the day and use it to search immediately on the list
			RNC.DayNum();
			int Tod=RNC.Day;
			
			String X=RemindSentence[Tod];
			event.getChannel().sendMessage("**Reminders:**").queue();
			event.getChannel().sendMessage(X).queue();
			
			//shows the weekly reminder
			event.getChannel().sendMessage("**Weekly Reminders:**").queue();
			RNC.get_Week();
			int WeekN=RNC.WeekNum;
			String Y=RemindWeek[WeekN];
			event.getChannel().sendMessage(Y).queue();
			
			
			
			
			
		//show all the reminders that exist
		}else if (Command[0].equalsIgnoreCase(CommandCall+"Showreminders")) {
			
			//for loop for all the list in existence for specific day reminders
			event.getChannel().sendMessage("Reminders:").queue();
			RNC.TotalDays();
			int DayzNum=RNC.totalDays;
			for (int i=0;i<DayzNum;i++) {
				
				String X=RemindSentence[i];
				if (X!=null) {
					event.getChannel().sendMessage("Day "+i+" "+X).queue();
				}
				 
			}
		
			
			
		//used to show the remaining reminders this month
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ShowremindersRemaining")) {
			
			//for loop for all the list in existence for specific day reminders
			event.getChannel().sendMessage("Reminders:").queue();
			RNC.DayNum();
			RNC.TotalDays();
			int DayzNum=RNC.totalDays;
			for (int i=RNC.Day;i<DayzNum;i++) {
				
				String X=RemindSentence[i];
				if (X!=null) {
					event.getChannel().sendMessage("Day "+i+" "+X).queue();
				}
				 
			}
		
			
			
		//show all reminders for upcoming week
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ShowDailyReminders")) {
			
			//for loop for all the list in existence for specific day reminders
			event.getChannel().sendMessage("Daily Reminders:").queue();
			for (int i=0;i<5;i++) {
				
				String X=RemindDaily[i];
				if (X!=null) {
					event.getChannel().sendMessage(X).queue();
				}
				 
			}
		
			
			
		//show all reminders for upcoming week
		}else if (Command[0].equalsIgnoreCase(CommandCall+"ShowremindersThisweek")) {
			RNC.DayNum();
			int day=RNC.Day;
			int week=day+7;
			RNC.TotalDays();
			int DayzNum=RNC.totalDays;
			for (int i=day;i<week||i<DayzNum;i++) {
				
				String X=RemindSentence[i];
				if (X!=null) {
					event.getChannel().sendMessage("Day "+i+ " "+X).queue();
				}
			}
		
			
		//used to reset the day list
		}else if(Command[0].equalsIgnoreCase(CommandCall+"Reset")){
			for(int i=0;i<33;i++) {
				RemindSentence[i]=null;
				
			}
			event.getChannel().sendMessage("The list has been reset").queue();
			
			
		//used to check time 
		}else if (Command[0].equalsIgnoreCase(CommandCall+"Checktime")) {
			RNC.DayNum();
			RNC.FindHour();
			RNC.CheckWeek();
			String X=RNC.WeekCHK;
			event.getChannel().sendMessage("Hours: " +RNC.Hours +" Minute:"+ RNC.Minutes + " Seconds: "+ RNC.Seconds+ " Day: "+X).queue();
			
		}
	   
		
	}
}
