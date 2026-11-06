import java.util.Scanner;

public class ejercicioTresArray {

	public static void main(String[] args) {
		
	int numeroDni, posicion;	
    Scanner sc = new Scanner(System.in);
    String letras []= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E",""};
    
    System.out.println("dime tu DNI: ");
    numeroDni= sc.nextInt();
    posicion= numeroDni%23;
    
    System.out.println("el dni es :"+numeroDni+letras[posicion]);
	}

}
