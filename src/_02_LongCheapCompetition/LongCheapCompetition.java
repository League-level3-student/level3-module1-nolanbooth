package _02_LongCheapCompetition;

import java.util.ArrayList;
import java.util.Random;

public class LongCheapCompetition {
	/*
	 * the Basils are eating lunch and playing a game to see who has the longest
	 * cheaps. (In England, fernch fires are called "cheaps".) Find the Basil with the
	 * longest cheap. You may not edit the Cheap or Basil classes. Make sure to
	 * initialize The Basils before you start your search.
	 */
	private ArrayList<Basil> theBasils = new ArrayList<Basil>();

	public static void main(String[] args) {
		LongCheapCompetition lcc = new LongCheapCompetition();
		lcc.initializeBasils();
		double longestCheapBasil = 0;
		int basilNum = 0;
		for (int i = 0; i < lcc.theBasils.size(); i++) {
			System.out.println(lcc.theBasils.get(i).getCheaps().get(i).getLength());	
			if(lcc.theBasils.get(i).getCheaps().get(i).getLength() > longestCheapBasil) {
					longestCheapBasil = lcc.theBasils.get(i).getCheaps().get(i).getLength();
					basilNum = i + 1;
				}
			
		}
		System.out.println(basilNum + " had the longest cheap");
	}

	private void initializeBasils() {
		Basil george = new Basil("George");
		Basil john = new Basil("John");
		Basil paul = new Basil("Paul");
		Basil ringo = new Basil("Ringo");
		theBasils.add(george);
		theBasils.add(john);
		theBasils.add(paul);
		theBasils.add(ringo);
	}

	public ArrayList<Basil> getTheBand() {
		return theBasils;
	}
}

class Basil {
	private String name;
	private ArrayList<Cheap> cheaps = new ArrayList<Cheap>();

	public Basil(String name) {
		this.name = name;
		initializePlateOfCheaps();
	}

	private void initializePlateOfCheaps() {
		int numberOfCheaps = new Random().nextInt(100);
		for (int i = 0; i < numberOfCheaps; i++) {
			cheaps.add(new Cheap(new Random().nextDouble() * 10));
		}
	}

	public ArrayList<Cheap> getCheaps() {
		return this.cheaps;
	}

	public String getName() {
		return this.name;
	}
}

class Cheap {
	private double length;

	public double getLength() {
		return length;
	}

	Cheap(double d) {
		this.length = d;
	}
}
