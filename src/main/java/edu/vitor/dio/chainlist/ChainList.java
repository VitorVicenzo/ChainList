package edu.vitor.dio.chainlist;

public class ChainList<T> {

    Node<T> referenceEntry;

    public ChainList(){
        this.referenceEntry = null;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);
        if(this.isEmpty()){
            referenceEntry = newNode;
            return;
        }

        Node<T> nodeAuxiliar = referenceEntry;
        for (int i = 0; i < this.size()-1 ; i++) {
            nodeAuxiliar = nodeAuxiliar.getNextNode();
        }

        nodeAuxiliar.setNextNode(newNode);
    }

    private Node<T> getNode(int index){

        indexValidation(index);
        Node<T> nodeAuxiliar = referenceEntry;
        Node<T> returnNode = null;
        for (int i = 0; i <= index; i++) {
            returnNode = nodeAuxiliar;
            nodeAuxiliar = nodeAuxiliar.getNextNode();
        }
        return returnNode;
    }

    public T get(int index){
        return getNode(index).getContent();
    }

    private void indexValidation(int index){
        if (index >= size()){
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index + " desta lista. Esta lista só vai até o indice " + lastIndex + ".");
        }
    }

    public T remove(int index){
        Node<T> nodePivot = this.getNode(index);
        if (index == 0){
            referenceEntry = nodePivot.getNextNode();
            return nodePivot.getContent();
        }

        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(nodePivot.getNextNode());
        return nodePivot.getContent();
    }

    public int size(){
        int tamanhoLista = 0;
        Node<T> referenceAux = referenceEntry;
        while (true){
            if(referenceAux != null){
                tamanhoLista++;
                if(referenceAux.getNextNode() != null){
                    referenceAux = referenceAux.getNextNode();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenceEntry == null ? true:false;
    }

    @Override
    public String toString() {
        String returnString = "";
        Node<T> nodeAuxiliar = referenceEntry;
        for (int i = 0; i < this.size() ; i++) {
            returnString += "Node{" +
                    "content=" + nodeAuxiliar.getContent() +
                    "---->}";
            nodeAuxiliar = nodeAuxiliar.getNextNode();
        }
        returnString += "null";
        return returnString;
    }
}
