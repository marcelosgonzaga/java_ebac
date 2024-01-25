package ControleDeFluxo;

import java.util.Scanner;

public class ExercicioMediaValidacao {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n1, n2, n3;
        int media;
        int cont = 0;

        for(int i = 0; i < 3; i++){
            //cont++;
            System.out.println("Nota do aluno:  1-Primeira: ");
            n1 = s.nextInt();
            System.out.println("Nota do aluno: 2-Segunda: ");
            n2 = s.nextInt();
            System.out.println("Nota do aluno: 3-Terceira: ");
            n3 = s.nextInt();


            media = (n1 + n2 + n3 ) / 3;
            System.out.println("A média do aluno " + media);

            if( media >= 7 ){
                System.out.println("Aluno Aprovado!!!");
            } else if((media >= 5) && (media > 7)){
                System.out.println("Aluno de recuperação!");
            } else if(media <= 4 ){
                System.out.println("Aluno Reprovado!");
            }

        }

    }
}
