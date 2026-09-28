package supermercado;

public class Pedido {

    private int numeroPedido;
    private CarrinhoDeCompras carrinho;
    private String cliente;
    private String cpf;
    private String email;

//getters relacionados ao cliente ficaram agrupados.
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public String getNomeCliente() {
        return cliente;
    }

    public String getCpfCliente() {
        return cpf;
    }

    public String getEmailCliente() {
        return email;
    }

    public void fecharPedido() {
        System.out.println("Número do pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Total do pedido: " + carrinho.calcularTotal());
        System.out.println("=====================================");
    }
}

