package com.MRS;
 import java.util.*;
 class Login  {
 	private String username="zaid";
 	private String password="zaid";
 	private String email;
 	private String cpassword;
 
 	public void setUsername(String username) {
 		this.username = username;
 	}
 
 	public void setPassword(String password) {
 		this.password = password;
 	}
 
 	public void setEmail(String email) {
 		this.email = email;
 	}
 
 	public String getCpassword() {
 		return cpassword;
 	}
 
 	public void setCpassword(String cpassword) {
 		this.cpassword = cpassword;
 	}
 
 	public String getUsername() {
 		return this.username;
 	}
 
 	public String getPassword() {
 		return this.password;
 	}
 
 	public String getEmail() {
 		return this.email;
 	}
 
 	public void userverification() {
 		Scanner sc = new Scanner(System.in);
 		Mood md = new Mood();
 		boolean check=true ;
 		try {
 			System.out.println("New Account (true/false) ??");
 			check = sc.nextBoolean();
 		}
 		catch(Exception er) {
 			System.err.println("invlaid");
 			userverification();
 			
 		}if (check == false) {
 				System.out.println("Enter username:");
 				sc.nextLine();
 				String inputUsername = sc.nextLine();
 				System.out.println("Enter password:");
 				String inputPassword = sc.nextLine();
 				if (this.getUsername().equals(inputUsername) && this.getPassword().equals(inputPassword)) {
 					captchavalidation();
 					System.out.println("Login Successful");
 					System.out.println("------Welcome------");
 					md.MoodInput();
 				} else {
 					captchavalidation();
 					System.out.println("No records found... create new account or retry login");
 					userverification();
 				}
 			} else {
 				check= true;
 				System.out.println("Create username:");
 				sc.nextLine();
 				String inputUsername = sc.nextLine();
 				System.out.println("Enter new password:");
 				String inputPassword = sc.nextLine();
 				System.out.println("Confirm Password");
 				String cpassword = sc.nextLine();
 				if (inputPassword.equals(cpassword)) {
 					System.out.println("Password Matched");
 					captchavalidation();
 				} else {
 					System.out.println("Password doesnt match...");
 					passwordvalidation();
 				}
 
 				emailvalidation();
 			}
 
 		
// 		catch (Throwable tr) {
// 			System.err.println("Invalid input");
// 			userverification();
// 
// 		}
 	}
 
 	public void emailvalidation() {
 		Mood mood = new Mood();
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter email:");
 		String inputEmail = sc.nextLine();
 		if (inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@yahoo.com")
 				|| inputEmail.endsWith("@outlook.com") || inputEmail.endsWith("@hotmail.com")) {
 			System.out.println("Email Verified");
 			System.out.println("------Welcome------");
 			mood.MoodInput();
 			
 		} else {
 			System.err.println("Invalid Email");
 			emailvalidation();
 		}
 	}
 
 	public void passwordvalidation() {
 		try {
 			Scanner sc = new Scanner(System.in);
 			System.out.println("Enter password again:");
 			String inputPassword = sc.nextLine();
 			System.out.println("Confirm Password");
 			String cpassword = sc.nextLine();
 			if (inputPassword.equals(cpassword)) {
 				captchavalidation();
 			} else {
 				System.out.println("Password doesnt match...");
 				passwordvalidation();
 			}
 		} catch (Throwable tr) {
 			System.err.println("Invalid Input");
 			passwordvalidation();
 		}
 	}
 
 	public void captchavalidation() {
 		String captcha = "";
 		Random r = new Random();
 		while (captcha.length() < 6) {
 			int n = r.nextInt(123);
 			if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122) || (n >= 48 && n <= 57)) {
 				captcha = captcha + (char) n;
 			}
 		}
 		System.out.println(captcha);
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter the above captcha");
 		String userCaptcha = sc.nextLine();
 		if (captcha.equals(userCaptcha)) {
 			System.out.println("Captcha Verified");
 
 		} else {
 			System.err.println("Enter captcha again");
 			captchavalidation();
 		}
 
 	}
 
 }
public class Login_main {
	static {

		System.out.println(
				"+---------------------------------------------------------------------------------------------------------+");
		System.out.println(
				"|                             Welcome To Harmony Blend - A Fusion Music Blender                           |");
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------+");
	}

	public static void main(String[] args) {
	 	Login sl = new Login();
 		sl.setEmail("z@gmail.com");
  		sl.setPassword("zaid");
  		sl.setUsername("zaid");
  	//	sl.userverification();
Mood md = new Mood();
md.MoodInput();
}}
 
