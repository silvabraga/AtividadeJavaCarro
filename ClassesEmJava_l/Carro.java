package br.classes;

public class Carro {

    private String numChassi;
    private double velocidadeMaxima;
    private double quilometragem;
    private double potencia;
    private String cor;
    private int qtdPortas;
    private double velocidade;
    private int marcha;
    private boolean ligado;

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        if (marcha == 1 && this.getVelocidade() >= 20) {
            System.out.println("Carro está em velocidade incompativel com a marcha 1");
             System.out.println(this.toString());
        } else if (marcha == 2 && this.getVelocidade() >= 30) {
            System.out.println("Carro está em velocidade incompativel com a marcha 2");
            System.out.println(this.toString());
        } else if (marcha == 3 && this.getVelocidade() >= 40) {
            System.out.println("Carro está em velocidade incompativel com a marcha 3");
            System.out.println(this.toString());
        } else if (marcha == 4 && this.getVelocidade() >= 65) {
            System.out.println("Carro está em velocidade incompativel com a marcha 4");
            System.out.println(this.toString());
        } else if (marcha == 5 && this.getVelocidade() >= this.getVelocidadeMaxima()) {
            System.out.println("Carro está em velocidade incompativel com a velocidade maxima do carro");
            System.out.println(this.toString());
        } else {
            this.marcha = marcha;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void acelerar() {
        if (marcha == 0) {
            System.out.println("Carro está em marcha neutro, não é possivel acelerar");
            System.out.println(this.toString());
        } else if (marcha == 1 && this.getVelocidade() >= 20) {
            System.out.println("Carro vai estar em velocidade incompativel com a marcha 1");
            System.out.println(this.toString());
        } else if (marcha == 2 && this.getVelocidade() >= 30) {
            System.out.println("Carro vai estar em velocidade incompativel com a marcha 2");
            System.out.println(this.toString());
        } else if (marcha == 3 && this.getVelocidade() >= 40) {
            System.out.println("Carro vai estar em velocidade incompativel com a marcha 3");
            System.out.println(this.toString());
        } else if (marcha == 4 && this.getVelocidade() >= 65) {
            System.out.println("Carro vai estar em velocidade incompativel com a marcha 4");
            System.out.println(this.toString());
        } else if (marcha == 5 && this.getVelocidade() >= this.getVelocidadeMaxima()) {
            System.out.println("Carro vai estar em velocidade incompativel com a marcha maxima do carro");
            System.out.println(this.toString());
        } else {
            this.setVelocidade(this.getVelocidade() + 5);
        }
    }

    public void frear() {
        this.setVelocidade(this.getVelocidade() - 5);
    }

    public void girarVolante() {
        System.out.println("Girando volante");
    }

    public void reduzirMarcha() {
        this.setMarcha(this.getMarcha() - 1);
    }

    public void subirMarcha() {

        this.setMarcha(this.getMarcha() + 1);
    }

    public Carro() {
    }

    public Carro(String numChassi) {
        this.numChassi = numChassi;
        this.velocidadeMaxima = 180;
        this.quilometragem = 0;
        this.potencia = 80;
        this.cor = "branco";
        this.qtdPortas = 4;
        this.velocidade = 0;
        this.marcha = 0;
        this.ligado = false;
    }

    @Override
    public String toString() {
        return "Carro{" + "numChassi=" + numChassi + ", velocidadeMaxima=" + velocidadeMaxima + ", quilometragem=" + quilometragem + ", potencia=" + potencia + ", cor=" + cor + ", qtdPortas=" + qtdPortas + ", velocidade=" + velocidade + ", marcha=" + marcha + ", ligado=" + ligado + '}';
    }

}
