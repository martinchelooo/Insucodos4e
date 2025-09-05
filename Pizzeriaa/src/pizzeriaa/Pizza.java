/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeriaa;

/**
 *
 * @author Duoc
 */
public class Pizza {
    //declaracion de atributos
    public String nombre , tamaño, masa;
    //se crea metodo constructor

    public Pizza(String nombre, String tamaño, String masa) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.masa = masa;
    }
   //se crea accesadores y mutadores (Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
    //metodos propios (customer)
    public void preparar(){
        System.out.println("Su pizza se esta preparando");
    }
    public void calentar(){
        System.out.println("Su pizza se esta calentando");
    }
    
}
