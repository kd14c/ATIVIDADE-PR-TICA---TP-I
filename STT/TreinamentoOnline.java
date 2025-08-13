package stt;

public class TreinamentoOnline extends Treinamento {
    private String linkAcesso;

    public TreinamentoOnline(int id, String nomeInstrutor, String linguagemEnsinada, String linkAcesso) {
        super(id, nomeInstrutor, linguagemEnsinada);
        this.linkAcesso = linkAcesso;
    }

    @Override
    public void tipoTreinamento() {
        System.out.println("Este é um treinamento online. Acesse pelo link: " + linkAcesso);
    }
}