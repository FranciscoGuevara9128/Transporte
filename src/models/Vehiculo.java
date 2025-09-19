package models;
/*

a) Crea una clase abstracta models.Vehiculo con atributos marca y modelo,
   y un metodo abstracto mover().

*/

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /*

    Metodo  que define cómo se mueve el vehículo.

    */
    public abstract void mover(int distancia);

    public void esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}