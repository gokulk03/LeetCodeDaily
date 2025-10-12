
import java.util.Arrays;

//Brute force approach - TimeComplexity : O(Mlogm +nlogn) - sorting space: o(m+n)
public class VaildAnagram {
     public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return Boolean.FALSE;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    
    }


    public static void main(String[] args) {
        VaildAnagram vaildAnagram = new VaildAnagram();

        System.out.println("Result: "+vaildAnagram.isAnagram("racecar", "carrace"));

    }
}
