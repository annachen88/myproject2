package myproject;

import java.util.Scanner;

public class Date {

	public Date() {
	}

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int number =scanner.nextInt();
		int n = 100;
		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i <= m.length; i++) {
			if (n - m[i] >= m[i + 1]) {
				n = n - m[i];
				
			} 
			else {
				if (n - m[i] <= m[i + 1]) {
					n = n - m[i];
					
				}System.out.println((i+2 ) + "月" + (n) + "日");
				break;

			}
		}
	}

}
