package srpa;

import java.util.ArrayList;

public class Aeroporto {
    private ArrayList<Voo> voos;

    public Aeroporto() {
        voos = new ArrayList<>();
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public void removerVoo(Voo voo) {
        voos.remove(voo);
    }

    public Voo buscarVoo(String numeroVoo) {
        for (Voo voo : voos) {
            if (voo.getNumeroVoo().equalsIgnoreCase(numeroVoo)) {
                return voo;
            }
        }
        return null;
    }

    public void exibirVoos() {
        if (voos.isEmpty()) {
            System.out.println("Nenhum voo disponível.");
        } else {
            for (Voo voo : voos) {
                System.out.println(voo);
            }
        }
    }
}