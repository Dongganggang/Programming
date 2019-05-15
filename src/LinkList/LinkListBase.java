package LinkList;

public class LinkListBase {
    public static void addNode(LinkListNode head, LinkListNode node, LinkListNode newnode){
        LinkListNode curr = head;
        while(curr != null){
            if(curr == node){
                if(node.next == null){
                    node.next = newnode;
                }else{
                    LinkListNode temp = node.next;
                    node.next = newnode;
                    newnode.next = temp;
                }
            }
            curr = curr.next;
        }
    }

    public static LinkListNode delNode(LinkListNode head, LinkListNode del){
        LinkListNode curr = head;
        if(curr == null || del == null)
            return null;
        //del first node
        if(curr == del){
            if (curr.next == null)
                curr = null;
            else
                curr = curr.next;

        }else{
            //del medium node
            LinkListNode pre = head;
            curr = head.next;
            while (curr != null ){
                if(curr == del){
                    curr =curr.next;
                    pre.next = curr;
                    break;
                }
                pre = pre.next;
                curr = curr.next;
            }
            if (curr == null)
                return null;
        }
        return curr;
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
        LinkListNode node1 = new LinkListNode(1);
        LinkListNode node2 = new LinkListNode(2);
        LinkListNode node3 = new LinkListNode(3);
        LinkListNode node4 = new LinkListNode(4);
        LinkListNode addnode = new LinkListNode(9);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        printList(node1);
        System.out.println("after add node 9:");
        addNode(node1,node3,addnode);
        printList(node1);
        System.out.println("after delete node 3:");
        delNode(node1, node3);
        printList(node1);

    }
}
