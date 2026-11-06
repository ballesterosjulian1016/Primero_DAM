import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		final int FILAS=2;
		final int COLUMNAS=2;
		int matriz1 [][]= new int [FILAS][COLUMNAS];
		int matriz2 [][]= new int [FILAS][COLUMNAS];
		
		int resultados [][]= new int [FILAS][COLUMNAS];
		
		System.out.println("==VALORES DE LA MATRIZ1==");
		for(int i=0;i<matriz1.length; i++) {
			for(int j=0; j<matriz1[0].length; j++) {
				System.out.print("Escriba el valor para la fila ["+i+" y columna "+j+"] de la matriz 1:");
				matriz1[i][j]=sc.nextInt();
					
			}
			}
		System.out.println("==VALORES DE LA MATRIZ2==");
		for (int i=0; i<matriz2.length;i++) {
			for(int j=0; j<matriz2[0].length; j++) {
				System.out.print("Escriba el valor para la fila ["+i+" y columna "+j+"] de la matriz 2:");
				matriz2[i][j]=sc.nextInt();
				
				 resultados[i][j]=matriz1[i][j]+matriz2[i][j];
			}
		}
		System.out.println("==RESULTADO DE LAS MATRICEZ==");
			for (int i=0; i<resultados.length;i++) {
				for(int j=0;j<resultados[i].length; j++) {
					System.out.print(resultados [i][j]+"");
					
				}
			}
		System.out.println();
		}
			
		
		

	}


