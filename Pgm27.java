/*
Registration Number: 23BAI1326
Date: 29/7/2024
Subject: Pattern Printing
*/

import java.util.*;
class Pgm27
{
public static void main(String[] Args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length");
	String s = "";
	int st = sc.nextInt();
	for(int i =0;i<st-2;i++)
	s+="  ";
	for(int i = 0;i<st;i++)
	System.out.print("* ");
	for(int i = 0;i<st;i++)
	System.out.print("\n* "+s+"*");
	System.out.print("\n");
	for(int i = 0;i<st;i++)
	System.out.print("* ");
}	
}