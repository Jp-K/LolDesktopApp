/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhom1;

/**
 *
 * @author ian
 */
public class ItensStats {
    
    private int id=0;
    private String nome = "";
    private double vida=0;
    private double armadura=0;
    private double resistenciaMagica=0;
    private double danoDeAtaque=0;
    private double velocidadeDeAtaque=0;
    private double chanceDeAcertoCritico=0;
    private double danoMagico=0;
    private double mana=0;
    private double reducaoDeTempoDeRecarga=0;
    private double velocidadeDeMovimento=0;
    private double porcentagemVelocidadeDeMovimento=0;
    private double rouboDeVida=0;

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getArmadura() {
        return armadura;
    }

    public void setArmadura(double armadura) {
        this.armadura = armadura;
    }

    public double getResistenciaMagica() {
        return resistenciaMagica;
    }

    public void setResistenciaMagica(double resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }

    public double getDanoDeAtaque() {
        return danoDeAtaque;
    }

    public void setDanoDeAtaque(double danoDeAtaque) {
        this.danoDeAtaque = danoDeAtaque;
    }

    public double getVelocidadeDeAtaque() {
        return velocidadeDeAtaque;
    }

    public void setVelocidadeDeAtaque(double velocidadeDeAtaque) {
        this.velocidadeDeAtaque = velocidadeDeAtaque;
    }

    public double getChanceDeAcertoCritico() {
        return chanceDeAcertoCritico;
    }

    public void setChanceDeAcertoCritico(double chanceDeAcertoCritico) {
        this.chanceDeAcertoCritico = chanceDeAcertoCritico;
    }

    public double getDanoMagico() {
        return danoMagico;
    }

    public void setDanoMagico(double danoMagico) {
        this.danoMagico = danoMagico;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getReducaoDeTempoDeRecarga() {
        return reducaoDeTempoDeRecarga;
    }

    public void setReducaoDeTempoDeRecarga(double reducaoDeTempoDeRecarga) {
        this.reducaoDeTempoDeRecarga = reducaoDeTempoDeRecarga;
    }

    public double getVelocidadeDeMovimento() {
        return velocidadeDeMovimento;
    }

    public void setVelocidadeDeMovimento(double velocidadeDeMovimento) {
        this.velocidadeDeMovimento = velocidadeDeMovimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPorcentagemVelocidadeDeMovimento() {
        return porcentagemVelocidadeDeMovimento;
    }

    public void setPorcentagemVelocidadeDeMovimento(double porcentagemVelocidadeDeMovimento) {
        this.porcentagemVelocidadeDeMovimento = porcentagemVelocidadeDeMovimento;
    }

    public double getRouboDeVida() {
        return rouboDeVida;
    }

    public void setRouboDeVida(double rouboDeVida) {
        this.rouboDeVida = rouboDeVida;
    }
}
