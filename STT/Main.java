package stt;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Maria", 8.5, 30);
        Aluno aluno2 = new Aluno("João", 9.0, 60);
        Aluno aluno3 = new Aluno("Ana", 7.8, 70);


        TreinamentoPresencial presencial = new TreinamentoPresencial(1, "Carlos", "Java", "Sala 101");
        presencial.definirCargaHoraria(40);

        TreinamentoOnline online = new TreinamentoOnline(2, "Luciana", "Python", "https://cursoonline.com/python");
        online.definirCargaHoraria(20);


        System.out.println("Instrutor presencial disponível? " + presencial.verificarDisponibilidade());

        presencial.adicionarAluno(aluno1);
        presencial.adicionarAluno(aluno2); 
        presencial.adicionarAluno(aluno3); 

        online.adicionarAluno(aluno3); 


        presencial.tipoTreinamento();
        online.tipoTreinamento();


        System.out.println("Média de notas (presencial): " + presencial.calcularMediaAlunos());
    }
}