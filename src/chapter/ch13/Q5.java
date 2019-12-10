package chapter.ch13;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Q5 {
    public static void main(String[] args) {
        int n=1000000;
        String keys[]=new String[n];
        for (int i = 0; i < n; i++) keys[i]=genKeys();
        long start;
        start=System.currentTimeMillis();
        TreeSet<String> treeSet=new TreeSet<>();
        for (int i = 0; i < n; i++) treeSet.add(keys[i]);
        System.out.println("BST "+(System.currentTimeMillis()-start)/1000.+" sec.");
        start=System.currentTimeMillis();
//SimpleChainHashTable st=new SimpleChainHashTable(1);
        SimpleChainHashTable st=new SimpleChainHashTable(n);
        for (int i = 0; i < n; i++) st.put(keys[i]);
        System.out.println("Hash "+(System.currentTimeMillis()-start)/1000.+" sec.");

        start=System.currentTimeMillis();
        HashSet<String> ht = new HashSet<String>();
        for(int i = 0; i < n; i++)  {
            ht.add(keys[i]);
        }
        System.out.println("HashSet "+(System.currentTimeMillis()-start)/1000.+" sec.");
    }
    private static String genKeys() {
        Random random=new Random();
        int len=random.nextInt(10)+5;
        String s="";
        for (int j = 0; j < len; j++) s+=(char)(random.nextInt('z'-'a')+'a');
        return s;
    }
}
