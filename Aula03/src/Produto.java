public class Produto {

    //Atributos
    String nome;
    int codigo;
    float preco;
    boolean disponivel;
    Fornecedor fornecedor;

    //Métodos
    //Criar uma função que aumenta o valor do prelo do produto em porcentagem
    void aumentarPreco(float porcentagem){
        preco += preco * porcentagem/100 + preco; //preco = preço * porcentagem
    }

    //Criar um método que calcula o valor do produto com um desconto especifico
    void calcularDesconto(float porcentagem){
        float desconto;
        desconto = preco - preco * porcentagem / 100;
    }
    


}
