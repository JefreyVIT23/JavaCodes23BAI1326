/*
Registration Number: 23BAI1326
Date: 29/7/2024
Subject: Armstrong Number
*/

import java.util.*;
class Pgm26
{
public static void main(String[] Args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter start and end index: ");
	int st = sc.nextInt();
	int en = sc.nextInt();
	System.out.print("Armstrong numbers are: ");
	int a;
	int s=0;
	for(int i =st;i<=en;i++)
{
	a = i;
	s=0;
	while(a>0)
	{
		s+=Math.pow(a%10,3);	
		a/=10;
	}
	if(i==s)
	System.out.print(i+", ");
}
}	
}