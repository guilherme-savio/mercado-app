import com.mercado.carrinho.Carrinho;
import com.mercado.pagamento.CartaoCredito;
import com.mercado.pagamento.Pagamento;
import com.mercado.pagamento.ValeAlimentacao;
import com.mercado.pedido.Pedido;
import com.mercado.produto.Produto;
import com.mercado.produto.ProdutoComposto;
import com.mercado.produto.ProdutoFactory;
import com.mercado.produto.TipoProduto;

public class Main {
    public static void main(String[] args) {
        // Criando produtos usando Factory
        Produto p1 = ProdutoFactory.criarProduto(TipoProduto.ALIMENTO, "Maçã", 2.0, 150);
        Produto p2 = ProdutoFactory.criarProduto(TipoProduto.ALIMENTO, "Banana", 1.5, 80);
        Produto p3 = ProdutoFactory.criarProduto(TipoProduto.BEBIDA, "Refrigerante", 8, 2);
        Produto p4 = ProdutoFactory.criarProduto(TipoProduto.ELETRONICO, "Celular", 2500, 200);

        // Produto Composto
        ProdutoComposto produtoComposto = new ProdutoComposto();
        produtoComposto.adicionarProduto(p1);
        produtoComposto.adicionarProduto(p1);
        produtoComposto.adicionarProduto(p1);
        produtoComposto.adicionarProduto(p1);
        produtoComposto.adicionarProduto(p1);

        // Criando carrinho
        Carrinho carrinho = new Carrinho();
        carrinho.addProduto(produtoComposto);
        carrinho.addProduto(p2);
        carrinho.addProduto(p3);
        carrinho.addProduto(p4);

        // Escolhendo o tipo de pagamento (Bridge Pattern)
        Pagamento pagamento = new CartaoCredito();

        // Criando pedido
        Pedido pedido = new Pedido(carrinho, pagamento);

        // Demonstração do Composite Pattern
        pedido.revisarPedido();
        pedido.finalizarPedido();

        System.out.println();
        System.out.println("Agora com Vale Alimentação");
        System.out.println();

        // Escolhendo o tipo de pagamento (Bridge Pattern)
        pagamento = new ValeAlimentacao();

        // Criando pedido
        pedido = new Pedido(carrinho, pagamento);

        // Demonstração do Composite Pattern
        pedido.revisarPedido();
        pedido.finalizarPedido();
    }
}