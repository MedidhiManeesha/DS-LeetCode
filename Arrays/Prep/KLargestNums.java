package Prep;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestNums {
    
    int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0; i<k; i++){
            minHeap.add(arr[i]);
        }
        
        for(int i=k; i<n; i++){
            if(arr[i]> minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        int[] result = new int[k];
        for(int i =k-1; i>=0; i--){
            result[i] = minHeap.poll();
        }
        System.out.println(result);
        return result;
    }

}
