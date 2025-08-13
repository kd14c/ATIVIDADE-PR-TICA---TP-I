package srpa;

public class Voo {
    private String numeroVoo;
    private String origem;
    private String destino;
    private int assentosDisponiveis;

    public Voo(String numeroVoo, String origem, String destino, int assentosDisponiveis) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public boolean verificarDisponibilidade(int quantidadeAssentos) {
        return quantidadeAssentos <= assentosDisponiveis;
    }

    public boolean realizarReserva(int quantidadeAssentos) {
        if (verificarDisponibilidade(quantidadeAssentos)) {
            assentosDisponiveis -= quantidadeAssentos;
            System.out.println("Reserva realizada com sucesso!");
            return true;
        } else {
            System.out.println("Não há assentos suficientes disponíveis.");
            return false;
        }
    }

    public double realizarPagamento(String tipoViagem, boolean pontosTuristicos, int quantidadeAssentos) {
        double precoBase = 500.0; 
        double total = precoBase * quantidadeAssentos;

        if (tipoViagem.equalsIgnoreCase("ida e volta")) {
            total *= 1.8; 
        }

        if (pontosTuristicos) {
            total += 200.0;
        }

        System.out.println("Pagamento realizado: R$ " + total);
        return total;
    }

    public void imprimirPassagem(String nomePassageiro, int quantidadeAssentos) {
        System.out.println("====== PASSAGEM AÉREA ======");
        System.out.println("Passageiro: " + nomePassageiro);
        System.out.println("Voo: " + numeroVoo);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Assentos: " + quantidadeAssentos);
        System.out.println("============================");
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    @Override
    public String toString() {
        return "Voo " + numeroVoo + " - " + origem + " -> " + destino + " | Assentos disponíveis: " + assentosDisponiveis;
    }
}
