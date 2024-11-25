/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_10;
import java.util.Scanner;
        
/**
 *
 * Marrale Lorenzo
 * 
 * 
 */
public class Rettangolo {
    
    //dichiarazione variabili private
     private double x1, y1; 
     private double x2, y2; 
     private double x3, y3; 
     private double x4, y4; 
     private double base;
     private double altezza;
     private double area;
     private double perimetro;
     
     
     public void calcolo_rettangolo(){
         
        //Creazione dell'oggetto Scanner per ricevere input dall'utente    
        Scanner scanner = new Scanner(System.in);
     
        //non c'è bisogno di inserire tutti i vertici in quanto altrimenti non sarebbe più un rettangolo
        
        //Inserimento di due vertici opposti
        System.out.println("Inserisci le coordinate di due vertici opposti del rettangolo:");
        System.out.print("Vertice 1 x1, y1: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.print("Vertice 2 x3, y3: ");
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();

        //calcolo automatico degli altri due vertici in quanto le coordinate di alcuni di essi DEVONO essere equivalenti
        x2 = x3;
        y2 = y1;
        x4 = x1;
        y4 = y3;

        //calcolo base e altezza
        base = Math.abs(x3 - x1); // Distanza tra x1 e x3
        altezza = Math.abs(y3 - y1); // Distanza tra y1 e y3
   
        //calcolo area e perimetro 
        area = base * altezza;
        perimetro = 2 * (base + altezza);
        
        //stampa informazioni ricavate dai svariati calcoli
        System.out.println("La base del rettangolo vale "+ base);
        System.out.println("L'altezza del rettangolo vale "+ altezza);
        System.out.println("L'area e' di "+ area);
        System.out.println("Il perimetro vale "+ perimetro);


     }
}
