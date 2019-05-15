package LinkList;

//实现求链表的中间结点
//快结点：一次走两步 慢结点：一次走一步
//奇数：快结点走到最后一个结点终止
//偶数：慢结点走到倒数第二个结点终止，慢结点得到的是中间偏左的结点，若再走两个快结点就为null，慢结点得到的是中间偏右的结点
public class MediumNode {

    public static LinkListNode findMedium(LinkListNode head){

        LinkListNode fast = head;
        LinkListNode slow = head;
        if(head == null){
            return  null;
        }
        //奇数 && 偶数
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        LinkListNode n1_1 = new LinkListNode(1);
        LinkListNode n1_2 = new LinkListNode(3);
        LinkListNode n1_3 = new LinkListNode(4);
        LinkListNode n1_4 = new LinkListNode(6);
        LinkListNode n1_5 = new LinkListNode(9);

        n1_1.next = n1_2;
        n1_2.next = n1_3;
        n1_3.next = n1_4;
        n1_4.next = n1_5;

        LinkListNode n2_1 = new LinkListNode(2);
        LinkListNode n2_2 = new LinkListNode(3);
        LinkListNode n2_3 = new LinkListNode(8);
        LinkListNode n2_4 = new LinkListNode(10);

        n2_1.next = n2_2;
        n2_2.next = n2_3;
        n2_3.next = n2_4;
        System.out.println(findMedium(n1_1).value);
        System.out.println(findMedium(n2_1).value);

    }
}
