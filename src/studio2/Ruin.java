package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your start amount? ");
		int startAmount = in.nextInt(); 
		
		System.out.println("What are your chances of winning?)");
		int winChance = in.nextInt();
		
		System.out.println("What is your win limit? ");
		int winLimit = in.nextInt();
		
		int someAmount;
		while (someAmount>0 || someAmount > winLimit
		{
			if((Math.random() >= (winChance))
					{
					startAmount++;
					System.out.println("WIN");
					}
			else 
			{
				startAmount--;
				System.out.println("RUIN");
			}
		}