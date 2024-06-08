package com.MRS;

import java.util.*;

public class Mood {
	 Login lm = new Login();
	static Mood mood = new Mood();
	static whats_your_mood wym = new whats_your_mood();
	static SadHours sd = new SadHours();
	static Lofi lofi = new Lofi();
	static Premium pr = new Premium();
	
	static public void MoodInput() {
		System.out.println("1 --> What's your mood?");
		System.out.println("2 --> For the Dreamer in you");
		System.out.println("3 --> Lofi Moods & Moments");
		System.out.println("4 --> Explore Premium Services");
		System.out.println("5 --> Sign-out");
		System.out.println("==================Enter your Mood from above options only==================");
		mood.MoodCheck();
	}

	public void MoodCheck() {

		Scanner sc = new Scanner(System.in);
		try {
			int userMoodinput =sc.nextInt();
			if (userMoodinput >5 || userMoodinput<1) {
				System.err.println("Invalid Option");
				MoodInput();
				
			}
			
					 
				switch (userMoodinput) {
				case 1:
					wym.userMood();
					break;
				case 2:
					sd.typescheck();
					break;
				case 3:
					lofi.lofimood();
					break;
				case 4:
					pr.explorepremium();
					break;
				case 5:
					lm.userverification();
					break;
				}			
		} catch (Throwable tr) {
			System.err.println("==============Enter valid input==================");
			mood.MoodCheck();

		}
	}
}