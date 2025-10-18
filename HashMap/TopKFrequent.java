package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> intFrequencyMap = new HashMap<>();
        for(int num : nums){
            intFrequencyMap.put(num, intFrequencyMap.getOrDefault(num,0)+1);
        }

       Map<Integer, Integer> sortFrequencyMap = intFrequencyMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(k).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, NewValue) -> oldValue, LinkedHashMap::new));

       int[] answer = sortFrequencyMap.keySet().stream().mapToInt(Integer::intValue).toArray();
       return answer;
    }


    public static void main(String[] args) {
        TopKFrequent kFrequent = new TopKFrequent();
        int[] nums = {1,2,2,3,3,3};
        System.out.println("Answer: "+Arrays.toString(kFrequent.topKFrequent(nums, 2)));

        System.out.println("Answer Optimized: "+Arrays.toString(kFrequent.topKFrequentOptimize(nums, 2)));
    }


    public int[] topKFrequentOptimize(int[] nums, int k){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for(int key : frequencyMap.keySet()){
            int value = frequencyMap.get(key);
            if(bucket[value] == null){
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        }

        int[] res = new int[k];
        int counter = 0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(Integer val : bucket[i]){
                    if(counter==k){
                        break;
                    }
                    res[counter++] = val;
                }
            
            }
        }
        return res;
    }
    
}
