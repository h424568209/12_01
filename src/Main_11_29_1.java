import java.util.Scanner;

public class Main_11_29_1 {
    //统计每个月兔子的数量 --- 一个小兔子三个月可以每月生一个生宝宝 --起始一个兔子 在N个月后有多少只兔兔
    public static void main(String[] args) {
        //月数
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(rabbit(n));
        }
        sc.close();
    }

    private static int rabbit(int n) {
        if(n<=2) //月份小于等于2只有一个兔子
          return 1;
        else{
            return rabbit(n-1)+rabbit(n-2);
        }
    }
}
