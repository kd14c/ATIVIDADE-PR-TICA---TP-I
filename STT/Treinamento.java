package stt;

import java.util.ArrayList;

public abstract class Treinamento {
    protected int id;
    protected String nomeInstrutor;
    protected String linguagemEnsinada;
    protected ArrayList<Aluno> alunos;
    protected int cargaHoraria;
    protected boolean instrutorDisponivel;

    public Treinamento(int id, String nomeInstrutor, String linguagemEnsinada) {
        this.id = id;
        this.nomeInstrutor = nomeInstrutor;
        this.linguagemEnsinada = linguagemEnsinada;
        this.alunos = new ArrayList<>();
        this.instrutorDisponivel = true;
    }

    public boolean verificarDisponibilidade() {
        return instrutorDisponivel;
    }

    public void definirCargaHoraria(int horas) {
        this.cargaHoraria = horas;
    }

    public boolean verificarUltimoTreinamento(Aluno aluno) {
        return aluno.getHorasUltimos2Meses() + cargaHoraria <= 80;
    }

    public double calcularMediaAlunos() {
        if (alunos.isEmpty()) return 0.0;

        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.getNotaFinal();
        }
        return soma / alunos.size();
    }

    public void adicionarAluno(Aluno aluno) {
        if (verificarUltimoTreinamento(aluno)) {
            alunos.add(aluno);
            aluno.adicionarHoras(cargaHoraria);
            System.out.println("Aluno " + aluno.getNome() + " adicionado com sucesso.");
        } else {
            System.out.println("Aluno " + aluno.getNome() + " ultrapassou o limite de 80h em 2 meses.");
        }
    }

    public abstract void tipoTreinamento();
}