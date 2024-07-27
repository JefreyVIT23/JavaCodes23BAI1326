/*
Registration Number: 23BAI1326
Date: 23/7/2024
Subject: Switch Case
*/

class Pgm16
{
public static void main(String[] Args)
{
	String day = "Mon";
	switch(day)
	{
		case "Mon":
			System.out.println("Monday");
			break;
		case "Tues":
			System.out.println("Tuesday");
			break;
		case "Wed":
			System.out.println("Wednesday"); 
			break;
		case "Thurs":
			System.out.println("Thursday");
			break;
		case "Fri":
			System.out.println("Friday");
			break;
		case "Sat":
			System.out.println("Saturday");
			break;
		case "Sun":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Day not found");
	}
}
}