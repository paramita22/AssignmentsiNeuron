package com.paramita;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of stars to print:");
		int n=sc.nextInt();//n=14 is entered to match given pattern
		System.out.println();
		for(int i=1;i<=n/2;i++) {
			for(int j=n/2;j>i-1;j--) {
				System.out.print("* ");
			}
			for(int j=i;j<2*i-1;j++) {
				System.out.print("    ");
			}
			for(int j=n/2;j>i-1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(j==0) {
				System.out.print("* ");
			}
			else if(j==n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			System.out.print("* ");
		}
		sc.close();
		
	}

}
