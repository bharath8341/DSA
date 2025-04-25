class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        nn.next=head;
        head=nn;
        size++;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
        }else{
            Node nn=new Node(val);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        int c=1;
        Node nn=new Node(val);
        Node temp=head;
        while(c<index){
            temp=temp.next;
            c++;
        }
        Node next=temp.next;
        temp.next=nn;
        nn.next=next;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size) return;
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        int c=1;
        while(c<index){
            temp=temp.next;
            c++;
        }
        temp.next=temp.next.next;
        size--;
        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
