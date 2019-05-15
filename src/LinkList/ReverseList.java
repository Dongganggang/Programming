package LinkList;

public class ReverseList {
    public static LinkListNode revLinkList(LinkListNode n1){

        if(n1 == null)
            return null;

        LinkListNode preNode = null;
        LinkListNode curNode = n1;
        LinkListNode nextNode = null;

        while(curNode != null){
            nextNode = curNode.next;
            curNode.next = preNode;
            if(nextNode == null){
                return curNode;
            }
            preNode = curNode;
            curNode = nextNode;
        }
        return curNode;//返回最后一个结点，即反转后的表头
    }



    public static void printList(LinkListNode head){
        while(null != head){
            System.out.println(head.getValue() + "->");
            head = head.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkListNode node1 = new LinkListNode(1);
        LinkListNode node2 = new LinkListNode(2);
        LinkListNode node3 = new LinkListNode(3);
        LinkListNode node4 = new LinkListNode(4);
        LinkListNode node5 = new LinkListNode(5);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        printList(node1);
        System.out.println("After reverse:");
        printList(revLinkList(node1));
    }

}
