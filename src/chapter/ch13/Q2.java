package chapter.ch13;

import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        SimpleChainHashTable ht=new SimpleChainHashTable(1000);
        ht.put("Korea");
        ht.put("Japan");
        System.out.println(ht.get("Korea"));
        System.out.println(ht.get("Japan"));
        System.out.println(ht.get("China"));
    }
}

class SimpleChainHashTable {
    private int HashTableSize;
    LinkedList<Object> hashTable[];
    public SimpleChainHashTable(int size) {
        HashTableSize=size;
        hashTable=new LinkedList[HashTableSize];
        for (int i = 0; i < hashTable.length; i++) hashTable[i]=new LinkedList<>();
    }
    public boolean put(Object key) {
        if(get(key)!=null) return false;
        hashTable[hash(key)].add(key);
        return true;
    }
    private int hash(Object key) {
        return (key.hashCode()&0x7FFFFFFF)%HashTableSize;
    }
    public Object get(Object key) {
        for (Object v : hashTable[hash(key)]) if(v.equals(key)) return v;
        return null;
    }
}