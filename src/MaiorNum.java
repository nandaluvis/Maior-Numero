import java.util.Scanner;

public class MaiorNum{
     public static void main(String[] args) {

         System.out.println("Bem vindo,aqui você digita dois números e o programa verifica qual o maior número digitado");
         System.out.println("Digite o primeiro número:");

         Scanner scanner = new Scanner(System.in);

         int numeroEscolhidoUm= scanner.nextInt();

         System.out.println("Digite o segundo número:");

         int numeroEscolhidoDois= scanner.nextInt();

         if(numeroEscolhidoUm > numeroEscolhidoDois){
             System.out.println("O maior número escolhido é o número " + numeroEscolhidoUm);
         }else if(numeroEscolhidoUm < numeroEscolhidoDois){
             System.out.println("O maior número escolhido é o número " + numeroEscolhidoDois);
         }else {
             System.out.println("Os números são iguais!");
         }


     }
         }

