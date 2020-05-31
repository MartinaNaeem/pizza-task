/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaalgo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author marti
 */
public class SearchingMethod {
    public void search(int NeededSlices[],int ExistingSlices[]){
         List<Integer>needsList= IntStream.of(NeededSlices).boxed().collect(Collectors.toCollection(ArrayList::new));
         List<Integer>slicesList= IntStream.of(ExistingSlices).boxed().collect(Collectors.toCollection(ArrayList::new));
        int counter=0;
        for(int i=0; i<slicesList.size();i++){
            for(int j=0;j<needsList.size();j++){
                if(needsList.get(j)==slicesList.get(i)){
                   needsList.remove(j);
                   slicesList.remove(i);
                     counter++;
                     break;
            }              
         }
       }
        if(counter==ExistingSlices.length){
                  System.out.println("Possible");
            }
            else{
                    Collections.sort(needsList);
                    Collections.sort(slicesList);
                    for(int m=0;m<needsList.size();m++){
                            if(needsList.get(m)<slicesList.get(m)){
                                counter++;
                            }
                    }
                    if(counter==ExistingSlices.length){
                  System.out.println("Possible");
            }
                    else{
                        System.out.println("Not Possible");
                    }
            }
    }
    
    
    
}


