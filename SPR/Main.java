package spr;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Pedido pedido1 = new Pedido(1, true);
        pedido1.adicionarItem(new ItemPedido("Pizza", 2, 30.00));
        pedido1.adicionarItem(new ItemPedido("Refrigerante", 1, 8.00));
        pedido1.reservaMesa(5);

        Pedido pedido2 = new Pedido(2, false);
        pedido2.adicionarItem(new ItemPedido("Lasanha", 1, 25.00));
        pedido2.adicionarItem(new ItemPedido("Suco", 2, 6.00));
        pedido2.reservaMesa(2);
      
        restaurante.adicionarPedido(pedido1);
        restaurante.adicionarPedido(pedido2);

        restaurante.exibirTodosPedidos();

        Pedido busca = restaurante.buscarPedido(1);
        if (busca != null) {
            System.out.println("Pedido encontrado:\n" + busca);
        } else {
            System.out.println("Pedido não encontrado.");
        }

        restaurante.removerPedido(pedido2);
        System.out.println("Após remover o pedido 2:");
        restaurante.exibirTodosPedidos();
    }
}
