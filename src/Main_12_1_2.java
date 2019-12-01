import java.util.List;

public class Main_12_1_2 {
  static    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
         if(list1 == null)
             return list2;
         if(list2 == null)
             return list1;
        ListNode res= null;
        ListNode last = res;
        ListNode cur1=  list1;
        ListNode cur2=  list2;
        while(cur1!=null && cur2!=null ){
            if(cur1.val > cur2.val){
                if(res == null ){
                    res = cur2;
                    cur2 = cur2.next;
                }else{
                    last.next = cur2;
                }
                last = cur2;
                cur2 = cur2.next;
            }else{
                if(res == null){
                    res = cur1;

                }else{
                    last.next = cur1;


                }
                last = cur1;
                cur1 = cur1.next;
            }
        }


//        while(cur1 != null){
//
//            last.next =cur1;
//            cur1 = cur1.next;
//            last = last.next;
//        }
//        while(cur2 != null){
//
//            last = cur2;
//            cur2 = cur2.next;
//            last = last.next;
//        }

        if(cur1 == null){
            last.next= cur2;
        }
        if(cur2==null){
            last.next = cur1;
        }
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
        return res;


//        int count1 = 0;
//       while(cur1!=null){
//           cur1 = cur1.next;
//           count1++;
//       }
//       int count2 =0;
//       while(cur2!=null){
//           cur2 = cur2.next;
//           count2++;
//       }
//       ListNode t1  = null;
//       ListNode t2 = null;
//       if(count1 < count2){
//           t1= list2;
//           t2 = list1;
//       }else{
//           t1 = list1;
//           t2 = list2;
//       }
//       int sub = Math.abs(count1 - count2);
//
//       int j = 0;
//       while(j<sub){
//           last.next = new ListNode(t1.val);
//           t1 = t1.next;
//           last = last.next;
//           j++;
//       }
//
//       while(t1!=null && t2!=null){
//           last.next = new ListNode(t1.val+t2.val);
//           last = last.next;
//           t1 = t1.next ;
//           t2 = t2.next;
//       }
//       ListNode a = res.next;
//       while(a!=null){
//           System.out.println(a.val);
//           a = a.next;
//       }
//       return res.next;
    }

    public static void main(String[] args) {
        Main_12_1_2 m = new Main_12_1_2();
        ListNode head1 = new ListNode(-1);
        ListNode p1 = new ListNode(0);
        ListNode p2 = new ListNode(1);
        ListNode p3 = new ListNode(3);

        ListNode head2 = new ListNode(4);
        ListNode q1 = new ListNode(6);
        ListNode q2 = new ListNode(12);
       ListNode q3 = new ListNode(13);
        head1.next = p1;
        p1.next = p2;
        p2.next = p3;
       p3.next = null;

        head2.next = q1;
        q1.next = q2;
        q2.next = q3;
        q3.next = null;
        m.Merge(head1,head2);
    }
}
