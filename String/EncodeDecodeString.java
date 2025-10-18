package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecodeString {
    
     public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for(String str : strs){
            encodedStr.append(str.length());
            encodedStr.append('#');
            encodedStr.append(str);
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrList = new ArrayList<>();
        int counter = 0;
        while(counter<str.length()){
            int j = counter;
            while(str.charAt(j)!='#'){
                j++;
            }
            Integer strLength = Integer.parseInt(str.substring(counter, j));
            j++;
            decodedStrList.add(str.substring(j, j+strLength));
            counter = j+strLength;
        }
        return decodedStrList;
    }

    public static void main(String[] args) {
        
    List<String> inputStr = new ArrayList<>(Arrays.asList("neet", "code", "love", "you"));
    EncodeDecodeString encodeDecodeString = new EncodeDecodeString();
    String encodedString = encodeDecodeString.encode(inputStr);
    List<String> decodedStrList= encodeDecodeString.decode(encodedString);
    System.out.println("Decoded String: "+decodedStrList.toString());

    }

}
