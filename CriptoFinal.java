/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptofinal;

/**
 *
 * @author danielsalnikov
 */
public class CriptoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Encriptar frase=new Encriptar("me encanta el sexo");
        int v[]=new int [20];
        int vec[]=new int [20];
        int vec2[]=new int [20];
        int vec4[]=new int [20];
        String vec5[]=new String [20];
        int vec6[]=new int [200];
        v=frase.traduccion(frase.getFrase());
        vec=frase.claveNum(v);
        vec2=frase.encriptarTexto(vec);
        Decriptar vec3=new Decriptar(vec2,17);
        vec4=vec3.decriptarTexto(vec2);
        String y;
       

        vec5=vec3.claveLetras(vec);
        vec6=vec3.claveFinal(vec5);
        y=vec3.traducir(vec6);
        System.out.println(y);
        System.out.println("\n\n");
        for (int i=0;i<v.length;i++)
            System.out.println(v[i]);
        
        for (int i=0;i<vec.length;i++)
            System.out.println(vec[i]);
        System.out.println("\n\n");
        for (int i=0;i<vec.length;i++)
            System.out.println(vec2[i]);
        System.out.println("\n\n");
        for (int i=0;i<vec6.length;i++)
            System.out.println(vec6[i]);
        
        
    }
    
}
