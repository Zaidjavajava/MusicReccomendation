package com.MRS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SadHours extends whats_your_mood {
	String reset = "\u001B[0m";

	String blue = "\u001B[34m";

	public void typescheck() {
		System.out.println("1 --> Sad Hindi Melodies");
		System.out.println("2 --> Sad Melodies Tamil");
		System.out.println("3 --> Sad Hours : Punjabi");
		System.out.println("4 --> Marathi Sad Songs");
		System.out.println("5 --> Sad HeartBreak Malayalam");
		System.out.println("6 --> Go back");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Select one from the above options");
			int input = sc.nextInt();
	switch (input) {
			case 1:
				hindi();
				break;
			case 2:
				tamil();
				break;
			case 3:
				punjabi();
				break;
			case 4:
				marathi();
				break;
			case 5:
				malayalam();
				break;
			case 6:
				System.out.println("===========================================");
				MoodInput();
				break;
			default:
				System.err.println("------Enter valid input------");
				typescheck();
				break;

			}
		} catch (InputMismatchException ime) {
			System.err.println("------Enter valid input only------");
			typescheck();
		}
		sc.close();

	}

	private void malayalam() {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Here are the HeartBreak Malayalam Songs.");
			System.out.println("");
			System.out.println("Yaathonnum Parayathe (from- Vashi) -"
					+ " https://open.spotify.com/track/23e7ArZoag0tLpBOlIuE9D?si=c10ea949feed405f");
			System.out.println("Pakalaay - https://open.spotify.com/track/4XJzCBmRNCUjZfPFHss4uc?si=dfa6f51648504413");
			System.out.println("Sadhaa - https://open.spotify.com/track/1f0OALoEDECPNMuMUmjqJO?si=542d6797c4a54bc6");
			System.out.println("Uyire - https://open.spotify.com/track/0vmxxVMfJN21J3xX2uqzkg?si=f953ebfc839c448e");
			System.out.println("Mukilinte - https://open.spotify.com/track/0rTuNcDinTfNqaq6atIm7G?si=f7d94a5eee154989");
			System.out.println("");
			System.out.println(
					"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
			char choice = sc.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				System.out.println("👇 Link is here 👇.");
				System.out.println(blue +"https://open.spotify.com/playlist/2Yj8HX1nPN53OAvmJNgr7a?si=85315ae48deb45ff"+reset);
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {
					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					malayalam();
				}

			} else if (choice == 'n' || choice == 'N') {
				System.out.println("===================================================");
				System.out.println("Thankyou! Hope you enjoyed the overall experience");
				System.out.println("===================================================");
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {
					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					malayalam();
				}

			} else {
				System.err.println("------Enter corresponding input------");
				malayalam();
			}
			sc.close();
		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");
			malayalam();
		}
	}

	private void punjabi() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Here are the Sad Punjabis Mix.");
			System.out.println("");
			System.out.println("Excuses -" 
					+ " https://open.spotify.com/track/29m79w9xPMH4YCD6r8JSmV?si=d39c4e1da6d14366");
			System.out.println("Koi si - https://open.spotify.com/track/0rY5TEzbVFwphIzMhMh7hX?si=e4a0d9e0a026466c");
			System.out.println(
					"Ranjha (From Sheershah) - https://open.spotify.com/track/72zHuDxFQTjbL51qJQSA7j?si=889a0e05c4fc48ee");
			System.out.println("Filhall - https://open.spotify.com/track/7DE0I3buHcns00C0YEsYsY?si=475f8c1fa8fc4204");
			System.out.println("Pachtaoge - https://open.spotify.com/track/5QVHNa0ppJUOoqSd36ovQS?si=c82e197ccc5f4a67");
			System.out.println("");
			System.out.println(
					"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
			char choice = sc.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				System.out.println("👇 Link is here 👇.");
				System.out.println(blue+"https://open.spotify.com/playlist/3m7BJfqYL5dEhUnjjiWRVm?si=a5cd6e5db3c44d43"+reset);
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {
					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					punjabi();
				}

			} else if (choice == 'n' || choice == 'N') {
				System.out.println("===================================================");
				System.out.println("Thankyou! Hope you enjoyed the overall experience");
				System.out.println("===================================================");
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {
					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					punjabi();
				}

			} else {
				System.err.println("------Enter corresponding input------");
				punjabi();
			}
			sc.close();
		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");
			punjabi();
		}

	}

	private void marathi() {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Here are the Marathi Sad Songs.");
			System.out.println("");
			System.out.println("Devak Kalji Re -" 
					+ " https://open.spotify.com/track/04FrYE3TX2ef8BreMNc0S2?si=c6add2863edd4284" );
			System.out.println(
					"Roz Mala Visrun me -https://open.spotify.com/track/0d30F80EiIm4W55EzIIDYa?si=648b97e7bd0843cb");
			System.out.println("Dur Dur - https://open.spotify.com/track/7MnTwkdjrWbppgI9pT9hWV?si=9b0d2660c3e74ce6");
			System.out.println(
					"Deva Tujhya Gaabhaaryaalaa - https://open.spotify.com/track/2mpuk61zDHhBayMZVA2EUs?si=c25603862b4f46e6");
			System.out.println(
					"Anand Harpla - https://open.spotify.com/track/25x554EwRVf5afHxYc796P?si=606019e150b24aa6");
			System.out.println("");
			System.out.println(
					"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
			char choice = sc.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				System.out.println("👇 Link is here 👇.");
				System.out.println(blue+"https://open.spotify.com/playlist/0p04L1Gwi8ty83JKvBd8H1?si=cc7d6118b7dc4b56"+reset);
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {
					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					marathi();
				}

			} else if (choice == 'n' || choice == 'N') {
				System.out.println("===================================================");
				System.out.println("|Thankyou! Hope you enjoyed the overall experience|");
				System.out.println("===================================================");
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {
					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					marathi();
				}

			} else {
				System.err.println("------Enter corresponding input------");
				marathi();
			}
			sc.close();
		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");
			marathi();
		}
	}

	private void hindi() {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Here are the HeartBreak Tamil Songs.");
			System.out.println("");
			System.out.println("Lo Maan Liya -" 
					+ " https://open.spotify.com/track/2wJ9d1Gfj8OqcznPAroqvh?si=22f3fa67aae8428b");
			System.out.println(
					"Tujhe Bhula Diya - https://open.spotify.com/track/4r8JqkhpTb5tzSKKHnVJIJ?si=2dbbc4cdce3c4e94");
			System.out.println(
					"Mann Bharryya - https://open.spotify.com/track/3jf5303mzzJ96O8xFTcEn4?si=e7469a2c894b4bb5");
			System.out.println(
					"Humari Adhuri Kahani - https://open.spotify.com/track/3eQL03MvTJQkLqXryJ8Fja?si=fe9241bdb52a451f");
			System.out.println(
					"Agar Tumh Sathh Ho - https://open.spotify.com/track/3hkC9EHFZNQPXrtl8WPHnX?si=a0c2ebd41b7b4b89");
			System.out.println("");
			System.out.println(
					"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
			char choice = sc.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				System.out.println("👇 Link is here 👇.");
				System.out.println(blue+"https://open.spotify.com/playlist/67gEI9obK7uwe2syWqchgy?si=7ac7f04dfcc4495a"+reset);
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {
					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					hindi();
				}

			} else if (choice == 'n' || choice == 'N') {
				System.out.println("===================================================");
				System.out.println("|Thankyou! Hope you enjoyed the overall experience|");
				System.out.println("===================================================");
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {
					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					hindi();
				}

			} else {
				System.err.println("------Enter corresponding input------");
				hindi();
			}
			sc.close();
		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");
			hindi();
		}

	}

	public void tamil() {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Here are the HeartBreak Tamil Songs.");
			System.out.println("");
			System.out.println("Ennai Vittu -" 
					+ " https://open.spotify.com/track/3LP4QpKptfe2yEC7oG5iNa?si=0a20bf721e9c490a");
			System.out.println(
					"Kanave Kanave - https://open.spotify.com/track/6sPW145Y3LSXd4p1LjBOcS?si=a1e272ac08b7478d");
			System.out.println("Sadhaa - https://open.spotify.com/track/1f0OALoEDECPNMuMUmjqJO?si=542d6797c4a54bc6");
			System.out.println(
					"Pirai Thedum - https://open.spotify.com/track/4Dd5XLOdAAmURIZSLThPvH?si=18f2f78b1f5c40a7");
			System.out.println("Mukilinte - https://open.spotify.com/track/0rTuNcDinTfNqaq6atIm7G?si=f7d94a5eee154989");
			System.out.println("");
			System.out.println(
					"I think so this will be enough for you. If you want more I can give a whole playlist link? (y/n)");
			char choice = sc.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				System.out.println("👇 Link is here 👇.");
				System.out.println(blue+"https://open.spotify.com/playlist/2Yj8HX1nPN53OAvmJNgr7a?si=85315ae48deb45ff"+reset);
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {

					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					tamil();
				}

			} else if (choice == 'n' || choice == 'N') {
				System.out.println("===================================================");
				System.out.println("|Thankyou! Hope you enjoyed the overall experience|");
				System.out.println("===================================================");
				System.out.println("Press 1 to explore more or Press 0 to exit");
				int back = sc.nextInt();
				if (back == 1) {
					typescheck();
				} else if (back == 0) {
					System.err.println("Programm Terminated");
					System.exit(0);
				} else {
					System.err.println("------Enter valid number only------");
					tamil();
				}

			} else {
				System.err.println("------Enter corresponding input------");
				tamil();
			}
			sc.close();
		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");
			tamil();
		}

	}
}
