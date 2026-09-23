/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.contabancaria;

/**
 *
 * @author ana62216106
 */
public class ContaBancaria {
    private double saldo;
    private String titular; 
    
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.00;
    }
       //tipo do atributo//
    public String getTitular(){
       return this.titular;
   }
    
   public double getSaldo(){
       return this.saldo;
   }
    
   public void setTitular(String titular){
       this.titular = titular;
   }
         
    public void depositar(double valor){
        if(valor>0){
        this.saldo = this.saldo + valor;
    }else{System.out.println("Não eé permitido depositar valor negativo");
     }
     }
    public void sacar(double valor){
//valor do saque tem que ser maior que 0,um número positivo//   //e valor do saque tem que ser menor ou igual ao valor do saldo//
        if(valor>0 && valor<= this.saldo){
         this.saldo = this.saldo - valor;
     }else{System.out.println("Saque não permitido!!");
     }
     }
    
    public void imprimir(){
        
    }
    
    public void extratoBancario(){
        System.out.println("Saldo: " + this.saldo);
        System.out.println("-------------------------------------"); 
    }
}


