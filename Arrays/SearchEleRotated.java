import java.util.Arrays;
public class SearchEleRotated {

    public static void main(String[] args) {
        int[] a = {30,40,50,60,10,20};
        int target = 50;
        int result = 0;
        int pivot = findPivot(a);
        System.out.println(pivot);
        
        if(a[pivot] <= target && target <= a[a.length-1]){
            result = binarySearch(a, pivot, a.length -1, target);
        }else{
            result = binarySearch(a, 0, pivot, target);
        }
        
        if(result == -1){
            System.out.println("Element is not found");
            
        }else{
                System.out.println("Element " + target +" is found at "+ result);
            }
        
    }
        public static int findPivot(int[] a){
            int low = 0, high = a.length -1;
            int pivot = 0;
            for(int i=0; i<a.length -1; i++){
                if(a[low] <= a[high]){
                    return low;
                }
                int mid = (low + high)/2;
                if(a[mid] > a[high]){
                    low = mid + 1;
                }else{
                    high = mid;
                }
            }
           return low; 
        }
        
        public static int binarySearch(int[] a, int low, int high, int target){
            int mid = low + (high -low) / 2;
            if(a[mid] == target){
                return mid;
            }else if(a[mid] < target){
                low = mid+1;
            }else{
                high = mid -1;
            }
            return -1;
        }
    
    
    
    
}