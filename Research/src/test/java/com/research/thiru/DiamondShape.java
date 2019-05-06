package com.research.thiru;

import java.util.Scanner;

public class DiamondShape {

	public DiamondShape(){
		int number = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int n = in.nextInt();
		int space = n-1;
		for (int i=0; i<n; i++){
			for (int j=0; j<space; j++){
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++){
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
			space--;
		}
		space =0;
		number =number-2;
		for (int i=n; i>0; i--){
			for (int j=0; j<=space; j++){
				System.out.print(" ");
			}
			for (int k=1; k<i; k++){
				System.out.print(number+" ");
				number--;
			}
			System.out.println();
			space++;
			}
	}
	public static void main(String args[]){
		DiamondShape ds = new DiamondShape();
	}
}
