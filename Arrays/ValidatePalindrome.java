import java.util.Scanner;
public class ValidatePalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        boolean status = PalindromeChecker(str);
        if(status){
            System.out.println("Yes, It is palindrome string");
        }else{
            System.out.println("NO. It's not a palindrome");
        }

    }
    public static boolean PalindromeChecker(String s){
        String normalized = normalizedString(s);
        int left = 0;
        int right = normalized.length() -1;
        while(left < right){
            if(normalized.charAt(left) != normalized.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String normalizedString(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}