package com.greatlearning.que1;

import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class Driver {
	
	
	
	static void printOrderOfConstruction (List<Integer> inputList)
	{
		int largestFloor=inputList.size(); 
		Stack<Integer> floorStack = new Stack<Integer>();
		
		for(int i=0;i<inputList.size();i++)
		{
			floorStack.push(inputList.get(i));
			System.out.println("Day "+ (i+1));
			while( !floorStack.isEmpty() &&  floorStack.peek()==largestFloor)
			{
				
				System.out.print(floorStack.pop()+" ");
				largestFloor--;	
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of floors in the building");
		
		int noOfFloors = sc.nextInt();
		
		
		
		List<Integer> inputList = new ArrayList<Integer>();
		
		for(int i=1;i<=noOfFloors;i++)
		{
			
			System.out.println("enter the floor size given on day " + i);
			inputList.add(sc.nextInt());
		}
		
		printOrderOfConstruction(inputList);
		
		

	}

}
