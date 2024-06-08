package com.MRS;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Premium extends Mood {

	public void explorepremium() {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("✅ Ad-Free Experience");
		ar.add("✅ High-Quality Audio Streaming");
		ar.add("✅ Offline Listening");
		ar.add("✅ Custom Playlists Creation");
		ar.add("✅ Early Access to New Features");
		ar.add("");

		for (Object obj : ar) {
			System.out.println(obj);
		}
		purchase();
	}

	public void purchase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a method to pay");
		System.out.println("1 --> UPI");
		System.out.println("2 --> Debit / Credit Card");
		System.out.println("3 --> Home Page");

		try {
			int input = sc.nextInt();
			switch (input) {
			case 1:
				upi();
				break;
			case 2:
				card();
				break;
			case 3:
				MoodInput();
				break;
			}
		} catch (InputMismatchException ime) {
			System.out.println("Select appropriate payment method");
			purchase();
		}
	}

	public void upi() {
		String reset = "\u001B[0m";
		String blue = "\u001B[34m";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your upi id");
		String id = sc.nextLine();
		if (id.endsWith("@upi")) {
			String transactionId = "";
			Random r = new Random();
			while (transactionId.length() < 6) {
				int n = r.nextInt(123);
				if (n >= 48 && n <= 57) {
					transactionId = transactionId + n;
				}
			}
			System.out.println("Click on the link to make your payment");
			System.out.println(blue + "upi://pay?pa=" + id + "&tid=" + transactionId + reset);

		} else {
			System.err.println("Enter valid id");
			upi();
		}

	}

	public void card() {
		System.out.println("Stay tuned we are working on this.");
		purchase();

	}

}
