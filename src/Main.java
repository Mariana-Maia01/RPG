import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        List<String> classes = Arrays.asList("Bárbaro", "Bardo", "Mago", "Feiticeiro", "Bruxo", "Druida", "Ranger",
                "Clérigo", "Paladino", "Guerreiro");
        Poderes poderes = new Poderes();
        Bolsa bolsa = new Bolsa();
        Scanner scanner = new Scanner(System.in);

        boolean ligado = true;

        while (ligado) {
            System.out.println("""
                    ===Faça sua ficha===
                    1. Digite seu Nome
                    2. Escolha sua Classe
                    3. Edite seus poderes
                    4. Abra sua bolsa
                    5. Ficha completa
                    6. Sair
                    """);

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o seu nome:");
                    scanner.nextLine();
                    personagem.setNome(scanner.nextLine());
                    break;

                case 2:
                    System.out.println("""
                            ===Lista de Classes===
                            1. Bárbaro
                            2. Bardo
                            3. Mago
                            4. Feiticeiro
                            5. Bruxo
                            6. Druida
                            7. Ranger
                            8. Clérigo
                            9. Paladino
                            10. Guerreiro
                            """);
                    int classeEscolhida = scanner.nextInt();
                    if (classeEscolhida >= 1 && classeEscolhida <= classes.size()) {
                        personagem.setClasse(classes.get(classeEscolhida - 1));
                        System.out.println("Classe selecionada: " + personagem.getClasse());
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    boolean ligarPoder = true;
                    while (ligarPoder) {
                        System.out.println("""
                                1. Adicione poder
                                2. Remova poder
                                3. Sair
                                """);
                        int opcaoPoder = scanner.nextInt();
                        switch (opcaoPoder) {
                            case 1 -> poderes.adicionarPoder();
                            case 2 -> poderes.removerPoder();
                            case 3 -> {
                                System.out.println("Saindo da opção poderes...");
                                ligarPoder = false;
                            }
                        }
                    }
                    break;

                case 4:
                    boolean ligarItem = true;
                    while (ligarItem) {
                        System.out.println("""
                                ===Menu da Bolsa===
                                1. Adicionar item
                                2. Remover item
                                3. Sair
                                """);
                        int opcaoItem = scanner.nextInt();
                        switch (opcaoItem) {
                            case 1 -> bolsa.adicionarItem();
                            case 2 -> bolsa.removerItem();
                            case 3 -> {
                                System.out.println("Saindo do menu bolsa...");
                                ligarItem = false;
                            }
                        }
                    }
                    break;

                case 5:
                    personagem.mostrarFicha();
                    poderes.listaPoder();
                    bolsa.listaItem();
                    break;

                case 6:
                    System.out.println("Saindo do programa...");
                    ligado = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
