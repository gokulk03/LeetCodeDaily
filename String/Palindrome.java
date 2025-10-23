package String;

public class Palindrome {
    
    public boolean ValidPalindrome(String s){
        if(s==null){
            return false;
        }
        if(s.isEmpty()){
            return true;
        }
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = cleanedString.length()-1;
        while(start<end){
            if(cleanedString.charAt(start)==cleanedString.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String inputStr = "Was it a car or a cat I saw?";
        Palindrome palindrome = new Palindrome();

        System.out.println("Answer: "+palindrome.ValidPalindrome(inputStr));
    }
}
