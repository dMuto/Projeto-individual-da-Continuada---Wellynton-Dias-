package com.wellynton.projetoindividualwellyntondias;

public abstract class Monstros implements EfeitosMonstros{

    protected String nome = "";
    protected String tipo = "";
    protected Double ataque = 0.0;
    protected Double defesa = 0.0;

    public Monstros(String nome, String tipo, Double ataque, Double defesa) {
        this.nome = nome;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public Double getDefesa() {
        return defesa;
    }

    public void setDefesa(Double defesa) {
        this.defesa = defesa;
    }


    @Override
    public String toString() {
        return  "\nNome: " + nome + "\n" +
                "Tipo: " + tipo + '\n' +
                "Ataque: " + ataque + "\n" +
                "Defesa: " + defesa;
    }
}
