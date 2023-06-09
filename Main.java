// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("05 - Estruturas Condicionais");

        // 05 - Estruturas Condicionais

        int nota = 100;

        // nota do aluno maior ou igual 70 aluno aprovado
        // if else
        if(nota >= 70) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }

        // GRADUAÇÃO A 80  B 70 e C 60 e D

        int n = 90 ;

        if(n >= 80) {
            System.out.println("Graduação A");
        } else if(n < 80 && n >= 70){
            System.out.println("Graduação B");
        } else if(n < 70 && nota >= 60){
            System.out.println("Graduação C");
        } else if(n < 60 && nota >= 0 ){
            System.out.println("Graduação D");
        } else {
            System.out.println("Grasuação Invalida");
        }
        // GRADUAÇÃO A 80  B 70 e C 60 e D

        int notas = 100;
        String Graduação = " " ;

        if(notas >= 80) {
            Graduação=  "A" ;
        } else if(notas < 80 && notas >= 70){
             Graduação = "B";
        } else if(notas < 70 && notas >= 60){
             Graduação = "C";
        } else if(notas < 60 && notas >= 0 ){
            Graduação = "D";
        } else {
            Graduação = null ;
        }
        // Switch observar o case break e o default

        switch (Graduação){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno Reprovado");
                break;
            default:
                System.out.println("Graduação Invalida");
                break;
        }
    }
}