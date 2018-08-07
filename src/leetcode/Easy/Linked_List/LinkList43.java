package leetcode.Easy.Linked_List;

/**
 * Created by tiejin on 8/7/2018.
 */
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
public class LinkList43 {
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode next=head.next;
        head.next=null;
        ListNode re = reverseList(next);
        next.next=head;
        return re;
    }
}
