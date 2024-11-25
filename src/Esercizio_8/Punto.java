/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_8;
import java.util.Scanner;

/**
 *
 * Marrale Lorenzo
 * 
 * 
 */
public class Punto {
    
    //inizializzazione variabili di tipo privato
    private double x;
    private double y;
    private double distanza_origine;
    
    public void scan_coordinate(){

        // Creazione dell'oggetto Scanner per ricevere input dall'utente
        Scanner scan = new Scanner(System.in);
        
        //richiesta all'utente di inserire un valore per x e per y
        System.out.println("Inserisci la coordinata x ");
        x = scan.nextDouble();
        System.out.println("Inserisci la coordinata y ");
        y = scan.nextDouble();
        
        //formula per calcolare la distanza dall'origine
        distanza_origine = Math.sqrt(x * x + y * y);
        
        //stampa risultato
        System.out.println("La distanza dal punto all'origine è: " + distanza_origine);
        
        
    }
    
    
}
