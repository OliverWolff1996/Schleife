import java.util.Scanner;

public class Schleife2 {
	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		Scanner myScanner2 = new Scanner(System.in);
		Scanner myScanner = new Scanner(System.in);
		float Kontostand = 1000;
		System.out.println("Bitte Dispositionskredit eingeben");
		float Dispositionskredit = myScanner2.nextFloat();
		while(Kontostand >= Dispositionskredit)
		{			
			System.out.println("Bitte Geldbetrag eingeben");
			float Abbuchung = myScanner.nextFloat();
			 Kontostand = Kontostand-Abbuchung ;
			if (Kontostand >= Dispositionskredit)	{
			System.out.println("Kontostand beträgt : " + Kontostand);
			
			} else {
			System.out.println("Konto überzogen :" + (Kontostand-Dispositionskredit));
			}
		}
	
}


}

