import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}

class Burguer extends Produto {
    private int gramas;

    public Burguer(String descricao, double preco, int gramas) {
        super(descricao, preco);
        this.gramas = gramas;
    }

    public int getGramas() {
        return gramas;
    }

    @Override
    public String toString() {
        return "Burguer{" +
                "descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", gramas=" + gramas +
                '}';
    }
}

class Sobremesa extends Produto {
    private String tamanho;

    public Sobremesa(String descricao, double preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}

class Bebida extends Produto {
    private int ml;

    public Bebida(String descricao, double preco, int ml) {
        super(descricao, preco);
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", ml=" + ml +
                '}';
    }
}

class Combo {
    private List<Produto> produtos;

    public Combo() {
        this.produtos = new ArrayList<>();
    }

    public void createCombo(int tipo) {
        switch (tipo) {
            case 1:
                createComboMaster();
                break;
            case 2:
                createComboSuper();
                break;
            default:
                System.out.println("Combo invalido.");
        }
    }

    private void createComboMaster() {
        produtos.add(new Burguer("Hamburguer", 5.0, 100));
        produtos.add(new Sobremesa("Brigadeiro", 4.0, "Grande"));
        produtos.add(new Bebida("Refrigerante", 6.0, 500));
    }

    private void createComboSuper() {
        produtos.add(new Burguer("Hamburguer", 5.0, 100));
        produtos.add(new Sobremesa("Brigadeiro", 4.0, "Grande"));
        produtos.add(new Bebida("Suco", 3.0, 300));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Produto produto : produtos) {
            sb.append(produto.getDescricao()).append(" - R$ ").append(produto.getPreco()).append("\n");
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu compo");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");
        Scanner input = new Scanner(System.in);
        int tipo = input.nextInt();
        Combo combo = new Combo();
        combo.createCombo(tipo);
        System.out.println(combo);
    }
}