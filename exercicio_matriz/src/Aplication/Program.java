package Aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.printf("Digite as dimensões: ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		Integer [][] mat = new Integer [M][N];
		
		System.out.println("Preencha a matriz: ");
		for(int i=0;i<M;i++) {                              
			for (int j=0;j<N;j++){
				mat [i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<M;i++) {
			for (int j=0;j<N;j++){
				System.out.printf("%d ",mat[i][j]);
			}
			System.out.println();
		}				
		
		
		
		System.out.printf("Numero a ser encontrado: ");
		
		int search = sc.nextInt();
		for(int i=0;i<M;i++) {
			for (int j=0;j<N;j++){
				if (mat[i][j] == search) {
					System.out.println("Position: " + i +", "+ j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if (i < mat[i].length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
				}
			}
		}			
		sc.close();
	}

}
