/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Esercizio_2;

/**
 *
 * @author loren
 */
public class Esercizio_2_Prodotto_Main {

    public static void main(String[] args) {
        
        //istanziazione oggetto con il costruttore senza parametri
        Prodotto prodotto1 = new Prodotto();
        //stampa dei valori predefiniti all'interno della classe
        prodotto1.stampa();
        
        //istanziazione oggetto con passaggio di parametri
        Prodotto prodotto2 = new Prodotto("Marrale L.", "Lorezo Marrale");
        //stampaa dei valori passati al costruttore
        prodotto2.stampa();
        
        
        
    }
      
    
}
