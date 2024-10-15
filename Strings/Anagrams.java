public class Anagrams {
    public static void main(String[] args) {
        String s1 = "Manisha";
        String s2 = "maneesha";
        String result = AnagramCount(s1, s2);
        System.out.println(result);
    }

    static String AnagramCount(String A, String B){
        A = A.toLowerCase();
        B = B.toLowerCase();

        if(A.length() != B.length()){
            return "No";
        }

        int[] count = new int[26];

        for(char c: A.toCharArray()){
            count[c - 'a']++;
        }
        for(char c: B.toCharArray()){
            count[c - 'a']--;
        }

        for(int num: count){
            if(num != 0){
                return "No";
            }
        }
        return "Yes";
    }
}
