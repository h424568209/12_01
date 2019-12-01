import java.util.Scanner;

public class Main_11_29_2 {
    //最难的问题
    //输入包括多组数据，每组数据一行，为收到的密文。
    //密文仅有空格和大写字母组成
    //对应每一组数据，输出解密后的明文。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String value = sc.nextLine();
            char[] chars = value.toCharArray();
            for(int i = 0 ; i < chars.length ;i++){
                char c = chars[i];
                if('A'<=c){
                    c = (char) ('E'>c?(c-5):(c+21));
                    chars[i] = c;
                }
            }
            System.out.println(new String(chars));
        }
    }
}
