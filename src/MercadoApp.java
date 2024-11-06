import com.mercado.carrinho.Carrinho;
import com.mercado.pagamento.CartaoCredito;
import com.mercado.pagamento.Pagamento;
import com.mercado.pedido.Pedido;
import com.mercado.produto.Produto;
import com.mercado.produto.ProdutoComposto;
import com.mercado.produto.ProdutoFactory;

public class MercadoApp {
    public static void main(String[] args) {
        // Criando produtos usando Factory
        Produto p1 = ProdutoFactory.criarProduto("alimento", "Maçã", 2.0);
        Produto p2 = ProdutoFactory.criarProduto("alimento", "Maçã", 2.0);
        Produto p3 = ProdutoFactory.criarProduto("alimento", "Maçã", 2.0);
        Produto p4 = ProdutoFactory.criarProduto("alimento", "Maçã", 2.0);
        Produto p5 = ProdutoFactory.criarProduto("alimento", "Maçã", 2.0);
        Produto p6 = ProdutoFactory.criarProduto("alimento", "Banana", 1.5);


        // Produto Composto
        ProdutoComposto produtoComposto = new ProdutoComposto();
        produtoComposto.adicionarProduto(p1);
        produtoComposto.adicionarProduto(p2);
        produtoComposto.adicionarProduto(p3);
        produtoComposto.adicionarProduto(p4);
        produtoComposto.adicionarProduto(p5);

        // Criando carrinho
        Carrinho carrinho = new Carrinho();
        carrinho.addProduto(produtoComposto);
        carrinho.addProduto(p6);

        // Escolhendo o tipo de pagamento (Bridge Pattern)
        Pagamento pagamento = new CartaoCredito();

        // Criando pedido
        Pedido pedido = new Pedido(carrinho, pagamento);

        // Demonstração do Composite Pattern
        pedido.revisarPedido();
        pedido.finalizarPedido();
    }
}
