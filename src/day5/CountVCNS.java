package day5;

public class CountVCNS {
    public static void solution(String s) {
        s = s.toLowerCase();

        String vowels = "aeiou";
        String decimals = "234567189345";
        String specialChar = "!@#$%^&*()";

        int vowelsCount = 0;
        int decimalsCount = 0;
        int consonantsCount = 0;
        int specialCharCount = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(vowels.contains(Character.toString(ch))){
                vowelsCount++;
            } else if(decimals.contains(Character.toString(ch))){
                decimalsCount++;
            }else if(specialChar.contains(Character.toString(ch))){
                specialCharCount++;
            }else{
                consonantsCount++;
            }
        }
          System.out.println("Count of vowels:" + vowelsCount); 
           System.out.println("Count of decimals:" + decimalsCount);
            System.out.println("Count of specialChar:" + specialCharCount); 
             System.out.println("Count of consonants:" + consonantsCount);  
    }

    public static void main(String[] args) {
        String  s = "aeiouString123&#";
        solution(s);
    }
}
