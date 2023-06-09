import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Criar variavel para receber um nome - > String
        String nome =  "Eduardo";
         // letras minusculas
        System.out.println(nome.toLowerCase());
        // letras maiusculas
        System.out.println(nome.toUpperCase());
        // Contando as letras caracteres
        System.out.println(nome.length());

        String nomeOutro = "eduardo";
        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        Locale brasil = new Locale("pt", "BR");
        // Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        // System.out.println(diaSemana);

        String saudacao;

        LocalDateTime agora = LocalDateTime.now();
       //  System.out.println(agora);

       if(agora.getHour() >= 0 && agora.getHour() < 12){
           saudacao = "bom dia!";
       } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite!";
         } else {
            saudacao = "Olá.";
         }
         //define o formato e valores
         System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
     }
}