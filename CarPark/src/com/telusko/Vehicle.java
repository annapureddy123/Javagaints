package com.telusko;

import java.util.Scanner;

public class Vehicle {
	static int slots;
static int max;
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of parking slots available");
		slots = sc.nextInt();
		max=slots;
		System.out.println(slots);
		System.out.println("parking enter : p");
		System.out.println("remove a car : l");
		System.out.println("available slots :c");
		while (true) {
			String s = sc.next();

			Parking p = new Parking();
			if (s.equals("p")) {
				p.park(s);
//				if(slots==0)
//					System.out.println("lot full");
//				else
//					slots--;

				System.out.println(slots);
			} else if (s.equals("l")) {
				p.left(s);
//				if(slots==max)
//					System.out.println("no cars to leave");
//				else
//					slots++;

			} else if (s.equals("c")) {
				p.avilable(s);

			} else {
				throw new Exception("invalid output");
			}

		}

	}

}