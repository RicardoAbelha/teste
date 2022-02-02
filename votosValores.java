public class votosValores {

    public static void main(String[] args) {
      
      int eleitores = 1000;
      int brancos = 150;
      int nulos = 50;
      int validos = 800;
      double percBrancos, percNulos, percValidos;

      percValidos = ((double)validos / eleitores) * 100;
      percBrancos = ((double)brancos / eleitores) * 100;
      percNulos = ((double)nulos / eleitores) * 100;

      System.out.printf("\n\n%6.2f%% de votos validos.", percValidos);
      System.out.printf("\n%6.2f%% de votos em branco.", percBrancos);
      System.out.printf("\n%6.2f%% de votos nulos.\n", percNulos);
    }

}