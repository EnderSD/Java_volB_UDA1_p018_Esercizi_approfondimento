/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_11;
import java.util.Scanner;

/**
 *
 * Marrale Lorenzo
 * 
 * 
 */

public class Rombo {
    

    // Dichiarazione variabili private
    private double x1, y1; 
    private double x2, y2; 
    private double x3, y3; 
    private double x4, y4; 
    private double lato;
    private double diagonale1;
    private double diagonale2;
    private double area;
    private double perimetro;
    

    public void calcolo_rombo() {

        //cvreazione dell'oggetto Scanner per ricevere input dall'utente    
        Scanner scanner = new Scanner(System.in);

        //Inserimento delle coordinate
        System.out.println("Inserisci le coordinate dei quattro vertici del rombo:");
        System.out.print("Vertice 1 x1, y1: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.print("Vertice 2 x2, y2: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        System.out.print("Vertice 3 x3, y3: ");
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();

        System.out.print("Vertice 4 x4, y4: ");
        x4 = scanner.nextDouble();
        y4 = scanner.nextDouble();

 

        //calcolo delle diagonali
        diagonale1 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        diagonale2 = Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2));

        //calcolo dell'area e del perimetro
        area = (diagonale1 * diagonale2) / 2;
        perimetro = 4 * lato;

        //sstampa delle informazioni calcolate
        System.out.println("Lato del rombo: " + lato);
        System.out.println("Diagonale 1: " + diagonale1);
        System.out.println("Diagonale 2: " + diagonale2);
        System.out.println("Area del rombo: " + area);
        System.out.println("Perimetro del rombo: " + perimetro);
    }
    
}
