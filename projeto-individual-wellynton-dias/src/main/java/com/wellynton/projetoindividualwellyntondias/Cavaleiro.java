package com.wellynton.projetoindividualwellyntondias;

public class Cavaleiro extends Monstros{

    private final String detalheGuerreiro = "Cavaleiros ganham 32% do seu ataque em armadura";

    public Cavaleiro(String nome, String tipo, Double ataque, Double defesa) {
        super(nome, tipo, ataque, defesa);
        efeitoMonstro();
    }

    @Override
    public Double efeitoMonstro() {

        Double efeito = getDefesa() + (getAtaque() * 0.32);
        Double ganhoEfeito = getAtaque() * 0.32;

        this.setDefesa(efeito);

        return ganhoEfeito;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\n" +
                "Tipo: " + tipo + '\n' +
                "Ataque: " + ataque + "\n" +
                "Defesa: " + defesa + '\n' +
                "Detalhe: " + String.format("%s, seu monstro ganhou %.2f de defesa", this.detalheGuerreiro, efeitoMonstro());
    }
}
