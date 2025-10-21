/*

    d) En el main, genera un arreglo de Vehiculo e invoca sus métodos polimórficamente.

 */

package run;

import models.Camion;
import models.Carro;
import models.Moto;
import models.Vehiculo;

public class Main {
    public static void main(String[] args) {

        // Arreglo de vehiculo
        Vehiculo[] vehiculos = {
                new Carro("Toyota", "Yaris"),
                new Camion("Suzuki", "Hino"),
                new Moto("Genesis", "150")
        };

        for  (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover(60);
            /*
            Implementación del polimorfismo, ya que el metodo mover
            se aplica sobre cada instancia que heredó la clase Vehiculo
            por lo cual se comportan diferentes
             */
        }
    }
}
