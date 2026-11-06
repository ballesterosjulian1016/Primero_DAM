import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		final int FILAS=3;
		final int COLUMNAS=3;
		int arraybid [] [] = new int [FILAS][COLUMNAS];
		
		System.out.println("==CONTENIDO MATRIZ 3X3==");
		for (int i=0;i<arraybid.length;i++) {
			for (int j=0;j<arraybid[0].length;j++) {
				System.out.print("numero de posicion ["+i+","+j+"]:");
				arraybid[i][j]=sc.nextInt();
			}
			
		}
		
	}

}
