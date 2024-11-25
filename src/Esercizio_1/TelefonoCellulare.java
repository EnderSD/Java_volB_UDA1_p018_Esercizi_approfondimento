/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_1;
import java.util.Scanner;

/**
 *
 * Marrale Lorenzo
 * 
 * 
 * 
 */

public class TelefonoCellulare {
     
    //creazione variabili di tipo privato 
    private String marca;
    private int memoria;
    private double prezzo;
      
    public void scan(){

        //crea un oggetto Scanner per leggere l'input
        Scanner scan = new Scanner(System.in);
        //richiesta all'utente di inserire la marca del Telefono
        System.out.println("Inserisci marca Telefono: ");
        //imposta alla variabile marca il valore immesso dall'utente
        marca = scan.nextLine();
        //richiesta all'utente di inserire la quantità di memoria del Telefono
        System.out.println("Inserisci quantità memoria del Telefono ");
        //imposta alla variabile memoria il valore immesso dall'utente
        memoria = scan.nextInt();
        //richiesta all'utente di inserire il prezzo del del Telefono
        System.out.println("Inserisci il prezzo del Telefono ");
        //imposta alla variabile prezzo il valore immesso dall'utente
        prezzo = scan.nextDouble();
    }
     
    public void stampa_caratteristiche(){
        
        //stampa input precedentemente ricevuti dall'utente
        System.out.println("la marca del Telefono: " + marca);
        System.out.println("La memoria del telefono è pari a: " + memoria + "GB");
        System.out.println("Il prezzo del telefono e': " + prezzo);
        
        
    }
    
}
    
