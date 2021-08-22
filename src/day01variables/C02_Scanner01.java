package day01variables;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
		
	//  Kullanicidan Bilgi almak icin 3 adima ihtiyacimiz var
	// 1- Scanner class' indan bir obje olusturuyoruz.
		
 Scanner scan = new Scanner(System.in);
 
	// 2- Kullaniciya ne istedigimizi bildiren bir mesaj yazin.	
 
 System.out.println("Lütfen isminizi giriniz");
 
 // Kullanicidan istedigimiz bilginin türüne göre bir variable olusturup konsolda yazilan bilgiyi 
 // kodlarimizin icine aliyoruz.
 
 String kullanicininIsmi = scan.nextLine();
 
 System.out.println("Girdiginiz isim : " +  kullanicininIsmi);
 
 
		
	}

}
 