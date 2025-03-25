import java.util.Objects;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner perguntas = new Scanner(System.in);

        System.out.println("RESPONDA ESSAS PERGUNTAS SOBRE O BRASILEIRAO SERIA A");

        System.out.println("Em que ano o Cuiaba foi fundado?: ");
        int p1 = perguntas.nextInt();
        if (p1 == 2001) {
            System.out.println("CORRETO");
        } else {
            System.out.println("ERROU");
        }
        System.out.println("Quem foi o campeão brasileiro em 2015?: ");
        String p2 = perguntas.next();
        if (Objects.equals(p2, "Corinthians")) {
            System.out.println("CORRETO");
        } else {
            System.out.println("ERROU");

        }
        System.out.println("Em que ano nasceu o Elon Musk?: ");
        int p3 = perguntas.nextInt();
        if (p3 == 1971) {
            System.out.println("CORRETO");
        } else {
            System.out.println("ERROU");

        }
    }
    }




