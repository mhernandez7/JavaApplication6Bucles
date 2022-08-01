/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6bucles;
/**
 *
 * @author Miguel
 */
public class Numero {
    
    private int listaFibonacci;
    private int numero1;
    private int aux;
    
 
    public Numero(){
    this.listaFibonacci = 0;
    this.numero1 = 1;
    this.aux = 0;
    
    }

    public void calcularLista()
    {
      for (int i =0; i<10 ; i++)
        {
        System.out.println(this.listaFibonacci);
        this.aux = this.listaFibonacci + this.numero1;
        this.listaFibonacci = this.numero1;
        this.numero1 = this.aux;
        
        }
    
    }
    
}
