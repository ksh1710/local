package src;

import java.util.Scanner;

public class Ques3 {
	public static void main(String args[]) {
		int newarr[][] = new int[3][];
		Scanner sc = new Scanner(System.in);
		newarr[0] = new int[4];
		newarr[1] = new int[2];
		newarr[2] = new int[5];
		for(int i=0;i<3;i++) {
			for(int j=0;j<newarr[i].length;j++) {
				System.out.println("enter element");
						
				newarr[i][j]=sc.nextInt();
				}

		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<newarr[i].length;j++) {
		System.out.print(newarr[i][j]);
		}
			System.out.println();
		}

sc.close();
		
}
}

