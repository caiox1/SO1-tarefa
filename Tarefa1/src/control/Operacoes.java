package control;
import java.util.Scanner;

public class Operacoes {
    
    public void ex1(){
        int vet[] = new int [1000];
        int vet2[] = new int [10000];
        int vet3[] = new int [100000];
        
        int vetlargura = vet.length;
        double tempoInicial=System.nanoTime();
         for(int i = 0; i < vetlargura; i++){
             vet[i] = 0;
         }
        double tempoFinal=System.nanoTime();
        double tempoTotal=tempoFinal-tempoInicial;
        System.out.println("Tempo de execução: (vet 1000) " + (tempoTotal / Math.pow(10, 9)) + "s");

        vetlargura = vet2.length;
        tempoInicial=System.nanoTime();
         for(int i = 0; i < vetlargura; i++){
             vet2[i] = 0;
         }
        tempoFinal=System.nanoTime();
        tempoTotal=tempoFinal-tempoInicial;
        System.out.println("Tempo de execução: (vet 10000) " + (tempoTotal / Math.pow(10, 9)) + "s");

        vetlargura = vet3.length;
        tempoInicial=System.nanoTime();
         for(int i = 0; i < vetlargura; i++){
             vet3[i] = 0;
         }
        tempoFinal=System.nanoTime();
        tempoTotal=tempoFinal-tempoInicial;
        System.out.println("Tempo de execução: (vet 100000) " + (tempoTotal / Math.pow(10, 9)) + "s\n\n");
     }

    public void ex2(){
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        String texto;
        do{        
            cont = 0;
            System.out.println("Digite a frase, se nao for ditado nada o programa acaba");
            texto = scan.nextLine();
            String [] fraseDiv = texto.split(";");
            
            for(String x : fraseDiv){
            cont++;    
            }
          System.out.println(cont);
        } while(texto != "");
        scan.close();
    }
}
