package leetcode.Easy.Linked_List;
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class LinkList41
{

//    请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
//
//    现有一个链表 -- head = [4,5,1,9]，它可以表示为:
//
//        4 -> 5 -> 1 -> 9
//    示例 1:
//
//    输入: head = [4,5,1,9], node = 5
//    输出: [4,1,9]
//    解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
//    示例 2:
//
//    输入: head = [4,5,1,9], node = 1
//    输出: [4,5,9]
//    解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
//    说明:
//
//    链表至少包含两个节点。
//    链表中所有节点的值都是唯一的。
//    给定的节点为非末尾节点并且一定是链表中的一个有效节点。
//    不要从你的函数中返回任何结果。
    private static void deleteNode(ListNode node, int x) {
        ListNode p = node;
        ListNode q = p.next;
        while(q!=null){
            if(q.val==x){
                p.next=q.next;
                q=q.next;
            }
            p=q;
            q=q.next;
        }
    }
    public static void main(String[] args){
        // TODO Auto-generated method stub
        int[] a = {1,2,3,4,5,6,7,8};
        int len = a.length;
        LinkList41 test = new LinkList41();
        ListNode head = new ListNode(0);
        ListNode q =head;
        for(int i=0;i<a.length;i++){
            ListNode p = new ListNode(a[i]);
            q.next = p;
            q = p;
        }
        deleteNode(head,2);
        deleteNode(head,7);
        ListNode p=head.next;
        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }

}

//if (node == null || node.next == null) {
//        return;
//        }
//
//        ListNode next = node.next;
//        node.next = next.next;
//        node.val = next.val;

