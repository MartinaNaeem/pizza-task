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
public class SortingMethod {
   public   void merge(int arr[], int left, int medium, int right)
{
    int i, j, k;
    int n1 = medium - left + 1;
    int n2 =  right - medium;    
    int[] leftArr = new int[n1];
    int[] rightArr = new int[n2];
    for (i = 0; i < n1; i++)
        leftArr[i] = arr[left + i];
    for (j = 0; j < n2; j++)
        rightArr[j] = arr[medium + 1+ j];    
    i = 0; 
    j = 0; 
    k = left; 
    while (i < n1 && j < n2)
    {
        if (leftArr[i] <= rightArr[j])
        {
            arr[k] = leftArr[i];
            i++;
        }
        else
        {
            arr[k] = rightArr[j];
            j++;
        }
        k++;
    }
    while (i < n1)
    {
        arr[k] = leftArr[i];
        i++;
        k++;
    }
    while (j < n2)
    {
        arr[k] = rightArr[j];
        j++;
        k++;
    }  
}
     
   public   void mergeSort(int arr[], int left, int right)
{
    if (left < right)
    {
        int medium = left+(right-left)/2;
        mergeSort(arr, left, medium);
        mergeSort(arr, medium+1, right);
       merge(arr, left, medium, right);
    }
}
    
     


public void checkPossibility(int NeededSlices[],int ExistingSlices[]){
     int counter=0;
     mergeSort(ExistingSlices,0,ExistingSlices.length-1);
     mergeSort(NeededSlices,0,ExistingSlices.length-1);
       for(int i=0;i<ExistingSlices.length;i++){
         if(NeededSlices[i]<=ExistingSlices[i]){
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
   