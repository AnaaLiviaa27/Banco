/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.contabancaria;

/**
 *
 * @author ana62216106
 */
public class Conta_PJ extends ContaBancaria {
    private int cnpj;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public Conta_PJ(int cnpj,String titular) {
        super(titular);
        this.cnpj = cnpj;
    }
    @Override
    public void imprimir(){
        System.out.println("Nome do titular:" + this.getTitular());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("CPF:" + cnpj);
        System.out.println("-------------------------------------"); 
}
}

