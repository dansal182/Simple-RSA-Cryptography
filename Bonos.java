/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoSecreto;

/**
 *
 * @author danielsalnikov
 */
public abstract class Bonos {
    protected double interes;
    protected int duracion;
    protected String tipo;
    protected String nombre;
    protected double valPrinc;
    
    

    public Bonos(String n, double d, double i, int a, String t) {
        if (i > 1) {
            i = i * .01;
        }
        this.nombre=n;
        this.valPrinc=d;
        
        this.duracion = a;
        this.interes = i;
        this.tipo = t;
    }
    
    public abstract double Rendimiento();
    public abstract double utilidad();
    public abstract String getNombre();

    /**
     *
     * @param n
     */
    public abstract void setNombre(String n);
    
}
