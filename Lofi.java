package com.MRS;
 
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lofi extends SadHours {
	String RESET = "\u001B[0m";
	String Blue = "\u001B[34m";

	public void lofimood() {
		System.out.println("1 --> Late Night Beats");
		System.out.println("2 --> Lofi Sleep");
		System.out.println("3 --> Feel Good Beats");
		System.out.println("4 --> Sunny Beats");
		System.out.println("5 --> Mellow Lofi Morning");
		System.out.println("6 --> Go-Back");

		Scanner sc = new Scanner(System.in);
		try {
			int input = sc.nextInt();
			switch (input) {
			case 5:
				mellowlofi();
				break;
			case 4:
				sunnylofi();
				break;
			case 3:
				feelgood();
				break;
			case 2:
				lofisleep();
				break;
			case 1:
				latenight();
				break;
			case 6:
				System.out.println("===========================================");
				MoodInput();
				break;
			default:
				System.err.println("------Enter valid input------");
				lofimood();
				break;

			}
		} catch (InputMismatchException ime) {
			System.err.println("------Enter valid input only------");
			lofimood();
		}
		sc.close();

	}

	private void sunnylofi() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					Blue + "https://open.spotify.com/playlist/37i9dQZF1DXbtuVQL4zoey?si=e21e60a0229a4d75" + RESET);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				lofimood();
			} else if (back == 0) {
				System.out.println("===================================================");
				System.out.println("Thankyou! Hope you enjoyed the overall experience");
				System.out.println("===================================================");
				System.out.println("");
				System.err.println("Programm Terminated");
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				sunnylofi();
			}
			sc.close();

		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");

			sunnylofi();
		}

	}

	private void feelgood() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					Blue + "https://open.spotify.com/playlist/37i9dQZF1DXcNb6Ba0LuVc?si=39953d0edb134041" + RESET);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				lofimood();
			} else if (back == 0) {
				System.out.println("===================================================");
				System.out.println("Thankyou! Hope you enjoyed the overall experience");
				System.out.println("===================================================");
				System.out.println("");
				System.err.println("Programm Terminated");
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				feelgood();
			}
			sc.close();

		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");
			feelgood();
		}

	}

	private void latenight() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					Blue + "https://open.spotify.com/playlist/37i9dQZF1DXdipfKDeMPTE?si=a93e23a881184710" + RESET);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				lofimood();
			} else if (back == 0) {
				System.out.println("===================================================");
				System.out.println("Thankyou! Hope you enjoyed the overall experience");
				System.out.println("===================================================");
				System.out.println("");
				System.err.println("Programm Terminated");
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				latenight();
			}
			sc.close();

		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");
			latenight();
		}

	}

	private void lofisleep() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					Blue + "https://open.spotify.com/playlist/37i9dQZF1DX2PQDq3PdrHQ?si=0de7efd16b55465a" + RESET);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				lofimood();
			} else if (back == 0) {
				System.out.println("===================================================");
				System.out.println("Thankyou! Hope you enjoyed the overall experience");
				System.out.println("===================================================");
				System.out.println("");
				System.err.println("Programm Terminated");
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				lofisleep();
			}
			sc.close();

		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");
			lofisleep();
		}
	}

	private void mellowlofi() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("👇 Link is here 👇.");
			System.out.println(
					Blue + "https://open.spotify.com/playlist/37i9dQZF1DX6QClArDhvcW?si=e2eaa8b3e50d45b9" + RESET);
			System.out.println("Press 1 to explore more or Press 0 to exit");
			int back = sc.nextInt();
			if (back == 1) {
				lofimood();
			} else if (back == 0) {
				System.out.println("===================================================");
				System.out.println("Thankyou! Hope you enjoyed the overall experience");
				System.out.println("===================================================");
				System.out.println("");
				System.err.println("Programm Terminated");
				System.exit(0);
			} else {
				System.err.println("------Enter valid number only------");
				mellowlofi();
			}
			sc.close();

		} catch (InputMismatchException ime) {
			System.err.println("------Enter corresponding input------");
			mellowlofi();
		}
	}
}
