package spr;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private ArrayList<ItemPedido> itens;
    private int numeroMesa;
    private boolean possuiEntrega;
    private final double TAXA_ENTREGA = 10.0;

    public Pedido(int numero, boolean possuiEntrega) {
        this.numero = numero;
        this.itens = new ArrayList<>();
        this.possuiEntrega = possuiEntrega;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public void reservaMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public double calcularTotalPedido() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularTotal();
        }

        if (possuiEntrega) {
            total += TAXA_ENTREGA;
        }

        return total;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido Nº ").append(numero).append(" - Mesa: ").append(numeroMesa).append("\n");
        for (ItemPedido item : itens) {
            sb.append("  ").append(item.toString()).append("\n");
        }
        sb.append("Total: R$").append(calcularTotalPedido()).append("\n");
        return sb.toString();
    }
}