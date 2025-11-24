import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User usuario = new User();
        Produto produto = new Produto();

        int menu1;

        do {

            //Menu Interativo 1:
            System.out.println("Bem vindo ao seu sistema de vendas integrado! Escolha uma das opções abaixo: ");
            System.out.println("1 - Cadastrar novo produto.");
            System.out.println("2 - Consultar produto.");
            System.out.println("3 - Sair.");
            menu1 = sc.nextInt();
            sc.nextLine();

            switch (menu1) {

                case 1 :
                    System.out.println("Digite o nome do produto: ");
                    produto.setNomedoproduto(sc.nextLine());

                    System.out.println("Digite o valor do seu produto R$: ");
                    produto.setPreco(sc.nextFloat());
                    sc.nextLine();

                    System.out.println("Digite a categoria do produto: ");
                    produto.setCategoria(sc.nextLine());

                    System.out.println("Digite o ID do seu produto: ");
                    produto.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Digite a quantidade de estoque do produto: ");
                    produto.setQuantidadeEstoque(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Produto " + produto.getNomedoproduto() + " adicionado com sucesso!");


            }
        } while (menu1 != 3);


    }
}