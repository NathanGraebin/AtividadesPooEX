/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colegio;

///Criar uma classe para definir Turma com no mínimo 4 atributos e 1 desses atributos deverá ser referência da classe aluno;

public class Turma {
    
    public int codCurso;
    public int numeroDaTurma;
    public int totalVagas;
    public String sala;
    public String horario;
    
    Aluno novoAluno1;
    Aluno novoAluno2;
    Aluno novoAluno3;

    Turma(Aluno aAluno) {
        novoAluno1 = aAluno;
    }
   
    
    public void getAluno1(){
        System.out.println(novoAluno1.getNome());
        
   
    }
    
    public void getAluno2(){
        System.out.println(novoAluno2.getNome());
        
   
    }
    
    public void getAluno3(){
        System.out.println(novoAluno3.getNome());
        
   
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public int getNumeroDaTurma() {
        return numeroDaTurma;
    }

    public void setNumeroDaTurma(int numeroDaTurma) {
        this.numeroDaTurma = numeroDaTurma;
    }

    public int getTotalVagas() {
        return totalVagas;
    }

    public void setTotalVagas(int totalVagas) {
        this.totalVagas = totalVagas;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
    
}


