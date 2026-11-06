import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		final int FILAS=5;
		int COLUMNAS;
		
		Scanner sc=new Scanner (System.in);
		System.out.print("dime el numero de columnas :");
		 COLUMNAS = sc.nextInt();
		int arraybid [][]= new int [FILAS][COLUMNAS];
		for(int i=0; i<arraybid.length;i++) {
			for(int j=0;j<arraybid[i].length;j++){
				System.out.print("numero de posicion ["+i+","+j+"]:");
				arraybid[i][j]=sc.nextInt();
			}
		}
		

	}

}
