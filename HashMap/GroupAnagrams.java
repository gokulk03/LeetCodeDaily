package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class GroupAnagrams{

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sortedFrequencyMap = new HashMap<>();
        for(String temp : strs){
            char[] sortedChar = temp.toCharArray();
            Arrays.sort(sortedChar);
            String sortedStr = new String(sortedChar);
            sortedFrequencyMap.putIfAbsent(sortedStr, new ArrayList<>());
            sortedFrequencyMap.get(sortedStr).add(temp);
        }
        List<List<String>> ansString = new ArrayList<>(sortedFrequencyMap.values());
        return ansString;
    }


    public List<List<String>> groupAnagramsOptimized(String[] args){
        if(args.length==0 || args == null){
           return new ArrayList<>();
        }
        HashMap<String, List<String>> frequencyHashMap = generateFrequencyMap(args);
        return new ArrayList<>(frequencyHashMap.values());
    }

    public HashMap<String, List<String>> generateFrequencyMap(String[] args){
         HashMap<String, List<String>> frequencyHashMap = new HashMap<>();
        for(String temp: args){
            int[] charFreqArray = new int[26];

            char[] tempCharArr = temp.toCharArray();
            for(char tempChar : tempCharArr){
                charFreqArray[tempChar-'a']++;
            }

            char startChar = 'a';
            StringBuilder frequencyStringKey = new StringBuilder("");
            for(int i : charFreqArray){
                frequencyStringKey.append(startChar);
                frequencyStringKey.append(i);
                startChar++;
            }

            String frequencyStr = frequencyStringKey.toString();
            frequencyHashMap.putIfAbsent(frequencyStr, new ArrayList<>());
            frequencyHashMap.get(frequencyStr).add(temp);
        
        }
        
        return frequencyHashMap;
      
    }
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        GroupAnagrams grpAnagrams = new GroupAnagrams();
        System.out.println("Ans : "+grpAnagrams.groupAnagrams(strs));


        System.out.println("Optimized Approach ans: "+grpAnagrams.groupAnagramsOptimized(strs));
    }
}