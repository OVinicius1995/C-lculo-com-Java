import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        boolean executando = true;
        String opcoes;
        Scanner ler = new Scanner(System.in);

        while (executando){

            System.out.println("\n");
            System.out.println("|-------------------------|");
            System.out.println("|   [1] - Informar notas  |");
            System.out.println("|   [2] - Sair            |");
            System.out.println("|-------------------------|");
            System.out.print("Selecione uma opcao: ");

            opcoes = ler.next();

            switch (opcoes){

                case "1":{

                    Caculo calcular = new Caculo();


                    System.out.println("\n");
                    System.out.print("Digite o nome do aluno: ");
                    calcular.atribuirNome(ler.next());
                    System.out.print("Digite a matricula do aluno: ");
                    calcular.atribuirMatricula(ler.next());
                    System.out.print("Digite a primeira nota: ");
                    calcular.atribuirNota1(ler.nextDouble());
                    System.out.print("Digite a segunda  nota: ");
                    calcular.atribuirNota2(ler.nextDouble());
                    System.out.print("Digite a terceira nota: ");
                    calcular.atribuirNota3(ler.nextDouble());
                    System.out.print("Digite a quantidade de presenças: ");
                    calcular.atribuirPresenca(ler.nextInt());

                    calcular.Media();

                    break;
                }

                case "2" : {

                    System.out.println("\n");
                    System.out.println("Saindo........");
                    executando = false;

                    break;

                }
            }
        }
    }
}