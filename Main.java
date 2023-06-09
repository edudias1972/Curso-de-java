// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Laços de repetição - Aula 07 Java - modulo 1");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // para ir de 1 até 10
        System.out.println("============Conte de  1 até 10 ===========================");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("============De dois em dois ===========================");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("============De 10 em 10 ===========================");
        for (int i = 10; i <= 100; i += 10) {
            System.out.println(i);
        }

        System.out.println("=========== Toda a Tabuada: do 1 ao 10 ===========================");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + "=" + j * i);
            }
        }
    }
}