
package com.datastructure2023.week1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author sajin
 */
public class tutorial {
    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);
        System.out.println("Enter the number of player");
        int playerr = player.nextInt();
        
        
        ArrayList name = new ArrayList();
        for(int i = 0; i < playerr; i++){
            Scanner namee = new Scanner(System.in);
            System.out.print("Enter the name of the player");
            String nameo = namee.nextLine();
            name.add(nameo);
        }
        System.out.println(name);
        
        Scanner play = new Scanner(System.in);
        System.out.println("do you want to play game (Y/N)");
        String plays = play.next();
       
        if("Y".equalsIgnoreCase(plays)){
            // generating the random numbers
            
            Random random = new Random();
            int rand1 = random.nextInt((playerr - 1) + 1 ) + 1 ;
             if (rand1 == 5 ){
                 name.remove(5);
                 System.out.print("Index five player is removed");
             }
        } 
        else{
            
            System.out.println("Thank you for cooperation");
            System.out.println("Do you want to play the game again");
            
            
        }
       
    }
}

