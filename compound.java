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
public class compound extends Bonos {

    public compound(String n, double d, double i, int a, String t) {
        super(n, d, i, a, t);
    }
    
    public double compuesto(int a, double i, double p) {
        double ut;
        if (i > 1) {
            i = i * .01;
        }
        if (a == 0) {
            ut = p;
        } else {
            ut = compuesto(a - 1, i, p * (1 + i));
        }

        return ut;
    }

    @Override
    public String toString() {
        return "Bond: "+nombre+"\n"
                +"Principal: $"+this.valPrinc+"\n"
                +"Interest rate (decimal): "+this.interes+"\n"
                +"Duration: "+this.duracion+" years\n"
                +"Type: "+this.tipo+"\n\n";
    }

    
    

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValPrinc() {
        return valPrinc;
    }

    public void setValPrinc(double valPrinc) {
        this.valPrinc = valPrinc;
    }
    @Override
    public double Rendimiento() {
        double ren;
        ren = compuesto(this.duracion, this.interes, this.valPrinc);
        return ren;
    }

    @Override
    public double utilidad() {
        double uti;
        uti = Rendimiento()-this.valPrinc;
        return uti;
    }
    
}
