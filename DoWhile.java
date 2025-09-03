import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;


       do{ 
        System.out.println("Digite o número 0 para sair");
        numero = sc.nextInt();

        while(numero!= 0 );
        {
        System.out.println("voce digitou" + numero );
        System.out.println("digite 0 para sair");
        numero = sc.nextInt();
        }
        System.out.println("Programa encerrado");
        sc.close();

     }
}

    
}
