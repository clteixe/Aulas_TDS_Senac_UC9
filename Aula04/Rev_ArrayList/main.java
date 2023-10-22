package uc9.Aula04.ExemploArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        ArrayList<Cliente> cadastro = new ArrayList<Cliente>();
        Scanner lerTeclado = new Scanner(System.in);

        int opcao = 1;
        int index = 1;

        do {
            Cliente pessoa = new Cliente();
            System.out.println("Digite o id: ");
            int idDigitada = lerTeclado.nextInt();
            pessoa.setId(idDigitada);
            System.out.println("Digite o nome: ");
            String nomeDigitado = lerTeclado.next();
            pessoa.setNome(nomeDigitado);
            System.out.println("Digite a idade: ");
            int idadeDigitada = lerTeclado.nextInt();
            pessoa.setIdade(idadeDigitada);
            System.out.println("Digite o telefone: ");
            String telDigitado = lerTeclado.next();
            pessoa.setTelefone(telDigitado);
            cadastro.add(pessoa);
            //cadastro.add(index, pessoa);
            //index++;

            System.out.println("Deseja cadastar mais cliente?");
            System.out.println("1. Sim");;
            System.out.println("2. Nao");;
            opcao = lerTeclado.nextInt();

        } while (opcao == 1);

        // Apresentar o relatorio?
        System.out.println("RELATORIO DE CLIENTES");
        System.out.println("======================");

        System.out.println(" = = = = = = = = = = = = = = = = = = = = ");
        System.out.println(" ====== RELATORIO DE CLIENTES ========== ");
        System.out.println(" = = = = = = = = = = = = = = = = = = = = ");

        for (int i = 0; i <= cadastro.size() - 1; i++) {
            System.out.println("Id: " + cadastro.get(i).getId());
            System.out.println("Nome: " + cadastro.get(i).getNome());
            System.out.println("Idade: " + cadastro.get(i).getIdade());
            System.out.println("Telefone: " + cadastro.get(i).getTelefone());
        }
    }
}
