
import java.util.Arrays;
import java.util.HashMap;

//Brute force approach - TimeComplexity : O(Mlogm +nlogn) - sorting space: o(m+n)
public class VaildAnagram {
     public boolean isAnagramBruteForce(String s, String t) {
        if(s.length() != t.length()){
            return Boolean.FALSE;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    
    }

    public Boolean isAnagramOptimized(String s, String t){
        if(s.length()!=t.length()){
            return Boolean.FALSE;
        }

        HashMap<Character, Integer> sCharHashMap = new HashMap<>();
        HashMap<Character, Integer> tCharHashMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            sCharHashMap.put(s.charAt(i), sCharHashMap.getOrDefault(s.charAt(i),0)+1);
            tCharHashMap.put(t.charAt(i), tCharHashMap.getOrDefault(t.charAt(i), 0) +1);
        }
        return sCharHashMap.equals(tCharHashMap);
    }


    public static void main(String[] args) {
        VaildAnagram vaildAnagram = new VaildAnagram();

        System.out.println("Result: "+vaildAnagram.isAnagramBruteForce("racecar", "carrace"));
        System.out.println("Result Optimized : "+vaildAnagram.isAnagramOptimized("racecar", "carrace"));

    }
}
