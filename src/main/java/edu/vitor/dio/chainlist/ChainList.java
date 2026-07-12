package edu.vitor.dio.chainlist;

public class ChainList<T> {

    Node<T> referenceEntry;

    public ChainList(){
        this.referenceEntry = null;
    }

    public void add(T conteudo){
        Node<T> newNode = new Node<>(conteudo);
        if(this.isEmpty()){
            referenceEntry = newNode;
            return;
        }

        Node<T> nodeAuxiliar = referenceEntry;
        for (int i = 0; i < this.size() ; i++) {
            nodeAuxiliar = nodeAuxiliar.getNextNode();
        }

        nodeAuxiliar.setNextNode(newNode);
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
}
