package stt;

public class TreinamentoPresencial extends Treinamento {
    private String local;

    public TreinamentoPresencial(int id, String nomeInstrutor, String linguagemEnsinada, String local) {
        super(id, nomeInstrutor, linguagemEnsinada);
        this.local = local;
    }

    @Override
    public void tipoTreinamento() {
        System.out.println("Este é um treinamento presencial no local: " + local);
    }
}