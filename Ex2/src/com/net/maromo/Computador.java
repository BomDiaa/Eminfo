package com.net.maromo;

public class Computador {
    public String Marca;
    public String Cor;
    public long Ns;
    public double p;
    public String m;

    public void imprimir(){
        System.out.println("marca = " + Marca);
        System.out.println("modelo = " + m);
        System.out.println("cor = " + Cor);
        System.out.println("numeroSerie = " + Ns);
        System.out.println("preco = " + p);
    }
    public void calcularValor(){
        if(Marca.equalsIgnoreCase("HP")){
            p *= 1.3;
            return;
        }
        if(Marca.equalsIgnoreCase("IBM")){
            p *= 1.5;
        }
    }
    public int alterarValor(double valor){
        if(valor>0){
            p = valor;
            return 1;
        }
        return 0;
    }
}
