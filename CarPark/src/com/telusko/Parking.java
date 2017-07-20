package com.telusko;

import java.io.InputStream;

public class Parking extends Vehicle
{

	public void park(String s )
	{
		if(slots==0)
		System.out.println("sorry lot fulled " );
		
		else
			System.out.println("car parked " );
		slots--;
		

	}
	public void avilable(String r)
	{ 
		
		System.out.println("parking slots available"  +slots);
	}
	public void left(String l){
		if(slots==max)
			System.out.println("no cars to leave");
		else
		System.out.println("car left from slot" );
		slots++;
	}
}
