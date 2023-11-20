

package com.datastructure2023.week2;

/**
 *
 * @author sajin raj amatya
 */
public class recursion {
    public static void main(String[] args) {
        //iterative approach 
        int num = 7;
        
        for(int i = 0 ;i<=num ; i++ ){
            System.out.print(i + " ");
            
        }
        recursion obj = new recursion();
        obj.resursion1( num);
        
        
    }
        //Recursive approach 
    
       void  resursion1(int num){
         if ( num==8) return;
       
        System.out.print(num );
        resursion1(++num);
        
    }
      
    
    
}
