package com.net.maromo;

public class ComputadorTeste {

    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.m = "Velho";
        pc.Cor = "Cinza";
        pc.Marca = "hp";
        pc.Ns = 388;
        pc.p = 1000.0;
        pc.imprimir();
        pc.calcularValor();
        System.out.println("---------");
        pc.imprimir();


        Computador pc2 = new Computador();
        pc2.m = "Nova Geração";
        pc2.Cor = "Roxo";
        pc2.Marca = "IBM";
        pc2.Ns = 1212;
        pc2.p = 30000.0;
        pc2.imprimir();
        pc2.calcularValor();
        System.out.println();
        pc2.imprimir();
        int retorno = pc2.alterarValor(0);
        if(retorno==1){
            System.out.println("O preço foi alterado com exito.");
        }else{
            System.out.println("O valor está invalido.");
        }
        pc2.imprimir();

    }
    }

