
import java.util.Scanner;


/**
 *
 * @author 0030482421024 - Murilo Costa Garbo
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        int opcao;
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble(); // scanf("&f", medAlt);
        
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble(); // scanf("&f", medBase);
        
        Retangulo objret = new Retangulo();
        
        //passagem de mensagens
        objret.setAltura(medAlt);
        objret.setBase(medBase);
        
        do {
            System.out.println("\n1 - Consultar Área");
            System.out.println("\n2 - Consultar Perímetro");
            System.out.println("\n3 - Consultar Diagonal");
            System.out.println("\n4 - Sair");
            System.out.println("\n\t\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            System.out.println("\n A medida da altura é: " + objret.getAltura());
            System.out.println("\n A medida da base é: " + objret.getBase());
            
           if (opcao == 1){
               System.out.println("\nA medida da área é: " + objret.calcArea());
           }
           if (opcao == 2){
               System.out.println("\nA medida do perímetro é: " + objret.calcPerimetro());
           }
           if (opcao == 3){
               System.out.println("\nA medida da diagonal é: " + objret.calcDiagonal());
           }
        } while (opcao < 4);
        System.out.println("Programa Finalizado !!!");
    }
}