/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numerosprimos;

/**
 *
 * @author erick
 */
public class NumerosPrimos {
    
     public static void main(String[] args) {
       
       
      int contador=0;  
      int numero=1;
      int i=0;
      
      int divisibles=0;
      
      System.out.println("Lista de 9 Numeros primos:");
      
        while(contador<9){
            //i=0;
            divisibles=0;
            for(i=1; i<=numero; i++){
                if(numero%i==0){
                    divisibles++;
                }
            }
            
            if(divisibles==2){
                contador++;
                System.out.println(numero);
            }
            numero++;
        }
      
    }

    }



