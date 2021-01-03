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
public class Decriptar {

    protected final char[] letras = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    protected final int[] clave = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};

    private final int llavePrivada = 9379;
    private int numerico[] = new int[150];
    private int llavePublica;
    private final int base = 179131;

    public Decriptar(int v[], int k) {
        this.numerico = v;
        this.llavePublica = k;
    }

    public int[] decriptarTexto(int v[]) {
        int vDec[] = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            vDec[i] = modular(v[i], this.llavePrivada, this.base);
        }
        return vDec;
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

    public String traducir(int[] v) {
        char[] claveNum = new char[v.length];
        int pass;
        String t;
        for (int i = 0; i < v.length; i++) {
            pass = v[i];
            for (int j = 0; j < 27; j++) {
                if (pass == clave[j]) {
                    claveNum[i] = letras[j];
                }
            }
        }
        t = String.valueOf(claveNum);
        return t;
    }

    public String[] claveLetras(int v[]) {
        String claNum[] = new String[v.length];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 10) {
                claNum[i] = "00000" + Integer.toString(v[i]);
            } else if (v[i] < 100) {
                claNum[i] = "0000" + Integer.toString(v[i]);
            } else if (v[i] < 1000) {
                claNum[i] = "000" + Integer.toString(v[i]);
            } else if (v[i] < 10000) {
                claNum[i] = "00" + Integer.toString(v[i]);
            } else if (v[i] < 100000) {
                claNum[i] = "0" + Integer.toString(v[i]);
            } else {
                claNum[i] = Integer.toString(v[i]);
            }

        }
        
        return claNum;
    }

    public int[] claveFinal(String[] v) {
        String clavNum[] = new String[v.length * 2];
        int[] vecCla = new int[v.length * 2];
        int k = 0;
        for (int i = 0; i < v.length; i++) {
            clavNum[k] = v[i].substring(0, 4);
            clavNum[k + 1] = v[i].substring(4, 6);
            k += 2;
        }
        for (int i = 0; i < v.length * 2; i++) {
            vecCla[i] = Integer.parseInt(clavNum[i]);
        }

        return vecCla;
    }

}
