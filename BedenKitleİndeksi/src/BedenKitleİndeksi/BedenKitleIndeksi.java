package BedenKitle�ndeksi;

import java.util.Scanner;

public class BedenKitleIndeksi {

	public static void main(String[] args) {
		
	/*
	 Kullan�c�dan al�nan boy ve kilo de�erlerine g�re beden kitle indeksini hesaplay�n�z.
	 
	 BKI 18.5'un alt�ndaysa          --> Zay�f
	 BKI 18.5 ile 25 aras�ndaysa     --> Normal
	 BKI 25 ile 30 aras�ndayda       --> Fazla kilolu
	 BKI 30'un �zerindeyse           --> Obez 
	 
	 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Kilonuz: ");
		int kilo = scan.nextInt();
		
		System.out.println("Boyunuz: (�rnek: 1,75");
		double boy = scan.nextDouble();
		
		double bki = (kilo / boy * boy );
		
		if(bki < 18.5) {
			System.out.println("Zay�f");
		}
		else if(bki >= 18.5 && bki <25) {
			System.out.println("Normal");
		}
		else if(bki >= 25 && bki < 30) {
			System.out.println("Fazla kilolu");
		}
		else {
			System.out.println("Obez");
		}
		
		
		
		
		
		
		
		
	}

}
