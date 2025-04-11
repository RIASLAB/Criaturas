/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package criatura;

/**
 *
 * @author Jhon Edinson R
 */
    public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int danio);

    public boolean estaViva() {
        return salud > 0;
    }

    public String getNombre() 
    { return nombre; }
    public int getSalud() 
    { return salud; }
    public int getFuerza()
    { return fuerza; }
    public void setNombre(String nombre) 
    { this.nombre = nombre; }
    public void setSalud(int salud) 
    { this.salud = salud; }
    public void setFuerza(int fuerza) 
    { this.fuerza = fuerza; }
}

