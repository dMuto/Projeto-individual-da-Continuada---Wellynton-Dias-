package com.wellynton.projetoindividualwellyntondias;

public class Magos extends Monstros{

    private final String detalhesMagos = "Magos ganham 63% a mais de seu ataque, porem perdem 26% de defesa";

    public Magos(String nome, String tipo, Double ataque, Double defesa) {
        super(nome, tipo, ataque, defesa);

        efeitoMonstro();
    }

    public String getDetalhesMagos() {
        return detalhesMagos;
    }

    @Override
    public Double efeitoMonstro() {

        Double efeito1 = getAtaque() + (getAtaque() * 0.63);
        Double efeito2 = getDefesa() - (getDefesa() * 0.26);
        Double ganhoEfeito1 = getAtaque() * 0.63;


        this.setAtaque(efeito1);
        this.setDefesa(efeito2);

        return ganhoEfeito1;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\n" +
                "Tipo: " + tipo + '\n' +
                "Ataque: " + ataque + "\n" +
                "Defesa: " + defesa + '\n' +
                "Efeito : " + efeitoMonstro() + " a mais de ataque" + '\n' +
                "Detalhe: " + detalhesMagos + '\n' +
                "Ataque atual: " + ataque + '\n' +
                "Defesa Atual: " + defesa;
    }
}
