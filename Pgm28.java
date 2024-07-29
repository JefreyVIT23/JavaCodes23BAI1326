/*
Registration Number: 23BAI1326
Date: 29/7/2024
Subject: LCM Calculate
*/

import java.util.*;
class Pgm28
{
public static void main(String[] Args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter start and end index: ");
	int s = sc.nextInt();
	int l = sc.nextInt(),temp;
	if(s>l)
	{s=s+l;
	l=s-l;
	s=s-l;}
	while(l%s!=0)
	{
		temp = s;
		s = l%s;
		l = s;
	}
	System.out.println(s);
	
}	
}