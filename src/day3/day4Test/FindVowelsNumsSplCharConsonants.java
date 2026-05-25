package day3.day4Test;

public class FindVowelsNumsSplCharConsonants {
    public static void main(String[] args) {
        String s = "Haritha@143";
        int v = 0, c = 0, n = 0, sp = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isLetter(ch)) {
                if("aeiouAEIOU".indexOf(ch) != -1)
                    v++;
                else
                    c++;

            } else if (Character.isDigit(ch))
                n++;
                else
                    sp++;

            }
            System.out.println("Vowels = " + v);
            System.out.println("Consonants = " + c);
            System.out.println("Numbers = " + n);
            System.out.println("Special Characters = " + sp);
        }
    }

