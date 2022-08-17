package com.paramita;
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of stars to be printed: ");
		int n=sc.nextInt();//14 accepted as input to match given pattern
		for(int i=1;i<n/2;i++) {
			for(int j=1;j<n;j++) {
				System.out.println("   ");
			}
		}
		for(int i=1;i<=n/2;i++) {
			for(int j=i-1;j<=2*i-2;j++) {
				System.out.print("* ");
			}
			for(int j=(n-1)/2;j>i-1;j--) {
				System.out.print("    ");
			}
			for(int j=i-1;j<=2*i-2;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			System.out.print("* ");
		}
		sc.close();
	}
}