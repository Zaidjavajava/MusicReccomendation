package com.MRS;

import java.util.InputMismatchException;
import java.util.Scanner;

class whats_your_mood extends Mood {
	String reset = "\u001B[0m";

	String blue = "\u001B[34m";

	public void userMood() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("1 --> Bollywood Mush");
		System.out.println("2 --> 90s Love Hits");
		System.out.println("3 --> Romantic Malyalam");
		System.out.println("4 --> Bhojpuriya Patakha");
		System.out.println("5 --> House-Party Hits");
		System.out.println("6 --> latest-lovetunes");
		System.out.println("7 --> Chill Station");
		System.out.println("8 --> Go-back");

		try {
			int usermoodromance = sc.nextInt();
			switch (usermoodromance) {
			case 1:
				artistSuggestBollywood();
				break;
			case 2:
				artistsuggest90();
				break;
			case 3:
				mallu();
				break;
			case 4:
				bhojpuri();
				break;
			case 5:
				hph();
				break;
			case 6:
				lovetunes();
				break;
			case 7:
				chill();
				break;
			case 8:
				MoodInput();
				break;

			default:
				System.err.println("------Enter valid input------");
				userMood();
				break;
			}
		} catch (Throwable tr) {
			System.err.println("------Enter valid input------");
			userMood();
		}

