package LinkList;

public class MergeLinkList {
    public static LinkListNode mergeTwoList(LinkListNode n1, LinkListNode n2){
        if(n1 == null) return n2;
        if(n2 == null) return n1;

        LinkListNode temp;
        if(n1.value < n2.value){
            temp = n1;
            temp.next = mergeTwoList(n1.next, n2);
        }else{
            temp = n2;
            temp.next = mergeTwoList(n1, n2.next);
        }

        return temp;

    }

    public static void printList(LinkListNode head){
        LinkListNode cur = head;
        while(cur != null){
            System.out.println(cur.value);
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkListNode n1_1 = new LinkListNode(1);
        LinkListNode n1_2 = new LinkListNode(3);
        LinkListNode n1_3 = new LinkListNode(4);
        LinkListNode n1_4 = new LinkListNode(6);
        LinkListNode n1_5 = new LinkListNode(9);
        LinkListNode n1_6 = new LinkListNode(12);

        n1_1.next = n1_2;
        n1_2.next = n1_3;
        n1_3.next = n1_4;
        n1_4.next = n1_5;
        n1_5.next = n1_6;

        LinkListNode n2_1 = new LinkListNode(2);
        LinkListNode n2_2 = new LinkListNode(3);
        LinkListNode n2_3 = new LinkListNode(8);
        LinkListNode n2_4 = new LinkListNode(10);

        n2_1.next = n2_2;
        n2_2.next = n2_3;
        n2_3.next = n2_4;

        LinkListNode newList = mergeTwoList(n1_1, n2_1);
        printList(newList);




    }
}
