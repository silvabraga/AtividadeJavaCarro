
package br.classes;


public class Principal {


    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setCor("Rosa");
        carro1.setLigado(true);
        carro1.setMarcha(1);
        carro1.setNumChassi("85471255");
        carro1.setPotencia(90);
        carro1.setQtdPortas(4);
        carro1.setQuilometragem(5000);
        carro1.setVelocidade(20);
        carro1.setVelocidadeMaxima(120);
        carro1.subirMarcha();
        carro1.acelerar();
        carro1.acelerar();
        carro1.subirMarcha();
        carro1.acelerar();
        carro1.acelerar();
        carro1.subirMarcha();
        carro1.acelerar();
        carro1.acelerar();
        carro1.subirMarcha();
        carro1.acelerar();
        carro1.acelerar();
        carro1.subirMarcha();
        carro1.acelerar();
        carro1.acelerar();
        carro1.subirMarcha();
        carro1.acelerar();
        carro1.acelerar();
        carro1.subirMarcha();
        carro1.acelerar();
        carro1.acelerar();
        
        System.out.println(carro1.toString());
        
        Carro carro2 = new Carro("1452144");
        carro2.subirMarcha();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.subirMarcha();
        carro2.acelerar();
        carro2.acelerar();
        carro2.subirMarcha();
        carro2.acelerar();
        carro2.acelerar();
        carro2.subirMarcha();
        carro2.acelerar();
        carro2.acelerar();
        carro2.subirMarcha();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();


 
        carro2.acelerar();
        System.out.println(carro2.toString());
        
    }
    
}
