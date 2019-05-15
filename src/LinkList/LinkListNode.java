package LinkList;

public class LinkListNode {
    public int value;
    public LinkListNode next;

    LinkListNode(int value){
        this.value  = value;
        next = null;
    }

    public int getValue(){
        return value;

    }

    public void setValue(int value){
        this.value = value;
    }

    public LinkListNode getNext(){
        return next;
    }

    public void setNext(LinkListNode next){
        this.next = next;
    }
}
