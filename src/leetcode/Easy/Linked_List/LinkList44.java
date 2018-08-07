package leetcode.Easy.Linked_List;

/**
 * Created by tiejin on 8/7/2018.
 */

//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
//        示例：
//
//        输入：1->2->4, 1->3->4
//        输出：1->1->2->3->4->4
public class LinkList44 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null )
            return list1;
        ListNode tmp1 = list1;
        ListNode tmp2 = list2;
        ListNode head = new ListNode(0);//这里不能把返回链表赋值为null，因为下一行马上就要把它赋值给另一链表，得让它在内存里有位置才行
        ListNode headptr = head;
        while(tmp1 != null && tmp2!=null){

            if(tmp1.val <= tmp2.val)
            {
                head.next=tmp1;
                head = head.next;
                tmp1 = tmp1.next;
            }else{
                head.next=tmp2;
                head = head.next;
                tmp2=tmp2.next;
            }

        }
        //其中一个链表已经跑到头之后，继续单链表的合并
        while(tmp1 != null){
            head.next = tmp1;
            head = head.next;
            tmp1= tmp1.next;
        }
        while(tmp2 != null){
            head.next = tmp2;
            head = head.next;
            tmp2= tmp2.next;
        }
        head = headptr.next;
        return head;

    }
}


// 递归

//public class Solution {
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        if(list1==null)
//            return list2;
//        if(list2==null)
//            return list1;
//        ListNode head;
//        ListNode list0= list1.val>list2.val?list2:list1;
//        list0.next = list1.val>list2.val?Merge(list1,list2.next):Merge(list1.next,list2);
//        return list0;
//    }
//}