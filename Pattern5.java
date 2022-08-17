package com.paramita;
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum number of stars:");
		int n=sc.nextInt();//n=14 accepted 
		for(int i=0;i<n;i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i=1;i<(n-1)/2;i++) {
			for(int j=n/2;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=(n-1)/2;i<=n;i++) {
			for(int j=n/2;j<=i;j++) {
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
