package fortuneteller;

import java.util.Scanner;

public class FortuneTellerTest {

	public static void main(String[] args) {

		FortuneTeller fortuneTeller = new FortuneTeller();
		boolean useFortuneTeller; // test at end to see if user would like to
									// try again
		Scanner scanner = new Scanner(System.in); // open input

		// initializing variables
		int retire = 0; // year user will retire
		int savings = 0; // savings user will have
		String location = null; // city where user will live
		String car = null; // car user will drive

		do {
			System.out.println("What is your first name? "); // name
			String firstName = scanner.next();
			System.out.println("What is your last name? "); // last name
			String lastName = scanner.next();
			System.out.println("How old are you? "); // age
			int age = scanner.nextInt();
			System.out.println("In which month were you born? "); // month
			String month = scanner.next();

			System.out.println(
					"Which of the ROYGBIV colors are your favorite? (If you don't know what ROYGBIV is, enter \"Help\")");
			String favColor = scanner.next();
			favColor.toLowerCase(); // make it lower case if there were any caps

			boolean needsHelp = false;

			if (favColor.equals("help")) {
				needsHelp = true;
			}

			while (needsHelp) { // if they typed help, offer more info and
								// prompt
								// for fav color again
				System.out.println(
						"Red, Orange, Yellow, Green, Blue, Indigo, Violet... \n Which of the ROYGBIV colors are your favorite?");
				String x = scanner.next();
				if (x.equals("help")) {
					needsHelp = true;
				} else {
					needsHelp = false;
					favColor = x;
				}

			}

			System.out.println("How many siblings do you have?"); // siblings
			int siblings = scanner.nextInt();

			// Part II
			if (age % 2 == 0) { // if age is even or odd, assign stuff
				retire = 30;
			} else {
				retire = 40;
			}

			switch (siblings) { // if siblings = 0, 1, 2, 3, >3, assign stuff

			case 0:
				location = "Bacelona";
				break;

			case 1:
				location = "Fiji";
				break;

			case 2:
				location = "Buenos Aires";
				break;

			case 3:
				location = "Kyoto";
				break;

			default:
				location = "Calgary";
			}

			switch (favColor) { // for their favColor assign car stuff

			case "red":
				car = "Chevy Impala";
				break;

			case "Orange":
				car = "Ford Fusion";
				break;

			case "Yellow":
				car = "Dodge Intrepid";
				break;

			case "Green":
				car = "Chrysler 300C";
				break;

			case "Blue":
				car = "Jeep Grand Cherokee";
				break;

			case "Indigo":
				car = "Nissan 240SX";
				break;

			case "Violet":
				car = "Honda Civic";
				break;

			default:
				car = "Toyota Prius";
			}

			month.toLowerCase();
			firstName.toLowerCase();
			lastName.toLowerCase();

			String x = month.substring(0, 0);
			boolean stillGoing = true;

			if (firstName.contains(x) && stillGoing == true) { // if the first
																// letter of the
																// birth
				// month can be found in the first name
				savings = 40000;
				stillGoing = false;

			} else if (lastName.contains(x) && stillGoing == true){ // or last
																	// name			{
				savings = 40000;
				stillGoing = false;

			} else if (stillGoing == true) {
				String y = month.substring(1, 1); // move on to the next letter
			} else if (firstName.contains(x) && stillGoing == true) {
				// if second letter of the birth month can be found in the first
				// name
				savings = 1000000;
				stillGoing = false;

			} else if (lastName.contains(x) && stillGoing == true) { // or last
																		// name
				savings = 1000000;
				stillGoing = false;

			} else if (stillGoing == true) {
				x = month.substring(2, 2); // move on to the third letter

			} else if (firstName.contains(x) && stillGoing == true) {
				// if third letter of the birth month can be found in the first
				// name

				savings = 2000000;
				stillGoing = false;

			} else if (lastName.contains(x) && stillGoing == true) { // or last
																		// name
				savings = 2000000;
				stillGoing = false;

			} else if (stillGoing == true) { // there are no common letters
				savings = 100;
			}

			// Part III
			System.out.println(firstName + " " + lastName + " will retire in " + retire + " years with " + savings
					+ " in the bank, a vacation home in " + location + " and a " + car + ". ");
			// siblings

			// would the user like to try again?
			System.out.println("Try again? yes or no");
			String response = scanner.next();
			response.toLowerCase();
			useFortuneTeller = response.equals("yes");

		} while (useFortuneTeller); // while they type yes, keep doing fortune
									// telling
		System.out.println("Goodbye");
		scanner.close();
	}
}