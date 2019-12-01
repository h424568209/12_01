import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main_12_1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String s = scanner.nextLine();
        List<Character> list = new LinkedList<>();
        for(int i =0 ; i < s.length() ; i++){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        String res= "";
        for(int i =0 ; i < list.size() ; i++){
            res+=list.get(i);
        //    System.out.println(list.get(i));
        }
        System.out.println(res);
    }
}
