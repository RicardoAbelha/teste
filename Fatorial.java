import java.util.Scanner;

public class Fatorial {

    
    public static void main (String args[]){

        Scanner ler = new Scanner(System.in);
        double x;
        System.out.printf("Digite o numero a ser fatorado:\n");
        x = ler.nextDouble();
       
        double f = x;
        while (x > 1){ 
    
        f = f *(x-1); 
        x--; 
        
        }
        System.out.println("O valor fatorado é: " +f); 
    }
}