/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicicletas;

/**
 *
 * @author Nathanelisabetinho
 */
public class Bicicleta {
    public String modelo;
    public String cor;
    public int codigoBicileta;
    
    private int aro;
    private String banco;
    private String guidao;
    private String quadro;

    public Bicicleta(String modelo, int codigoBicileta) {
        this.modelo = modelo;
        this.codigoBicileta = codigoBicileta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCodigoBicileta() {
        return codigoBicileta;
    }

    public void setCodigoBicileta(int codigoBicileta) {
        this.codigoBicileta = codigoBicileta;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getGuidao() {
        return guidao;
    }

    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    public String getQuadro() {
        return quadro;
    }

    public void setQuadro(String quadro) {
        this.quadro = quadro;
    }
    
    
}
