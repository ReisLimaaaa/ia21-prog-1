package Lista1;

import java.util.Scanner;

public class teste {


    public static void main(String[] args) {
        //teste exer1
        bola justin = new bola("azul", "ferro", 60.0);
        System.out.println("A cor da bola é: " + justin.mostrarCor());
        justin.trocarCor("rosa");
        System.out.println("A nova cor da bola é: " + justin.mostrarCor());
        
        System.out.println();
        //teste exer2
        quadrado besties = new quadrado (40.0);
        System.out.println("O tamanho do quadrado é: " + besties.Rlado());
        besties.Mlado(80.0);
        System.out.println("O tamanho do quadrado agora é: " + besties.Rlado());
        System.out.println("A aréa do quadrado é: " + besties.Carea());
        
        System.out.println();
       //teste exer3 
       Scanner entrada = new Scanner(System.in);
       System.out.print("Entre com o seu nome: ");
       String nome = entrada.next();
       System.out.print("Entre com a sua idade: ");
       int idade = entrada.nextInt();
       System.out.println();
       
       System.out.println("Para números decimais, use vírgula!");
       
       
       System.out.println();
       
       System.out.print("Entre com seu peso: ");
       double peso = entrada.nextDouble();
       System.out.print("Entre com sua altura: ");
       double altura = entrada.nextDouble();
       
       System.out.println();
       
       System.out.print(nome + " você tem " + idade + " anos, " + "pesa " + peso + "kg " + " e mede " + altura + "cm");
       
       pessoa x = new pessoa (nome, idade, peso, altura);
       
       System.out.println();
      
       System.out.println("Você tem " + x.envelhece()+ " anos");
       System.out.println("Você tem " + x.engordar() + " Kg");
       System.out.println("Você tem " + x.emagrecer() + " Kg");
       System.out.println("Você tem " + x.crescer() + " Cm");
      
    }
    
}
