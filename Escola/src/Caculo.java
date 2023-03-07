import java.text.DecimalFormat;
import java.text.ParseException;


public class Caculo extends Aluno {
    DecimalFormat decial = new DecimalFormat();
    float calculapresenca,totalpresenca;
    public void atribuirNome(String nome){

        this.nome = nome;

    }

    private String pegoNome(){

        return nome;

    }

    public void atribuirNota1(double nota1){

        this.nota1 = nota1;
    }

    public double pegoNota1(){
        return nota1;
    }

    public void atribuirNota2(double nota2){

        this.nota2 = nota2;
    }

    public double pegoNota2(){
        return nota2;
    }

    public void atribuirNota3(double nota3){

        this.nota3 = nota3;
    }

    public double pegoNota3(){
        return nota3;
    }

    public void atribuirMatricula(String matricula){

        this.matricula = matricula;

    }

    public String pegoMatricula(){
        return matricula;
    }

    public void atribuirPresenca(int qtdePresencas){

        this.qtdePresenca = qtdePresencas;

    }

    public int pegoPresenca(){
        return qtdePresenca;
    }


    public void Media() throws ParseException {

      total = nota1 + nota2 + nota3;
      media = total / 3;

      if (qtdePresenca > 60){

          System.out.println("\n");
          System.out.println("\n \tQuantidade de presença maior que quantidade de encontros.");

      } else {

          String padrao = "##.##";
          String padraoMatricula = "###########";
          String padraoMedia     = "#.##";
          DecimalFormat df       = new DecimalFormat(padrao);
          DecimalFormat dfm      = new DecimalFormat(padraoMatricula);
          DecimalFormat dfmedia  = new DecimalFormat(padraoMedia);


          totalpresenca = (qtdePresenca / encontros) * 100;
          //totalpresenca = presenca * 100;

          System.out.println("\n");
          System.out.printf("O aluno: " + nome + "\nPortador da matrícula: " +  matricula  + "\nTeve um total de: " + decial.format(total) +
                  "\nTeve uma média de: " + dfmedia.format(media) + "\nE uma presença de: " + df.format(totalpresenca), "%");
          System.out.println("%");


          //System.out.printf(" media: %.1f\n ", media);
      }

      }

    }


