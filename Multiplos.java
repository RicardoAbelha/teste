import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int x = 3;
        int z = 5;
        int somax = 0;
        int somaz = 0;
        int res;
        int valor = 0;

        System.out.printf("Digite o numero :\n");
        valor = ler.nextInt();

        for(int i = 1; i < valor; i++) {
            if(x % i == 0) {
                somax = i + i;
            }
        }
        for(int i = 1; i < valor; i++) {
            if(z % i == 0) {
                somaz = i + i;
            }
        }
        res = somax + somaz;

        System.out.println("A soma dos multiplos de 3 e 5 abaixo do numero é: " +res);

    }
}