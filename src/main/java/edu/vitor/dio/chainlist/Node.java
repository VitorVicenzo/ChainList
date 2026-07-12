package edu.vitor.dio.chainlist;

public class Node<T>{

    private T content;
    private Node<T> nextNode;

    public Node(){
        this.nextNode = null;
    }

    public Node(T content){
        this.nextNode = null;
        this.content = content;
    }

    public Node(T content, Node nextNode){
        this.content = content;
        this.nextNode = nextNode;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }

    public String toStringChain(){
        String str = "Node{" +
                "content=" + content +
                '}';

        if(nextNode != null){
          str += "->" + nextNode.toString();
        }else{
            str += "->null";
        }
        return str;
    }
}
