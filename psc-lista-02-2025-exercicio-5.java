/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner enterScanner = new Scanner(System.in);
	   
		System.out.println("Viagem Eurotrip");
		System.out.println("Preço Alemanha: ");
		double ale = enterScanner.nextDouble();
		System.out.println("Quantidade de pessoas Alemanha: ");
		int ale_p = enterScanner.nextInt();
		double total_alemanha = ale * ale_p;
		System.out.println("Total viagem Alemanha: R$ " + total_alemanha);
		
		System.out.println("Preço Portugal: ");
		double port = enterScanner.nextDouble();
		System.out.println("Quantidade de pessoas Portugal: ");
		int port_p = enterScanner.nextInt();
		double total_Portugal = port * port_p;
		System.out.println("Total viagem Portugal: R$ " + total_Portugal);
		
		System.out.println("Preço Itália: ");
		double ita = enterScanner.nextDouble();
		System.out.println("Quantidade de pessoas Itália: ");
		int ita_p = enterScanner.nextInt();
		double total_italia = ita * ita_p;
		System.out.println("Total viagem Itália: R$ " + total_italia);
		
		double total_viagens = total_alemanha+total_Portugal+total_italia;
		
		System.out.println("Valores totais gastos: R$" + total_viagens);
		
		enterScanner.close();
	}
}
