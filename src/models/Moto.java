/*

b) Implementa subclases como Carro, Moto y Camion, cada una sobrescribiendo mover().

 */

package models;

public class Moto extends Vehiculo {

    public Moto (String marca, String modelo){
        super(marca,modelo); //Toma atributos de clase super Vehiculo
    }

    @Override
    public void mover(int distancia){
        System.out.println("Recorrido de " + marca + " " + modelo + "...");
        System.out.println("Distancia: " + distancia +"\n");

        for (int i = 0; i <= distancia; i++) {
            // Simulación visual del avance
            System.out.print("\rCarretera: [");
            for (int j = 0; j < distancia; j++) {
                if (j == i) System.out.print("\uD83C\uDFCD️"); // Java source code para emote de moto
                else System.out.print("-");
            }
            System.out.print("]");

            esperar(100);
        }

        System.out.println("\n" + marca + " " + modelo + " ha llegado a su destino.");
        System.out.println("Kilometros recorridos: " + distancia +"\n");

    }

}
