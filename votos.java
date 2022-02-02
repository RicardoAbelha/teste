import java.util.Scanner;

public class votos {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      int eleitores, brancos, nulos, validos;
      double percBrancos, percNulos, percValidos;

      System.out.printf("Digite o numero total de eleitopres:\n");
      eleitores = ler.nextInt();
      System.out.printf("\nDigite o numero de votos validos:\n");
      validos = ler.nextInt();
      System.out.printf("\nDigites o numero de votos em branco:\n");
      brancos = ler.nextInt();
      System.out.printf("\nDigite o numero de votos nulos:\n");
      nulos = ler.nextInt();

      percValidos = ((double)validos / eleitores) * 100;
      percBrancos = ((double)brancos / eleitores) * 100;
      percNulos = ((double)nulos / eleitores) * 100;

      System.out.printf("\n\n%6.2f%% de votos validos.", percValidos);
      System.out.printf("\n%6.2f%% de votos em branco.", percBrancos);
      System.out.printf("\n%6.2f%% de votos nulos.\n", percNulos);
    }

}