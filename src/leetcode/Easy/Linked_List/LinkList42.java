package leetcode.Easy.Linked_List;

/**
 * Created by tiejin on 8/7/2018.
 */

//删除链表的倒数第N个节点
//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
//
//        示例：
//
//        给定一个链表: 1->2->3->4->5, 和 n = 2.
//
//        当删除了倒数第二个节点后，链表变为 1->2->3->5.
//        说明：
//
//        给定的 n 保证是有效的。
//
//        进阶：
//
//        你能尝试使用一趟扫描实现吗？

    //https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/42/
public class LinkList42 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p = head;
        ListNode q = head;
        if(p.next==null){
            head=null;
            return head;
        }
        if(n==1){
            while(p.next.next!=null){
                p=p.next;
            }
            p.next=null;
            return head;
        }else{
            for(int i = 0;i<n-1;i++){
                p=p.next;
            }
            if(p==null){
                head=head.next;
                return head;
            }
            while(p.next!=null){
                p=p.next;
                q=q.next;
            }
            ListNode next = q.next;
            q.next = next.next;
            q.val=next.val;
            return head;
        }

    }
}
