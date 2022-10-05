import java.util.Scanner;


public class AnagraficaUtente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("INSERIMENTO DATI ANAGRAFICI\n");
		
		System.out.print("nome: ");
		String nome = sc.nextLine();
		
		System.out.print("cognome: ");
		String cognome = sc.nextLine();
		
		System.out.print("Luogo di nascita: ");
		String luogoNascita = sc.nextLine();
		
		System.out.print("Età: ");
		int eta = sc.nextInt();
		
		System.out.print("Altezza: ");
		int altezza = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Patente, [Si]/[No]");
		String possessoPatente = sc.nextLine();
		
		System.out.print("Genere: [M]/F][A]");
		char genere = sc.next().charAt(0);
		
		sc.close();
		
		System.out.println("\nRIEPILOGO DELLE INFO INSERITE\n");
		
		System.out.println("Nome: "+nome+"\nCognome: "+cognome+"\nLuogo di nascita: "+luogoNascita
				+"\nEtà: "+eta+"anni"+"\nAltezza: "+altezza+"cm"+"\nPatente: "+possessoPatente
				+"\nGenere: "+Character.toUpperCase(genere));

	}

}
