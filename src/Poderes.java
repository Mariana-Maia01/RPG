import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Poderes implements PoderesAdiciona {
    private List<String> listaDePoderes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void adicionarPoder() {
        System.out.println("Digite o poder que deseja adicionar:");
        scanner.nextLine();
        String poder = scanner.nextLine();
        listaDePoderes.add(poder);
        System.out.println("Poder adicionado com sucesso!");
    }

    @Override
    public void removerPoder() {
        if (listaDePoderes.isEmpty()) {
            System.out.println("Não há poderes para ser removido");
        }
        System.out.println("Digite o poder que deseja remover");
        String poder = scanner.next();
        if (listaDePoderes.remove(poder)) {
            System.out.println("Poder removido com sucesso!");
        }

    }

    @Override
    public void listaPoder() {
        if (listaDePoderes.isEmpty()) {
            System.out.println("Nenhum poder adicionado ainda.");
        } else {
            for (String p : listaDePoderes) {
                System.out.println("Poderes atuais: ");
                System.out.println(p);
            }
        }
        }
    }

