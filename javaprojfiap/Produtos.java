import java.util.Scanner;

public class Produtos {


    public static void main(String[] args) {
        Scanner item = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeproduto = item.next();
        System.out.println("Digite o valor do produto: ");
        float valorproduto = item.nextFloat();
        System.out.println("Digite a quantidade que você deseja do produto: ");
        int quant = item.nextInt();;
        System.out.println(quant);

        System.out.println("Você escolheu: " + nomeproduto);
        System.out.println("O valor dele está em: " + valorproduto);
        System.out.println("A quantidade desse produto foi: " + quant);

        float valortotal = quant * valorproduto;
        System.out.println("O valor total da sua compra sem o desconto é: " + valortotal);


        System.out.println("Você vai receber um desconto de 20%");
        double desconto = valortotal * 0.2;
        System.out.println("O valor descontado será de: " +desconto);

        double valor = valortotal - desconto;
        System.out.println("Ao final o valor da sua compra ficou em: " + valor);


    }
}
