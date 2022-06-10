import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   
    Scanner Ler = new Scanner(System.in);

    int numeroCentral;
    System.out.println("Algoritmo para descobrir um número antecessor e sucessor de um número.");
    System.out.println("Digita um número: ");
    numeroCentral = Ler.nextInt();
    
    
    System.out.print("Número antecessor: ");
    System.out.print(numeroCentral - 1);
    System.out.print("\n Número central: ");
    System.out.print(numeroCentral);
    System.out.print("\n Número sucessor: ");
    System.out.print(numeroCentral + 1);

    


    
  }
}