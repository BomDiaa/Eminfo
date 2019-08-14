package com.net.maromo;

public class Conta {
    public String Conta;
    public String A;
    public double s;
    public String Nc;

    public int sacar(double valor){
        if(valor<=s){
            s -= valor;
            return 1;
        }
        return 0;
    }
    public void depositar(double valor){
        s += valor;
    }
    public void imprimir(){
        System.out.println("A Conta = " + Conta);
        System.out.println("A Agencia = " + A);
        System.out.println("O Saldo = " + s);
        System.out.println("O Nome do Cliente = " + Nc);
        System.out.println("---------");
    }
}
