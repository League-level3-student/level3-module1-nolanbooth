package _07_Meeting_Scheduler;

import java.util.ArrayList;

public class MeetingScheduler {
	/*
	 * Your task is to code a method to find a meeting time for two people given
	 * their schedules.
	 * 
	 * Code the method below so that it returns a Schedule object that contains all
	 * the times during the week that are in BOTH people's schedules. The Schedule
	 * class is included in this package.
	 * 
	 * Example: person1 availability - Monday at 9, Tuesday at 14, and Friday 10
	 * person2 availability - Tuesday at 14, Friday 8, and Monday at 9 The returned
	 * HashMap should contain: Tuesday 14 and Monday 9
	 * 
	 * The returned Schedule object represents the times both people are available
	 * for a meeting.
	 * 
	 * Time availability is always at the top of the hour, so 9:30 is not valid Time
	 * availability always represents 1 hour Assume both schedules are in the same
	 * time zones
	 */
	static String person1Avail = "";
	static String person2Avail = "";
	static String day;
	static String avail = "";
	static Schedule availability;

	public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
		for (int i = 0; i < 7; i++) {
			if (i == 0) {
				day = "Sunday";
			}
			if (i == 1) {
				day = "Monday";
			}
			if (i == 2) {
				day = "Tuesday";
			}
			if (i == 3) {
				day = "Wednesday";
			}
			if (i == 4) {
				day = "Thursday";
			}
			if (i == 5) {
				day = "Friday";
			}
			if (i == 6) {
				day = "Saturday";
			}
			
			//Plan: Somehow get the availability from the two people, then add it into the same Schedule. If the schedule
			//already has the time, then add it to the availability thing/ 
			

			/*if (person1.getSchedule().get(day).size() == 0) {
				person1.getSchedule().remove(day);
			}
			if (person2.getSchedule().get(day).size() == 0) {
				person2.getSchedule().remove(day);
			}
			*/
			// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -//

			
		}

		/*
		 * if (person1.getSchedule().get("Monday").get(0) == null) {
		 * person1.getSchedule().remove("Monday");
		 * }if(person2.getSchedule().get("Monday").get(0) == null) {
		 * person2.getSchedule().remove("Monday"); }
		 * System.out.println(person1.getSchedule().get("Monday"));
		 * System.out.println(person2.getSchedule().get("Monday"));
		 * System.out.println("- - - - - -");
		 */
		return null;
	}
}