		sc.close();
	}

	public void artistSuggestBollywood() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have an artist suggestion (y/n)");
		char choice = sc.next().charAt(0);
		if (choice == 'y' || choice == 'Y') {
			System.out.println("1 --> Arijit Singh songs are so soulful");
			System.out.println("2 --> Atif Aslam voice will make youn sway");
			System.out.println("3 --> Jubin Nautiyal is an incredible artist");
			System.out.println("4 --> Go-Back");
			int aname = sc.nextInt();
			switch (aname) {
			case 1:
				arijit();
				break;
			case 2:
				atifaslam();
				break;
			case 3:
				Jubin();
				break;
			case 4:
				userMood();
				break;
			default:
				System.err.println("------Enter valid input------");
				artistSuggestBollywood();
				break;
			}
		}

		else if (choice == 'n' || choice == 'N') {
			System.out.println("👇 No worries! Whenever you're ready to explore music, Link is here 👇.");
			System.out.println(
					blue + "https://open.spotify.com/playlist/37i9dQZF1DXdpQPPZq3F7n?si=612192899ad14bbb" + reset);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				userMood();
			}
		} else {
			System.out.println("Sorry, I didn't get that. Please respond with 'y' or 'n'.");
			artistSuggestBollywood();
		}

		sc.close();
	}

	public void arijit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Here are some popular tracks by Arijit Singh:");
		System.out.println("Apna Bana Le - https://open.spotify.com/track/5bQ6oDLqvw8tywmnSmwEyL?si=744423a3192f472f");
		System.out.println("Kalank - https://open.spotify.com/track/4cAPxxUgQXiuJu3QRBGMGr?si=703f4a21cb704a15");
		System.out.println("Tera Fitoor - https://open.spotify.com/track/7BCp5hEiiDSmXsxsXkvYff?si=e6d4581e6fea446c");
		System.out.println("Qaafirana - https://open.spotify.com/track/3yHyiUDJdz02FZ6jfUbsmY?si=6edd85e2a4554874");
		System.out.println("");
		System.out.println(
				"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
		try {
			char playlist = sc.next().charAt(0);
			if (playlist == 'y' || playlist == 'Y') {
				System.out.println(
						blue + "https://open.spotify.com/playlist/2uICejCNJFmExgNtJW7bqO?si=45900b58cd80454d" + reset); // playlist
				System.out.println("Press 1 to explore more");
				int back = sc.nextInt();
				if (back == 1) {
					artistSuggestBollywood();
				} else {
					System.err.println("------Enter valid number only------");
					arijit();
				}

			} else if (playlist == 'n' || playlist == 'N') {
				System.out.println("No worries! Whenever you're ready to explore music, I'll be here.");
				System.out.println("Do you wish to exit? respond with (y/n)");
				char choice = sc.next().charAt(0);
				if (choice == 'y' || choice == 'Y') {
					System.out.println("===================================================");
					System.out.println("Thankyou! Hope you enjoyed the overall experience");
					MoodCheck();
				} else if (choice == 'n' || choice == 'N') {
					System.out.println("I think you are more to go to.");
					userMood();
				} else {
					System.out.println(
							"As you have selected the wrong option. We might not entertain you more, Thankyou!");
					MoodInput();
				}
			} else {
				System.err.println("------Enter corresponding input------");
				arijit();
			}
		} catch (InputMismatchException ime) {
			System.err.println("Not an valid input");
			arijit();
		} catch (Throwable tr) {
			System.err.println("------Enter valid input------");
			arijit();
		}

		sc.close();
	}

	public void atifaslam() {
		System.out.println("Here are some popular tracks by Atif Aslam:");
		System.out.println("O Saathi - https://open.spotify.com/track/6fScgF2Y63ScU73nYju0ny?si=57683249378a4d2d");
		System.out
		.println("Tere Sang Yaara - https://open.spotify.com/track/72CkpVdvmc8t28o8I9N32J?si=9170cdeb63bf4158");
		System.out.println("Dekhte Dekhte - https://open.spotify.com/track/1scGwkyXNCl19wrBDhnAWg?si=2f3a01250e4a4009");
		System.out
		.println("I think so this will be enough for you. If you want more I can give a whole playlist? (y/n)");
		try {
			Scanner sc = new Scanner(System.in);
			char playlist = sc.next().charAt(0);
			if (playlist == 'y' || playlist == 'Y') {
				System.out.println(
						blue + "https://open.spotify.com/playlist/2qoz8LmSEajypx0g5iwjhc?si=c8754d2b0d6c45ed" + reset); // playlist
				System.out.println("Press 1 to explore more");
				int back = sc.nextInt();
				if (back == 1) {
					artistSuggestBollywood();
				} else {
					System.err.println("------Enter valid number only------");
					atifaslam();
				} // link

			} else if (playlist == 'n' || playlist == 'N') {
				System.out.println("No worries! Whenever you're ready to explore music, I'll be here.");
				System.out.println("Do you wish to exit? respond with (y/n)");
				char choice = sc.next().charAt(0);
				if (choice == 'y' || choice == 'Y') {
					System.out.println("===================================================");
					System.out.println("Thankyou! Hope you enjoyed the overall experience");
					// System.out.println("===================================================");
					MoodInput();
				} else if (choice == 'n' || choice == 'N') {
					System.out.println("I think you are more to go to.");
					userMood();
				} else {
					System.out.println(
							"As you have selected the wrong option. We might not entertain you more, Thankyou!");
					MoodInput();
				}
			} else {

				System.err.println("------Enter corresponding input------");
				atifaslam();
			}

			sc.close();
		} catch (InputMismatchException ime) {
			System.err.println("Not an valid input");
			atifaslam();
		} catch (Throwable tr) {
			System.err.println("------Enter valid input------");
			atifaslam();
		}

	}

	public void Jubin() {
		System.out.println("Shayad - https://open.spotify.com/track/72s1xrc7E27aATdCMbFMC6?si=cb43280191df489d");
		System.out.println(
				"Raataan Lambiyan - https://open.spotify.com/track/1stiSonuKkZqhI1o9nZ9MT?si=41f019b8d4db4558");
		System.out.println("Hamnawan Mere - https://open.spotify.com/track/0loZn1c5heXie7OAtvK6nH?si=fbfaaed762314002");
		System.out
		.println("I think so this will be enough for you. If you want more I can give a whole playlist? (y/n)");
		try {
			Scanner sc = new Scanner(System.in);
			char playlist = sc.next().charAt(0);
			if (playlist == 'y' || playlist == 'Y') {
				System.out.println(
						blue + "https://open.spotify.com/playlist/2VBgyxKutabdYemY3Q8uss?si=5d199dd6a545415d" + reset); // playlist
				System.out.println("Press 1 to explore more");
				int back = sc.nextInt();
				if (back == 1) {
					artistSuggestBollywood();
				} else {
					System.err.println("------Enter valid number only------");
					Jubin();
				}
			} else if (playlist == 'n' || playlist == 'N') {
				System.out.println("No worries! Whenever you're ready to explore music, I'll be here.");
				System.out.println("Do you wish to exit? respond with (y/n)");
				char choice = sc.next().charAt(0);
				if (choice == 'y' || choice == 'Y') {
					System.out.println("===================================================");
					System.out.println("Thankyou! Hope you enjoyed the overall experience");
					MoodInput();
				} else if (choice == 'n' || choice == 'N') {
					System.out.println("I think you are more to go to.");
					userMood();
				} else {
					System.out.println(
							"As you have selected the wrong option. We might not entertain you more, Thankyou!");
					MoodInput();
				}
			} else {
				System.err.println("------Enter corresponding input------");
				Jubin();
			}

			sc.close();
		} catch (InputMismatchException ime) {
			System.err.println("Not an valid input");
			atifaslam();
		} catch (Throwable tr) {
			System.err.println("------Enter valid input------");
			Jubin();
		}
	}

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public void artistsuggest90() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have an artist suggestion (y/n)");
		char choice = sc.next().charAt(0);
		if (choice == 'y' || choice == 'Y') {
			System.out.println("1 --> Lata Mangeshkar songs are so soulful");
			System.out.println("2 --> Kumar Sanu voice will make youn sway");
			System.out.println("3 --> Udit Narayan is an incredible artist");
			System.out.println("4 --> Go-Back");
			int aname90 = sc.nextInt();
			switch (aname90) {
			case 1:
				Lata();
				break;
			case 2:
				Kumarsanu();
				break;
			case 3:
				Udit();
				break;
			case 4:
				userMood();
				break;
			default:
				System.err.println("------Enter valid input------");
				artistsuggest90();
				break;
			}
		}

		else if (choice == 'n' || choice == 'N') {
			System.out.println("👇 No worries! Whenever you're ready to explore music, Link is here 👇.");
			System.out.println(
					blue + "https://open.spotify.com/playlist/37i9dQZF1DXa6iPZDThhLh?si=86cc4f9f082d420a" + reset);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				MoodInput();
			}
		} else {
			System.err.println("Sorry, I didn't get that. Please respond with 'y' or 'n'.");
			artistsuggest90();
		}

		sc.close();
	}

	public void Lata() {
		System.out.println("Here are some popular tracks by Lata Mangeshkar:");
		System.out.println("Pyar Kar - https://open.spotify.com/track/339XumxyHEbiKREnsOZXVN?si=518ed18cad604807");
		System.out
		.println("Tujhe Dekha To - https://open.spotify.com/track/6dFQ3W3xuG4ll7cNjIsN2Q?si=1d108815902e42f8");
		System.out.println("Are re Are - https://open.spotify.com/track/549FZ0BWEyIGVbo9FUOqPl?si=f0a385d73e4a40f8");
		System.out.println(
				"Ho Gya Hai Tujhko Pyaar Sajna - https://open.spotify.com/track/2MjnGtsgfqllql2ndWdGn8?si=60dbb15f02174323");
		System.out.println(
				"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");

		try {
			Scanner sc = new Scanner(System.in);
			char playlist = sc.next().charAt(0);
			if (playlist == 'y' || playlist == 'Y') {
				System.out.println(
						blue + "https://open.spotify.com/playlist/2qoz8LmSEajypx0g5iwjhc?si=c8754d2b0d6c45ed" + reset); // playlist
				System.out.println("Press 1 to explore more");
				int back = sc.nextInt();
				if (back == 1) {
					artistsuggest90();
				} else {
					System.err.println("------Enter valid number only------");
					Lata();
				} 

			} else if (playlist == 'n' || playlist == 'N') {
				System.out.println("No worries! Whenever you're ready to explore music, I'll be here.");
				System.out.println("Do you wish to exit? respond with (y/n)");
				char choice = sc.next().charAt(0);
				if (choice == 'y' || choice == 'Y') {
					System.out.println("===================================================");
					System.out.println("Thankyou! Hope you enjoyed the overall experience");
						MoodInput();
				} else if (choice == 'n' || choice == 'N') {
					System.out.println("I think you are more to go to.");
					userMood();
				} else {
					System.out.println(
							"As you have selected the wrong option. We might not entertain you more, Thankyou!");
					MoodInput();
				}
			}
else {
				System.err.println("------Enter corresponding input------");
				Lata();
			}

		} catch (Exception ime) {
			System.err.println("Not an valid input");
			Lata();
		} catch (Throwable tr) {
			System.err.println("------Enter valid input------");
			Lata();
		}

	}

	public void Kumarsanu() {
		System.out.println("Here are some popular tracks by Kumar Sanu:");
		System.out.println(
				"Chori Chori Jab Nazarien mili - https://open.spotify.com/track/4gHXgQLryJjdnXCfXqlXsW?si=ae680e00c6e14a3b");
		System.out
		.println("Chaha Toh Bahot - https://open.spotify.com/track/2type1Ws7CfGKDcP2Y1sZP?si=60971f77877548a4");
		System.out.println(
				"Saaton Janam Mein Tere - https://open.spotify.com/track/1hhmxIIa43oIMYRG0DLhZW?si=2603e62ec1a44bdc");
		System.out
		.println("Jadoo Hai Tera - https://open.spotify.com/track/2jifp7USyZuu2s2tsasYdB?si=55d4d13c92b24f0c");
		System.out.println(
				"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
		try {
			Scanner sc = new Scanner(System.in);
			char playlist1 = sc.next().charAt(0);
			if (playlist1 == 'y' || playlist1 == 'Y') {
				System.out.println(
						blue + "https://open.spotify.com/playlist/3I7ZovrEDkh7BTVCYjffES?si=8a41311d941843ab" + reset); // playlist
				System.out.println("Press 1 to explore more");
				int back = sc.nextInt();
				if (back == 1) {
					artistSuggestBollywood();
				} else {
					System.err.println("------Enter valid number only------");
					Kumarsanu();
				} // link
			} else if (playlist1 == 'n' || playlist1 == 'N') {
				System.out.println("No worries! Whenever you're ready to explore music, I'll be here.");
				System.out.println("Do you wish to exit? respond with (y/n)");
				char choice = sc.next().charAt(0);
				if (choice == 'y' || choice == 'Y') {
					System.out.println("===================================================");
					System.out.println("Thankyou! Hope you enjoyed the overall experience");
					System.out.println("===================================================");
					System.out.println("Press 1 to explore more or Press 0 to exit");
					int back = sc.nextInt();
					if (back == 1) {
						userMood();
					} else if (back == 0) {
						System.exit(0);
					} else {
						System.err.println("------Enter valid number only------");
						Kumarsanu();
					}
				} else if (choice == 'n' || choice == 'N') {
					System.out.println("I think you are more to go to.");
					userMood();
				} else {
					System.out.println(
							"As you have selected the wrong option. We might not entertain you more, Thankyou!");
					MoodInput();
				}
			} else {
				// Thread.sleep(4000);
				System.err.println("------Enter corresponding input------");
				Kumarsanu();
			}
			sc.close();
		} catch (InputMismatchException ime) {
			System.err.println("Not an valid input");
			Kumarsanu();
		} catch (Throwable tr) {
			System.err.println("------Enter valid input------");
			Kumarsanu();
		}
	}

	public void Udit() {
		System.out.println("Here are some popular tracks by Udit Narayan:");
		System.out.println("Pehla Nasha - https://open.spotify.com/track/6cCSo8zu3bRck519ZqRGfk?si=8289931e6a5c4b9c");
		System.out.println(
				"Mujhe Neend Na Aaye - https://open.spotify.com/track/4DjcBr310LtxxR6wq4sJRv?si=81810bd7fa074452");
		System.out.println("Pyar Kar - https://open.spotify.com/track/339XumxyHEbiKREnsOZXVN?si=d3b296d9788a4137");
		System.out.println(
				"Kuch Kuch Hota Hai - https://open.spotify.com/track/2MjnGtsgfqllql2ndWdGn8?si=60dbb15f02174323");
		System.out.println(
				"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
		try {
			Scanner sc = new Scanner(System.in);
			char playlist = sc.next().charAt(0);
			if (playlist == 'y' || playlist == 'Y') {
				System.out.println("👇 Link is here 👇.");
				System.out.println(
						blue + "https://open.spotify.com/playlist/0lxtKQhVnvQZIKyfichALN?si=33d80bf780354a89" + reset); // playlist
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					userMood();
				} else if (back == 0) {
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					Udit();
				}
			} else if (playlist == 'n' || playlist == 'N') {
				System.out.println("No worries! Whenever you're ready to explore music, I'll be here.");
				System.out.println("Do you wish to exit? respond with (y/n)");
				char choice = sc.next().charAt(0);
				if (choice == 'y' || choice == 'Y') {
					System.out.println("===================================================");
					System.out.println("Thankyou! Hope you enjoyed the overall experience");
					System.out.println("===================================================");
					System.out.println("Press 1 to explore more or Press 0 to exit");
					int back = sc.nextInt();
					if (back == 1) {
						userMood();
					} else if (back == 0) {
						System.exit(0);
					} else {
						System.err.println("------Enter valid number only------");
						Udit();
					}
				} else if (choice == 'n' || choice == 'N') {
					System.out.println("I think you are more to go to.");
					userMood();
				} else {
					System.out.println(
							"As you have selected the wrong option. We might not entertain you more, Thankyou!");
					MoodInput();
				}
			} else {
				System.err.println("------Enter corresponding input------");
				Udit();
			}
			sc.close();
		} catch (InputMismatchException ime) {
			System.err.println("Not an valid input");
			Udit();
		} catch (Throwable tr) {
			System.err.println("------Enter valid input------");
			Udit();
		}
	}

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public void mallu() {
		System.out.println("Here are the top popular Malyalam tracks.");
		System.out.println("");
		System.out.println("Darshana - https://open.spotify.com/track/4BBwON1XG02S4cpYrV10u2?si=3d2d6a97e94d4876");
		System.out.println("Malare - https://open.spotify.com/track/4Hvf9xIeJWp5p9FkJerQhN?si=0a1be76bcf8644bf");
		System.out.println("Theerame - https://open.spotify.com/track/4mjS1p9StkylrZPj6LIkjg?si=2b6bedfd61554c4e");
		System.out.println("Omane - https://open.spotify.com/track/2dlGhG9K03ECc7PNsTlyVs?si=ecf8a80568544402");
		System.out.println("Rasathi - https://open.spotify.com/track/6DCWVyJ3uE3xxTg2Wp60Aj?si=82a0d6daeb104d66");
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println(
				"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
		char choice = sc.next().charAt(0);
		if (choice == 'y' || choice == 'Y') {
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					blue + "https://open.spotify.com/playlist/4Pj3CPQ6laHVW42DZtsLL0?si=1a32bac09a3847e7" + reset);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				mallu();
			}
		} else if (choice == 'n' || choice == 'N') {
			System.out.println("===================================================");
			System.out.println("Thankyou! Hope you enjoyed the overall experience");
			System.out.println("===================================================");
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				mallu();
			}
		} else {
			System.err.println("------Enter corresponding input------");
			mallu();
		}
		sc.close();
	}

	public void bhojpuri() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Here are the top popular Bhojpuriy tracks.");
		System.out.println("");
		System.out.println("Nathuniya - https://open.spotify.com/track/1u1ymb4OYnqR3lpYdAzm2O?si=0261a5e166c84bc2");
		System.out.println("Sata Ka Paisa - https://open.spotify.com/track/7bchBLtZFjHRn124tplhs5?si=fbd1fa9dbba94f14");
		System.out.println(
				"Jabse Gori Dihlu Maza - https://open.spotify.com/track/6oQY50jSUL1Ozy8FiYx3kE?si=2968a7d9f6474d8e");
		System.out.println(
				"Kamariya se Chala Tha Pata - https://open.spotify.com/track/4WmEw3MCaa3GiRNg8QqATJ?si=8ab7475ad95b4635");
		System.out.println("UP 55 Wala - https://open.spotify.com/track/5dWw93apmiXnvrVOirG242?si=4e0ce65c11874229");
		System.out.println("");
		System.out.println(
				"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
		char choice = sc.next().charAt(0);
		if (choice == 'y' || choice == 'Y') {
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					blue + "https://open.spotify.com/playlist/7CdL6MKWNFI3XpqKsSo8tD?si=f5593222d2de4855" + reset);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				bhojpuri();
			}

		} else if (choice == 'n' || choice == 'N') {
			System.out.println("===================================================");
			System.out.println("Thankyou! Hope you enjoyed the overall experience");
			System.out.println("===================================================");
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				bhojpuri();
			}

		} else {
			System.err.println("------Enter corresponding input------");
			bhojpuri();
		}
		sc.close();
	}

	public void hph() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Here are the top popular HouseParty Hits.");
		System.out.println("");
		System.out.println(
				"Subha Hone Na De - https://open.spotify.com/track/6WediUhXDfm8FR3wlM0r3G?si=e33822c296c14fb0");
		System.out.println("Kar Gyi Chull - https://open.spotify.com/track/3BhjbaGeI7E0CiIjctfdD3?si=2368e4c74ace4979");
		System.out.println(
				"Nashe Si  Chadh Gyi - https://open.spotify.com/track/0biClovetunesTAblvLTLtJz4pXO?si=ba37a858d78846b1");
		System.out.println("Hookah Bar - https://open.spotify.com/track/4AoQVhME8Ko6LNm4lV2wwQ?si=2356e27166bb4e46	");
		System.out
		.println("Illegal Weapon - https://open.spotify.com/track/5fXslGZPI5Cco6PKHzlSL3?si=9f1daeb660434d15");
		System.out.println("");
		System.out.println(
				"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
		char choice = sc.next().charAt(0);
		if (choice == 'y' || choice == 'Y') {
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					blue + "https://open.spotify.com/playlist/24roueVkybCdY0RWlT3ftV?si=02774048ff8c4d55" + reset);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				hph();
			}

		} else if (choice == 'n' || choice == 'N') {
			System.out.println("===================================================");
			System.out.println("|Thankyou! Hope you enjoyed the overall experience|");
			System.out.println("===================================================");
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				hph();
			}

		} else {
			System.err.println("------Enter corresponding input------");
			hph();
		}
		sc.close();
	}

	public void lovetunes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Here are the top popular HouseParty Hits.");
		System.out.println("");
		System.out.println(
				"Tere Sang Ishq Hai(From Yodha) - https://open.spotify.com/track/2BJCgb5RvPSLBsx6UYfJV2?si=2bb69495096e4d88");
		System.out.println(
				"Mirza (From Maidan)) - https://open.spotify.com/track/4rOHa0WeuakM8OL36OLEhm?si=b492da055e084a6f");
		System.out.println("Soulmate -https://open.spotify.com/track/1tf2iody5iRLYYPDSBpzRc?si=d21ab760125c4d81");
		System.out.println("Hookah Bar - https://open.spotify.com/track/4AoQVhME8Ko6LNm4lV2wwQ?si=2356e27166bb4e46	");
		System.out
		.println("Illegal Weapon - https://open.spotify.com/track/5fXslGZPI5Cco6PKHzlSL3?si=9f1daeb660434d15");
		System.out.println("");
		System.out.println(
				"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
		char choice = sc.next().charAt(0);
		if (choice == 'y' || choice == 'Y') {
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					blue + "https://open.spotify.com/playlist/24roueVkybCdY0RWlT3ftV?si=02774048ff8c4d55" + reset);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				lovetunes();
			}

		} else if (choice == 'n' || choice == 'N') {
			System.out.println("===================================================");
			System.out.println("+Thankyou! Hope you enjoyed the overall experience+");
			System.out.println("===================================================");
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				lovetunes();
			}

		} else {
			System.err.println("------Enter corresponding input------");
			lovetunes();
		}
		sc.close();

	}

	public void chill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Here are the top Chill Stations .");
		System.out.println("");
		System.out.println(
				"Khaabon Ke Parindey - https://open.spotify.com/track/14eotumM24MhIgzidgN3Jx?si=c5d90d503d464e06");
		System.out.println(
				"Tu Hai Kahan (feat.ZAYN) - https://open.spotify.com/track/7K6RLbkpqZI4OaoSnLcBiU?si=4f8cb95e4b97429f");
		System.out.println("Noor E Khuda - https://open.spotify.com/track/55fSZWdcvMPJga3LbiV8jN?si=bdf47a4f46134084");
		System.out.println("Chand Baliya - https://open.spotify.com/track/0snQrp1VaY5Pj1YIHRJpRJ?si=15f8a007c13e4efb");
		System.out.println("Soch Na Sake - https://open.spotify.com/track/3WLJ7D5kh44K5eJ1NqZQ6W?si=ce5a0e214d8d4ea1");
		System.out.println("");
		System.out.println(
				"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
		char choice = sc.next().charAt(0);
		if (choice == 'y' || choice == 'Y') {
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					blue + "https://open.spotify.com/playlist/0x1wGcekbYCgaSIQ8cDPls?si=c483d663d8d44abc" + reset);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				chill();
			}

		} else if (choice == 'n' || choice == 'N') {
			System.out.println("===================================================");
			System.out.println("|Thankyou! Hope you enjoyed the overall experience|");
			System.out.println("===================================================");
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				userMood();
			} else if (back == 0) {
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				chill();
			}

		} else {
			System.err.println("------Enter corresponding input------");
			chill();
		}
		sc.close();
	}

}
