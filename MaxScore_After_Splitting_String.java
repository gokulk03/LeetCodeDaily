import java.util.Scanner;


public class MaxScore_After_Splitting_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        
        System.out.println(maxScore(st));
    }

    public static int maxScore(String s){
        int score_zero = 0;
        int score_one = 0;
        int max_score = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                score_one++;
            }
        }

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                score_one--;
            }else{
                score_zero++;
            }
            max_score = Math.max(max_score,score_one+score_zero);

        }
        return max_score;
    }
}
