/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastrarPaciente;


public class cadastrarSintomas {
    public String nomeSintoma;
    public String descricaoSintoma;
    public int quantosDiasSintoma;
    public int grauDaDor;
    
    cadastrarPaciente novoPaciente1;
    
    
    public cadastrarSintomas(String nomeSintoma, String descricaoSintoma, int quantosDiasSintoma, int grauDaDor) {
        this.nomeSintoma = nomeSintoma;
        this.descricaoSintoma = descricaoSintoma;
        this.quantosDiasSintoma = quantosDiasSintoma;
        this.grauDaDor = grauDaDor;
    }
    
    

    public cadastrarSintomas(cadastrarPaciente novoPaciente1) {
        this.novoPaciente1 = novoPaciente1;
    }

    public void getPaciente(){
        System.out.println(novoPaciente1.getNome());
        
   
    }
    
    
    public String getNomeSintoma() {
        return nomeSintoma;
    }

    public void setNomeSintoma(String nomeSintoma) {
        this.nomeSintoma = nomeSintoma;
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
    
    
}
