import java.util.Arrays;
import java.util.PriorityQueue;
public class KLargestNums {
    public static void main(String[] args) {
        
        int[] array = {1,34,23,4,12,53};
        int size = 6;
        int k = 3;
        kLargest(array, size, k);
        
    }
    
    public static void kLargest(int[] arr, int n, int k) {
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
        
        System.out.println(Arrays.toString(result));   
    }
    
}


