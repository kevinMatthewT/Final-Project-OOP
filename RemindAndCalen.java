package Final-Project-OOP;


import java.util.Calendar;

public class RemindAndCalen {
	//the list that contains all reminders
	
	
	
	
	//to get the calendar class
	Calendar c= Calendar.getInstance();
	
	//all the variables used in both this one and the next one
	
	String WeekCHK;
	
	
	
    //all the variables that are made to be stored
    int Hours;
	int Minutes;
	int Seconds;
	int Day;
	int WeekNum;
    
	int totalDays;
	
	//getting the number of which day of the week it is
	public void get_Week() {
		WeekNum=c.get(Calendar.DAY_OF_WEEK);
	}
    
	//used to find the hour minute and seconds
    public void FindHour() {
    	Hours=c.get(Calendar.HOUR);
    	Minutes=c.get(Calendar.MINUTE);
        Seconds=c.get(Calendar.SECOND);
    }
	
	
    public void DayNum() {
    	Day=c.get(Calendar.DAY_OF_MONTH);
    }
    
    public void TotalDays() {
    	int MonthNum=c.get(Calendar.MONTH);
    	int YEARNum=c.get(Calendar.YEAR);
    	if (MonthNum==1||MonthNum==3||MonthNum==5||MonthNum==7||MonthNum==8||MonthNum==10||MonthNum==12) {
    		totalDays=31;
    		
    	}else if (MonthNum==4||MonthNum==6||MonthNum==9||MonthNum==11) {
    		totalDays=30;
    	}else if (MonthNum==2) {
    		if (YEARNum%4==0) {
    			totalDays=29;
    		}else if(YEARNum%4!=0) {
    			totalDays=28;
    		}
    	}
    }
    
    
	//to return back what day it is in string version
	public String CheckWeek(){
		if(c.get(Calendar.DAY_OF_WEEK)==1) {
			WeekCHK="Sunday";
		} else if(c.get(Calendar.DAY_OF_WEEK)==2) {
			WeekCHK="Monday";
		}else if(c.get(Calendar.DAY_OF_WEEK)==3) {
			WeekCHK="Tuesday";
		}else if(c.get(Calendar.DAY_OF_WEEK)==4) {
			WeekCHK="Wednesday";
		}else if(c.get(Calendar.DAY_OF_WEEK)==5) {
			WeekCHK="Thursday";
		}else if(c.get(Calendar.DAY_OF_WEEK)==6) {
			WeekCHK="Friday";
		}else if(c.get(Calendar.DAY_OF_WEEK)==7) {
			WeekCHK="Saturday";
		}
		return WeekCHK;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
