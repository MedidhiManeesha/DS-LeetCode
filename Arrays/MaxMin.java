import java.util.Arrays;
public class MaxMin {
    public static void main(String[] args) {
        int[] a ={23,1,12,54,231,534};
        Arrays.sort(a);

        System.out.println("min num: "+a[0]);;
        System.out.println("max num: "+ a[a.length -1]);
    }
}
