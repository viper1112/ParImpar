package aula02;
import java.util.Scanner;

public class exeparimpar {
    
            public static void main(String[] args) {
                Scanner numero = new Scanner(System.in);
                
                System.out.print("Digite um numero ");
                int n1 = numero.nextInt();
                
                if(n1 % 2 == 0){
                    System.out.println("Seu numero é par");
                }else{
                    System.out.println("Seu numero é ímpar");
                }
                numero.close();
                
    }
    
}
