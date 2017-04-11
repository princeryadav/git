package com.bridgeit.javaprogarms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String message="Hello <<name>>, We have your full name as <<full name>> in our system. "
						+ "your contact number is 91-xxxxxxxxxx. Please,"		
						+ "let us know in case of any clarification Thank you BridgeLabz 01/01/2016. ";
		
		String name="<<name>>";
		String fullName1="<<full name>>";
		String contactNumber="xxxxxxxxxx";
		String messageDate="01/01/2016";
		DateFormat dateFormat=new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
		Date date=new Date();
		System.out.println(dateFormat.format(date));
		String newDate=dateFormat.format(date);
		System.out.println("Enter your full name:");
		String fullName=scanner.nextLine();
		
		String[] userName=fullName.split(" ");
		
		System.out.println("Enter your phone number.:");
		String phoneNumber=scanner.nextLine();
		Pattern pattern;
		Matcher matcher;
		pattern=Pattern.compile(name);
		matcher=pattern.matcher(message);
		message=matcher.replaceAll(userName[0]);
		
		
		pattern=Pattern.compile(fullName1);
		matcher=pattern.matcher(message);
		message=matcher.replaceAll(fullName);
		
		
		pattern=Pattern.compile(contactNumber);
		matcher=pattern.matcher(message);
		message=matcher.replaceAll(phoneNumber);
		
		pattern=Pattern.compile(messageDate);
		matcher=pattern.matcher(message);
		message=matcher.replaceAll(newDate);
		
		
		System.out.println(message);
		scanner.close();
	}
}
