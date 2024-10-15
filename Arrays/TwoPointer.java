import java.util.Arrays;
import java.util.ArrayList;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {11,7,2,17,13};

        ArrayList<Integer> result = FindTarget(arr, 20);
        if(result.isEmpty()){
            System.out.println("no pairs found");
        }else{
            System.out.println(result);
        }

    }

    public static ArrayList<Integer> FindTarget(int[] a,int target){
        Arrays.sort(a);
        ArrayList<Integer> arr = new ArrayList<>();
        int j = a.length -1;
        for(int i = 0; i<a.length-1;){
            int min = a[i], max = a[j];
            int current_sum = min + max;
            if(current_sum == target){
                arr.add(i);
                arr.add(j);
                return arr;
            }
            else if(current_sum > target){
                j--;
            }else{
                i++;
            }
            
        }
       return arr;
        
    }


}
