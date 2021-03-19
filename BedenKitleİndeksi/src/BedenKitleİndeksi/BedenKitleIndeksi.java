package BedenKitleÝndeksi;

import java.util.Scanner;

public class BedenKitleIndeksi {

	public static void main(String[] args) {
		
	/*
	 Kullanýcýdan alýnan boy ve kilo deðerlerine göre beden kitle indeksini hesaplayýnýz.
	 
	 BKI 18.5'un altýndaysa          --> Zayýf
	 BKI 18.5 ile 25 arasýndaysa     --> Normal
	 BKI 25 ile 30 arasýndayda       --> Fazla kilolu
	 BKI 30'un üzerindeyse           --> Obez 
	 
	 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Kilonuz: ");
		int kilo = scan.nextInt();
		
		System.out.println("Boyunuz: (Örnek: 1,75");
		double boy = scan.nextDouble();
		
		double bki = (kilo / boy * boy );
		
		if(bki < 18.5) {
			System.out.println("Zayýf");
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
