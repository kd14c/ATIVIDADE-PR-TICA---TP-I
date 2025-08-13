package srpa;

public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto();

        Voo voo1 = new Voo("BR101", "São Paulo", "Rio de Janeiro", 10);
        Voo voo2 = new Voo("BR202", "Brasília", "Salvador", 5);

        aeroporto.adicionarVoo(voo1);
        aeroporto.adicionarVoo(voo2);

        System.out.println("Lista de voos disponíveis:");
        aeroporto.exibirVoos();

        Voo vooSelecionado = aeroporto.buscarVoo("BR101");
        if (vooSelecionado != null) {
            if (vooSelecionado.realizarReserva(2)) {
                double valor = vooSelecionado.realizarPagamento("ida e volta", true, 2);
                vooSelecionado.imprimirPassagem("João Silva", 2);
            }
        }

        Voo voo2Selecionado = aeroporto.buscarVoo("BR202");
        if (voo2Selecionado != null) {
            voo2Selecionado.realizarReserva(6); 
        }

        System.out.println("\nVoos após reservas:");
        aeroporto.exibirVoos();
    }
}