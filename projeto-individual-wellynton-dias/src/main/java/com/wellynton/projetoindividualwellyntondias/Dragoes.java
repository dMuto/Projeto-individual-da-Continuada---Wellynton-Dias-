package com.wellynton.projetoindividualwellyntondias;

public class Dragoes extends Monstros{

    private final String detalheDragoes = "Monstros tipos Dragões ganham mais 15% de ataque";

    public Dragoes(String nome, String tipo, Double ataque, Double defesa) {
        super(nome, tipo, ataque, defesa);

        efeitoMonstro();
    }

    public String getDetalheDragoes() {
        return detalheDragoes;
    }

    @Override
    public Double efeitoMonstro() {

        Double efeito = getAtaque() + (getAtaque() * 0.15);
        Double ganhoEfeito = (this.getAtaque() * 0.15);

        setAtaque(efeito);

        return ganhoEfeito;
    }

    @Override
    public String toString() {

        return  "\nNome: " + nome + "\n" +
                "Tipo: " + tipo + '\n' +
                "Ataque: " + ataque + "\n" +
                "Defesa: " + defesa + '\n' +
                "Efeito: " + efeitoMonstro() + " a mais de dano" + '\n' +
                "Detalhe: " + getDetalheDragoes() + '\n' +
                "Ataque total: " + ataque;
    }
}
