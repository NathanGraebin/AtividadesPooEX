/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

///Criar uma classe para definir Turma com no mínimo 4 atributos e 1 desses atributos deverá ser referência da classe aluno;
public class cadastroSintomas {

    public int codSintoma;
    public String descricaoSintoma;
    public int quantosDiasSintoma;
    public int grauDaDor;

    cadastroPaciente novoPaciente1;
    cadastroPaciente novoPaciente2;
    cadastroPaciente novoPaciente3;
    
    cadastroSintomas(cadastroPaciente novoPaciente) {
        novoPaciente1 = novoPaciente;
        
    }

    public int getCodSintoma() {
        return codSintoma;
    }

    public void setCodSintoma(int codSintoma) {
        this.codSintoma = codSintoma;
    }

    public String getDescricaoSintoma() {
        return descricaoSintoma;
    }

    public void setDescricaoSintoma(String descricaoSintoma) {
        this.descricaoSintoma = descricaoSintoma;
    }

    public int getQuantosDiasSintoma() {
        return quantosDiasSintoma;
    }

    public void setQuantosDiasSintoma(int quantosDiasSintoma) {
        this.quantosDiasSintoma = quantosDiasSintoma;
    }

    public int getGrauDaDor() {
        return grauDaDor;
    }

    public void setGrauDaDor(int grauDaDor) {
        this.grauDaDor = grauDaDor;
    }

    public cadastroPaciente getNovoPaciente1() {
        System.out.println(novoPaciente1.getNome());
        System.out.println(novoPaciente1.getIdade());
        return novoPaciente1;
    }

    public void setNovoPaciente1(cadastroPaciente novoPaciente1) {
        this.novoPaciente1 = novoPaciente1;
    }

    public cadastroPaciente getNovoPaciente2() {
        return novoPaciente2;
    }

    public void setNovoPaciente2(cadastroPaciente novoPaciente2) {
        this.novoPaciente2 = novoPaciente2;
    }

    public cadastroPaciente getNovoPaciente3() {
        return novoPaciente3;
    }

    public void setNovoPaciente3(cadastroPaciente novoPaciente3) {
        this.novoPaciente3 = novoPaciente3;
    }

}
