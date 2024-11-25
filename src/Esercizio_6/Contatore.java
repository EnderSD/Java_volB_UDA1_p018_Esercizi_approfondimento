/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_6;
import java.util.Scanner;

/**
 *
 * Marrale Lorenzo
 * 
 * 
 */


public class Contatore {
    
    //dichiarazione attributi privati 
    private int variabile_partenza = 10;
    private int valore_max = 20;
    private int incremento_variabile = 1;
    private int modificatore;
    private String risposta = "";
    
    public void incremento_decremento_finche_max_raggiunto(){
        
        //creazione dell'oggetto Scanner per ricevere input dall'utente
        Scanner scan = new Scanner(System.in);
        
        //messaggio iniziale per spiegare il funzionamento del programma
        System.out.println("Il contatore parte da 10, inserire 0 per diminuire, 1 per aumentare, qualsiasi altro numero per uscire, quando viene raggiunto 20, inserire T per ripartire altrimenti qualsiasi altra lettera");
        
        do {
            
            //richiesta all'utente di un valore per modificare il contatore
            modificatore = scan.nextInt();
            scan.nextLine(); 
            
            // Controllo se l'utente vuole decrementare il contatore
            if(modificatore == 0){
                
                //decremento della variabile di partenza
                variabile_partenza = variabile_partenza - incremento_variabile;
                //stampa del nuovo valore del contatore
                System.out.println("La variabile è stata decrementata ora vale: "+ variabile_partenza);
            
            //controllo se l'utente vuole incrementare il contatore
            } else if(modificatore == 1){
                
                //incremento della variabile di partenza
                variabile_partenza = variabile_partenza + incremento_variabile;
                //stampa del nuovo valore del contatore
                System.out.println("La variabile è stata incrementata ora vale: "+ variabile_partenza);
                
            //caso in cui l'utente inserisce un numero diverso da 0 o 1
            } else{
                
                //uscita dal ciclo
                System.out.println("Ciclo interrotto");
                break;
            }
            
            //cntrollo se la variabile di partenza ha raggiunto il valore massimo
            if(variabile_partenza == valore_max){
                
                //richiesta all'utente se desidera ricominciare il conteggio
                System.out.println("La variabile ha raggiunto 20, desidera ricominciare da 0? Se si digitare T altrimenti digitare qualsiasi altra lettera ");
                risposta = scan.nextLine(); 
                
                //controllo se l'utente ha scelto di ricominciare
                if(risposta.equalsIgnoreCase("T")){
                    
                    //reset della variabile di partenza
                    variabile_partenza = 0;
                    System.out.println("Il contatore è stato azzerato ora ricomincia da 0");
                    
                //caso in cui l'utente sceglie di non ricominciare
                }else{
                    
                    //uscita dal ciclo
                    System.out.println("Ciclo interrotto");
                    break;
                    
                }
            }

        //il ciclo continua solo se l'utente inserisce 0 o 1
        } while(modificatore == 0 || modificatore == 1);
        
    }
    
}





