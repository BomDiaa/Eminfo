package com.net.maromo;

public class Acampamento {
    public String nome;
    public char equipe;
    public int idade;

    public void imprimir(){
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("equipe: " + equipe);
    }
    public void separarGrupo(){
        if(idade <= 5){
            equipe = ' ';
        }else{
            if(idade <= 10){
                equipe = 'A';
            }else{
                if(idade <= 20){
                    equipe = 'B';
                }else{
                    equipe = 'C';
                }

            }
        }

    }
}
