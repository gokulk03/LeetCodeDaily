class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] prefixSum = new int[words.length]; 
        int startAndEndVowels = 0;
        int i=0;
        for(String word : words){
            if(startAndEndWithVowels(word)){
                startAndEndVowels++;
            }
            prefixSum[i++] = startAndEndVowels;

        }
        int result[] = new int[queries.length];
        i=0;
        for(int [] query: queries){
            result[i++] = prefixSum[query[1]] - (query[0]==0?0:prefixSum[query[0] - 1]);
        }

        return result;
    }
    private boolean startAndEndWithVowels(String word){
        return isVowel(word.charAt(0)) && isVowel(word.charAt(word.length()-1));
    }

    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}