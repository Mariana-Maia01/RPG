import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bolsa implements Item {

    private Scanner scanner = new Scanner(System.in);
    private List<String> listaDeItem = new ArrayList<>();

    @Override
    public void adicionarItem() {
        System.out.println("Que item deseja adicionar?");
        scanner.nextLine();
        String item = scanner.nextLine();
        listaDeItem.add(item);
        System.out.println("Seu item foi adicionado com sucesso!!!");
    }

    @Override
    public void removerItem() {
        if (listaDeItem.isEmpty()) {
            System.out.println("Não há este item!");
        }
        System.out.println("Deseja remover algum item?");
        String item = scanner.next();
        if (listaDeItem.remove(item)) {
            System.out.println("Item removido com sucesso");
        }
    }

    @Override
    public void listaItem() {
        System.out.println("Itens atuais:");
        for (String p : listaDeItem) {
            System.out.println(p);
        }
    }
}
