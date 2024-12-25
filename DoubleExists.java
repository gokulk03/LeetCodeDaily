import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DoubleExists {
    public static void main(String[] args) {
        DoubleExists doubleExists = new DoubleExists();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean result = doubleExists.checkIfExist(arr);
        System.out.println("Result: "+result);
    }
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<map.size();i++){
            if(map.containsKey(2*arr[i]) && i!=map.get(2*arr[i])){
                return true;
            }
        }
        return false;
    }
}
