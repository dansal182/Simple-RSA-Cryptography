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
public class simple extends Bonos{

    public simple(String n, double d, double i, int a, String t) {
        super(n, d, i, a, t);
    }

    @Override
    public double Rendimiento() {
        return (this.valPrinc*this.interes*this.duracion)+this.valPrinc;
    }

    @Override
    public double utilidad() {
        return Rendimiento()-this.valPrinc;
    }

    
    @Override
    public String toString() {
        return "Bond: "+nombre+"\n"
                +"Principal: $"+this.valPrinc+"\n"
                +"Interest rate (decimal): "+this.interes+"\n"
                +"Duration: "+this.duracion+" years\n"
                +"Type: "+this.tipo+"\n\n";
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
}
