import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Criar o Scanner para ler os dados
        Scanner leitor = new Scanner(System.in);

        //Ler o nome, preço, código e disponível
        System.out.println("Digite o nome do produto: ");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite o preço: ");
        float preco = leitor.nextFloat();

        System.out.println("Digite o código do produto: ");
        int codigo = leitor.nextInt();

        System.out.println("Digite se está disponível: true/false");
        boolean disponivel = leitor.nextBoolean();

        //Criar um objeto Produto

        Produto produto = new Produto();

        //Colocar os dados no objeto

        produto.codigo = codigo;
        produto.nome = nome;
        produto.preco = preco;
        produto.disponivel = disponivel;

        //Exibir os dados do objeto

        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Código do produto: " + produto.codigo);
        System.out.println("Preço do produto: " + produto.preco);
        System.out.println("Disponível?" + produto.disponivel);

        //Ler os dados do fornecedor
    }
}
