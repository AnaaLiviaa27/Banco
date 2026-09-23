/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.contabancaria;

import java.util.Scanner;

/**
 *
 * @author ana62216106
 */
public class Banco {
     public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        String nome;
         
        System.out.println("Nome do Titular: ");
        nome = entrada.nextLine();
        
        System.out.println("CPF do Titular");
        cpf = entrada.nextLine();
                                                   //escrever nome//
        ContaBancaria conta1 = new ContaBancaria(nome);
        
       conta1.depositar(100);
       conta1.sacar(10);
       conta1.extratoBancario();
       
       System.out.println(conta1.getTitular());
       System.out.println(conta1.getSaldo());
       
       conta1.setTitular("Livia");
       
       System.out.println(conta1.getTitular());
       
       Conta_PF conta_pf = new Conta_PF(456789303,"Joaquina");
       
       conta_pf.imprimir();
       
       Conta_PJ conta_pj = new Conta_PJ(78986567,"Daniele");
       
       conta_pj.imprimir();
    }
} 


