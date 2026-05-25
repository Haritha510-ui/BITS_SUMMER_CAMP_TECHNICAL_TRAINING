package day5;

public class Anagramstring {
    public static boolean solution(String s1,String s2) {
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length()) return false;

        int[] arr = new int[26];

        for(int i = 0;i < s1.length() - 1;i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        for(int i = 0;i < s2.length() - 1;i++) {
            arr[s2.charAt(i) - 'a']--;
        }

        for(int i = 0;i < arr.length;i++) {
            if(arr[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String s3 = "hello";

        System.out.println(s1 + " & " + " : " + solution(s1, s2));
        System.out.println(s1 + " & " + " : " + solution(s1, s3));
    }
}
