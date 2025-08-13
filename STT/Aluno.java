package stt;

public class Aluno {
    private String nome;
    private double notaFinal;
    private int horasUltimos2Meses;

    public Aluno(String nome, double notaFinal, int horasUltimos2Meses) {
        this.nome = nome;
        this.notaFinal = notaFinal;
        this.horasUltimos2Meses = horasUltimos2Meses;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public int getHorasUltimos2Meses() {
        return horasUltimos2Meses;
    }

    public void adicionarHoras(int horas) {
        this.horasUltimos2Meses += horas;
    }

    @Override
    public String toString() {
        return nome + " - Nota final: " + notaFinal + " - Horas últimas 2 meses: " + horasUltimos2Meses;
    }
}
