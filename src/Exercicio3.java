import java.util.Scanner;

public class Exercicio3{
    public static void main(String args[]){
        //setup
        Scanner teclado = new Scanner(System.in);

        // variaveis
        int A, B, C, D;

        // entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        //    --1--      --2--         ----3----        ------4-------         ----5-----
        if ( (B > C) && (D > A) && ((C+D) > (A+B)) && ((C > 0) && (D > 0)) && (A % 2 == 0) ){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }



        // encerramento
        teclado.close();
    }
}