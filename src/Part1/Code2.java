package Part1;

import java.util.Scanner;

public class Code2{
	static void endEs(String temp){
		if(temp.endsWith("es")){
			System.out.println("\nEnds with:- es \n");
		}
		else if (temp.charAt(temp.length()-2)=='e'){
			System.out.println("\nEnds with:- e\n");
		}
		else if (temp.charAt(temp.length()-1)=='s'){
			System.out.println("\nEnds with:- s\n");
		}
		else{
			System.out.println("\nNo es found\n");
		}
	}
	
	public static void main(String args[]){
		
		String Name;
		System.out.println("\n\tPractical-2\n");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\nEnter the String:- ");
		Name = sc.nextLine();
		System.out.println("Length of String\t"+Name.length());
		
		endEs(Name);
		System.out.println("\n19CE055 Vivek D Kapadia\n");
		sc.close();
	}
}	
		