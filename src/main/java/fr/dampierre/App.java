package fr.dampierre;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    int euro=100 ;
    Scanner sc = new Scanner (System.in) ;
    System.out.println("Bonjour! je suis l'assistant de la machine à café. Dites-moi les pièces jaunes dont vous disposez:");
    System.out.print("pièces de 1 cent?");
    int un_cent= sc.nextInt();
    System.out.print("pièces de 5 cents?");
    int cinq_cents= sc.nextInt();
    System.out.print("pièces de 10 cents?");
    int dix_cents= sc.nextInt() ;
    System.out.print("pièces de 20 cents?");
    int vignt_cents= sc.nextInt();
    System.out.print("pièces de 50 cents?");
    int cinquante_cents= sc.nextInt();
    int somme = un_cent*1 + cinq_cents*5 + dix_cents*10 + vignt_cents*20 + cinquante_cents*50;
    int différence= euro-somme;
    if (différence>0) {
        
            System.out.println("Il vous manque "+différence+ " cents pour prendre un café.");
            
        }
    else if (différence<0) {
            System.out.println("il vous restera "+ Math.abs(différence)+ " cents après avoir pris votre café !");
            
        }

    else{System.out.println("Vous avez exactement de quoi vous payer le café !");} 
    
    

    
   

    }
    
}
