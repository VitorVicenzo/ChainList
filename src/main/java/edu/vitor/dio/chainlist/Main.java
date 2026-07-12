package edu.vitor.dio.chainlist;

public class Main {
    public static void main(String[] args){

        ChainList<String> myChainList = new ChainList<>();

        myChainList.add("teste1");
        myChainList.add("teste2");
        myChainList.add("teste3");
        myChainList.add("teste4");

        System.out.println(myChainList.get(0));

        System.out.println(myChainList.remove(3));
        System.out.println(myChainList);
    }
}
