package supermercado;

public class Produto {

    private String nome;
    private int quantidade;
    private double precoUnitario;

    public Produto(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
    // Refatoração:calcularTotal()
    public double calcularTotal() {
    return this.precoUnitario * this.quantidade;
}

}
