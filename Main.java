// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//              System.out.printf("Java Funções  Modulo  ");
//              System.out.println("============================ " );
//
//              String nome = "Let's a Code";
//              saudacao(nome);
//              // int resultado = soma(a:2 , b:3);
//    }
//    public static void saudacao(String nome) {
//       System.out.println("Hello" + nome);
//     }
////    public static int soma(int a, int b) {
////        return a + b;
////    }
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Funções  Modulo I ");
        System.out.println("Eduardo Maurício Dias");
        System.out.println("Java developer modulo - 01  concluído  100%!");
        // Declarando as tipo das variavéis e valor
        int a = 5;
        int b = 5;
        // Chamda função soma passando os argumentos a e b
        int resultado = soma(a, b);
        System.out.println("Aluno nota : "+resultado);
    }

    // Função soma recebe os argumentos int a e int b
    public static int soma(int a, int b) {
        // retorna a soma de a + b  e apresenta na função principal resultado
            return a + b;
    }
}
