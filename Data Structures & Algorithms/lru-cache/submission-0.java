public class Node{
    int index;
    int val;
    Node next;
    Node prev;
}
class LRUCache {
    int capacity;
    Node head;
    Node tail;
    Map<Integer,Node> map = new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.prev = head;
    }
    public void delete(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    public void insert(Node node){
        Node nextNode = head.next;
        node.next = nextNode;
        nextNode.prev = node;
        node.prev = head;
        head.next = node;
    }
    public int get(int key) {
        if(!map.containsKey(key))return -1;
        Node node = map.get(key);
        delete(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            delete(map.get(key));
            map.remove(key);
        }
        if(map.size()==capacity){
            Node n = tail.prev;
            delete(n);
            map.remove(n.index);
        }
        Node node = new Node();
        node.val = value;
        node.index = key;
        insert(node);
        map.put(key,node);
    }
}
