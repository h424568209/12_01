import java.util.Arrays;
import java.util.Scanner;

public class Main_12_1_2_2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        while(scanner.hasNext()){
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int []arr= new int[N];
            for(int i =0 ; i < N ; i++){
                arr[i] = scanner.nextInt();
            }
            while(M>0){
                M--;
                String s = scanner.next();
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int max = 0;
                if(s.equals("Q")){
                    int end=  Math.max(num1,num2);
                    int start = Math.min(num1,num2)-1;
                    for(int i = start ; i< end ; i++){
                        if(max < arr[i]){
                            max = arr[i];
                        }
                    }
                    System.out.println(max);
                }
                if(s.equals("U")){
                    arr[num1-1] = num2;
                }
            }
        }
    }
}
