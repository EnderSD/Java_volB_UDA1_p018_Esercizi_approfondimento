/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_3;

/**
 *
 * Marrale Lorenzo
 * 
 * 
 */

public class Auto {
    
    //creazione attributi di tipo privato
    private String marca = "DeLorean ";
    private String modello = "DMC-12 ";
    private String targa = "EW790KF ";
    private String immatricolazione = "1985";
    
    public void stampa(){
        
        System.out.println("Ecco la marca, il modello, la targa e l'anno di immatricolazione della tua auto!: ");
        System.out.println(marca.toString() + modello.toString() + targa.toString() + immatricolazione.toString());
        
    }
    

    
    
            
    
}
