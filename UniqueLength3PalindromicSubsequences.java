public class UniqueLength3PalindromicSubsequences {

    public static void main(String[] args){

    }
    

    public int countPalindromicSubsequence(String s) {
        Map<Character,Integer> first = new Map<>();
        Map<Character,Integer> last = new Map<>();
        Set<Character> unique = new HashSet<>();


        for(int i=0;i<s.length();i++){
            Char ch = s.CharAt(i);
            unique.add(ch);
            if(first.containsKey(ch)){
                continue;
            }
            first.put(ch,i);
        }
        for(int i=s.length()-1;i>=0;i--){
            Char ch = s.CharAt(i);
            if(last.containsKey(ch)){
                continue;
            }
            last.put(ch,i);
        }

        int ans = 0;
        for(char ch:unique){
            Set<Character> set = new HashSet<>();
            
            for(int i=first.get(ch)+1;i<=last.get(ch)-1;i++){
                set.add(s.charAt(i));
            }
            ans+=set.size();
        }
        return ans;
    }

}
