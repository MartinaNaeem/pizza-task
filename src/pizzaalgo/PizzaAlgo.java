/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaalgo;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class PizzaAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    Scanner  s=new Scanner(System.in);
    System.out.println("Enter number of slices");
   int numOfSlices=s.nextInt();
    int ExistingSlices[]=new int[numOfSlices];
    int NeededSlices[]=new int[numOfSlices];
    System.out.println("Enter all sizes of slices");
    for(int i=0;i<numOfSlices;i++){
        ExistingSlices[i]=s.nextInt();
    }
   
    System.out.println("Enter all sizes of needs");
    for(int i=0;i<numOfSlices;i++){
        NeededSlices[i]=s.nextInt();
    }
    
      SearchingMethod b=new SearchingMethod(); 
      b.search(NeededSlices, ExistingSlices);
    
    
     SortingMethod c=new SortingMethod();
     c.checkPossibility(NeededSlices, ExistingSlices);
  
       
    }
    
}
