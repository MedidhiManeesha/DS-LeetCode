

public class AnagramRecursive {
    public static void main(String[] args) {
        String s1 = "aaba";
        String s2 = "abaa";
        String result = isRecursive(s1, s2);
        System.out.println(result);
    }
    
    static String isRecursive(String A, String B){
        A = A.toLowerCase();
        B = B.toLowerCase();

        if(A.equals(B)){
            return "Yes";
        }

        if(A.length() % 2 != 0 || B.length() % 2 != 0){
            return "No";
        }
        
        int n = A.length() - 1;
        String a1 = A.substring(0, n/2);
        String a2 = B.substring(n/2);
        String b1 = A.substring(0, n/2);
        String b2 = B.substring(n/2);

        if(isRecursive(a1, b1).equals("Yes") && isRecursive(a2, b2).equals("Yes") || isRecursive(a1, b2).equals("Yes") && isRecursive(a2, b1).equals("Yes")){
            return "Yes";
        }

        return "No";
    }
}
