public class BubbleSort{
public static void main(String args[]){
	int[] vet = {5, 3, 2, 4, 7, 1, 0, 6};
	int aux = 0;
	int i = 0;

	System.out.println("Vetor desordenado: ");
	    for(i = 0; i<vet.length; i++){
	    	System.out.print(" "+vet[i]);
	    }
	    System.out.println(" ");

	    for(i = 0; i<vet.length; i++){
	    	for(int j = 0; j < vet.length - 1 - i; j++){
		    	if(vet[j] > vet[j + 1]){
			    	aux = vet[j];
			    	vet[j] = vet[j+1];
			    	vet[j+1] = aux;
		    	}
	    	}
	    }
	    System.out.println("Vetor organizado:");
	    for(i = 0; i<vet.length; i++){
		    System.out.print(" "+vet[i]);
	    }
    }
}