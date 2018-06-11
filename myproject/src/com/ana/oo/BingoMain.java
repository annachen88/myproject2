package com.ana.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoMain {
	/*
	 * 讀取bingo.txt 25 8,4,7,18,21,3,5,1,9,10
	 * 
	 * 25表示有5X5 25顆球 產生時亂數印出 5 6 7 8 9 10 1 2 3 4 8 11
	 * 
	 */
	int a, b;

	public BingoMain() {

	}

	public void BingoPrint() {
		try {
			FileReader read = new FileReader("bingo.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
			a = Integer.parseInt(line);
			b = (int) Math.sqrt(a);
			// System.out.println(b);
			String line2 = in.readLine();
			String[] taken = line2.split(",");

			/*
			 * for(int i=0;i<taken.length;i++) { int[] taken2 = Integer.parseInt(taken); }
			 */

			// 加入數字;印出
			List<String> bingo = new ArrayList<String>();
			for (int i = 0; i < a; i++) {
				bingo.add(new Integer(i + 1).toString());
			}
			/*
			 * int i=0; for(String str:strings){
			 * intarray[i]=Integer.parseInt(str);//Exception in this line i++; }
			 */
			for (int i = 0; i < a; i++) {
				System.out.print(bingo.get(i) + "	");
				if (i % b == 4) {
					System.out.println();
				}
			}System.out.println();
				// 打亂
				Collections.shuffle(bingo);
				for (int j = 0; j < a; j++) {
					// Collections.shuffle(bingo);
					System.out.print(bingo.get(j) + "	");
					if (j % b == 4) {
						System.out.println();
					}
				}
				System.out.println();
				// 改成"o"
				// for (int i =0;i<=a;i++) {
				// taken[i]=
				// }
				for (int k = 0; k < a; k++) {
					for (int j = 0; j < taken.length; j++) {
						if (bingo.get(k).equals(taken[j])) {
							String circle = "O";
							bingo.set(k, circle);
							// System.out.println("o");
						}
					}
				}
				for (int l = 0; l < a; l++) {
					System.out.print(bingo.get(l) + "	");
					if (l % b == 4) {
						System.out.println();
					}
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		BingoMain bingo = new BingoMain();
		bingo.BingoPrint();
	}

}
