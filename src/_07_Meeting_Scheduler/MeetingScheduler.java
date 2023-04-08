package _07_Meeting_Scheduler;

import java.util.ArrayList;
import java.util.HashMap;

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

	public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
		HashMap<String, ArrayList<Integer>> person1Times = new HashMap<String, ArrayList<Integer>>();
		HashMap<String, ArrayList<Integer>> person2Times = new HashMap<String, ArrayList<Integer>>();
		
		// System.out.println("Person 1 Availability: " + person1.getSchedule() + "
		// Person 2 Availability: "
		// + person2.getSchedule());
		ArrayList<Integer> john = new ArrayList<Integer>();

		for (String i : person1.getSchedule().keySet()) {
			if (person1.getSchedule().get(i) == john) {

			} else {

				person1Times.put(i, person1.getSchedule().get(i));
			}

		}
		for (String i : person2.getSchedule().keySet()) {
			if (person2.getSchedule().get(i) == john) {

			} else {
				person2Times.put(i, person2.getSchedule().get(i));
			}
		}
		for(String i : person1Times.keySet()) {
			for(Integer j : person1Times.get(i)) {
				if(person2Times.containsKey(i) && person2Times.containsValue(j)) {
					
				}
			}
		}
		
		
		
/*
		String timess = "";
		for (String i : person1.getSchedule().keySet()) {
			if (person1.getSchedule().get(i) == null) {

			} else {

				timess = timess + i + " at " + person1.getSchedule().get(i) + ", ";
			}
		}
		System.out.println(timess);
		String timesss = "";
		for (String i : person2.getSchedule().keySet()) {
			if (person2.getSchedule().get(i) == null) {

			} else {
				timesss = timess + i + " at " + person2.getSchedule().get(i) + ", ";
			}
		}
		System.out.println(timesss);
*/
		return null;
	}
}
