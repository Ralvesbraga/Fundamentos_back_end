import java.util.ArrayList;
import java.util.List;

public class Exemplos {
    public static void main(String[] args) {
        //Tipos primitivos de dados
        int i = 10;
        double n1 = 9.5;
        float n2 = 8.5f;
        boolean status = true;
        String nome = "Rafael";
        double soma = i +n1;
        System.out.println(soma);
        String n3 = "5";
        double soma2 = n1 +n1 + Double.parseDouble(n3);
        System.out.println(soma2);
        double pi = 3.14;
        int pi_inteiro = (int)pi;
        System.out.println(pi_inteiro);
        //Estruturas de controle
        if(n1>10){
            System.out.println("Maior que 10.");
        }
        else{
            System.out.println("Menor ou igual a 10.");
        }
        //Operador ternário
        String str = (n1 > 9) ? "Maior que 9" : "Menor ou igual a 9.";
        System.out.println(str);

        //Arrays Estáticos
        int [] vetor = new int[10];
        vetor[0] = 10;
        for(int j = 1; j < 10; j++){
            vetor[j] =(j+1) * 10;

        }
        for(int j = 0; j < vetor.length; j++){
            System.out.printf("\nPosição[%d]: %d", j, vetor[j]);
        }

        //Arrays Dinâmicos
        List<Integer> vetor_dinamico = new ArrayList<Integer>();
        for(int j=0; j<10; j++){
            vetor_dinamico.add(j*2);
        }
        vetor_dinamico.add(1000);
        vetor_dinamico.add(5000);
        vetor_dinamico.add(3000);
        vetor_dinamico.remove(12);
        //for-each
        System.out.println("Vetor dinâmico");
        for(int numero : vetor_dinamico){
            System.out.printf("\nPosição [%d]: %d", vetor_dinamico.indexOf(numero), numero);
        }
    }



}
