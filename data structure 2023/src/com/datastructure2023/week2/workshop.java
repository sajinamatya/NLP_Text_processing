
package com.datastructure2023.week2;

/**
 *
 * @author sajin 
 */
public class workshop {
    
    public static void main(String[] args) {
        
     
      workshop object = new workshop();
        object.exercise2();
        
        
        
    }
    
    public void execrise1 () {
        final int ARRAY_SIZE = 10;
        double array[] = new double[10];
        double element = array[3];
        array[8] = 1.667;
        array[5] = 3.333 ;
         double sum_array = 0; 
        for( int i = 0 ; i<array.length ; i++ ){
           sum_array = sum_array + array[i];
        
        
    }
    }
   public void exercise2 (){
      
       int array[][] = {{0,1,2},{1,2,3},{2,3,4}};
       final int ARRAY_SIZE = 3 ; 
       System.out.println("the lenght of the array is " + array.length);
       for ( int i = 0 ;i < ARRAY_SIZE ; i++ ) {
           System.out.print("[");
           
            for ( int j= 0 ;j<array[i].length; j++){
                System.out.print("");
               System.out.print(array[i][j] + "," );
               if(array[i].length == 2){
                   System.out.print( " ");
               }
               
               
           }
            
            System.out.print("]");
            System.out.println();
       }
   }
       
       public void exercise3 (){
       final int ARRAY_SIZE = 5 ;
       final int ARRAY_SIZE1= 10;
       ARRAY_SIZE = ARRAY_SIZE1;
        int [] b = new int[10];
        for ( int i = 0; i < b.length; i++ ){ 
            b[i] = 1 ; 
            
        }
        }

       
       }
  
              
       
       
   
   
    

