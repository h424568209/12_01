import java.util.Scanner;

public class Main_12_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int a = scanner.nextInt();
            int []arr= new int[num];
            for(int i =0 ; i < num ; i++){
                arr[i] = scanner.nextInt();
            }
            for(int i = 0 ; i <num   ; i++){
                if(a>=arr[i]){
                    a+=arr[i];
                }else {
                    int t = Divisor(arr[i],a);
                    a+=t;
                }
            }
            System.out.println(a);
        }
    }

    private static int Divisor(int b, int a) {
        int temp;
        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        while(b!=0){
            temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}
