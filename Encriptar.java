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
public class Encriptar {

    protected final char[] letras = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    protected final int[] clave = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};

    protected String frase;
    private final int base = 179131;
    private final int llavePublica = 19;

    public Encriptar(String f) {
        if (f.length() % 2 == 1) {
            f = f + "x";
        }
        this.frase = f.toLowerCase();
    }

    public int[] traduccion(String f) {
        int l;
        l = f.length();
        char z;
        int[] vecNum = new int[l];
        for (int i = 0; i < l; i++) {
            z = f.charAt(i);
            for (int j = 0; j < 27; j++) {
                if (z == letras[j]) {
                    vecNum[i] = clave[j];
                }
            }
        }
        return vecNum;
    }

    public int[] claveNum(int[] v) {
        String[] claveNum = new String[v.length];
        String[] claveNume = new String[(v.length) / 2];
        int vecClave[] = new int[(v.length) / 2];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 10) {
                claveNum[i] = "0" + Integer.toString(v[i]);
            } else {
                claveNum[i] = Integer.toString(v[i]);
            }
        }
        int k = 0;
        for (int j = 0; j < v.length / 2; j++) {
            claveNume[j] = claveNum[k] + claveNum[k + 1];
            k += 2;
        }
        for (int s = 0; s < v.length / 2; s++) {
            vecClave[s] = Integer.parseInt(claveNume[s]);
        }
        return vecClave;
    }

    public int modular(int x, int y, int z) {
        long res = 1;
        long bas = x;
        while (y > 0) {
            if ((y % 2) == 1) {
                res = (res * bas) % z;
            }
            bas = (bas * bas) % z;
            y = Math.floorDiv(y, 2);
        }
        return (int) res;
    }

    public int[] encriptarTexto(int[] v) {
        int vecEncr[] = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            vecEncr[i] = modular(v[i], this.llavePublica, this.base);
        }
        return vecEncr;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getBase() {
        return base;
    }

    public int getLlavePublica() {
        return llavePublica;
    }

}
