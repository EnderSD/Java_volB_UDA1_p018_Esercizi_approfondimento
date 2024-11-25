/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_9;
import java.util.Scanner;


/**
 *
 * Marrale Lorenzo
 */
public class Cerchio {
      

    //inizializzazione variabili di tipo privato
    private double x;
    private double y;
    private double raggio;
    private double area;
    private double perimetro;
    
    public void scan_coordinate(){

        // Creazione dell'oggetto Scanner per ricevere input dall'utente
        Scanner scan = new Scanner(System.in);
        
        //richiesta all'utente di inserire un valore per x e per y
        System.out.println("Inserisci la coordinata x ");
        x = scan.nextDouble();
        System.out.println("Inserisci la coordinata y ");
        y = scan.nextDouble();
        System.out.println("Inserisci il raggio ");
        raggio = scan.nextDouble();
        
        //calcolo tramite utilizzo di formule matematiche l'area e il perimetro del cerchio
        area = Math.PI * raggio * raggio;
        perimetro = 2 * Math.PI * raggio;
        
        System.out.println("rispettivamente l'area e il perimetro con origine in " + x + "; " + y + " e raggio di " + raggio + " cm e' di " + area + " e " + perimetro );
  
        
        
    }
    
    
}
