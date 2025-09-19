/*

b) Implementa subclases como Carro, Moto y Camion, cada una sobrescribiendo mover().

 */

package models;

public class Camion extends Vehiculo implements Combustible {

    public Camion(String marca, String modelo) {
        super(marca, modelo); //Toma atributos de clase super Vehiculo
    }

    @Override
    public void mover(int distancia){
        System.out.println("Recorrido del " + marca + " " + modelo + "...");
        System.out.println("Distancia: " + distancia +"\n");

        for (int i = 0; i <= distancia; i++) {
            // Simulación visual del avance
            System.out.print("\rCarretera: [");
            for (int j = 0; j < distancia; j++) {
                if (j == i) System.out.print("\uD83D\uDE9A");
                else System.out.print("-");
            }
            System.out.print("]");

            // Parada para recargar combustible cada 40 kilometros
            if (i % 40 == 0 && i != 0) {
                System.out.println("\nParada para recargar combustible...");
                recargar();
                esperar(2000);
            }

            esperar(100);
        }

        System.out.println("\nEl " + marca + " " + modelo + " ha llegado a su destino.");
        System.out.println("Kilometros recorridos: " + distancia +"\n");

    }

    @Override
    public void recargar(){
        System.out.println("Recargando gasolina al camión " + marca + " " + modelo + "...");
    }


}
