/*
 * Created by: 21343001_ADELINA SUCIKO
 */

package com.uts;

import java.util.Scanner;
public class UTS2 {

	public static void main(String[] args) {
	
		try (Scanner input = new Scanner(System.in)) {
			int n;
			
			System.out.println("Nama: Adelina Suciko");
			System.out.println("Nim: 21343001");
			System.out.println("==========================");
			System.out.println("Jumlah baris: ");
			n = input.nextInt();
			
			System.out.println();	
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(" ");
				}
				for(int j=i; j<=n; j++) {
					System.out.print(" #");
				}
				System.out.println();
			}
			
			for(int i=1; i<=n; i++) {
				for(int j=i; j<=n; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}

}
