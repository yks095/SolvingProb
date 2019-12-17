package prof_solved.final_solved.ch13;

import java.util.HashMap;

public class Q6_C {                         // O(n)
    public static void main(String[] args)  {
        int n[] = {1,3,4,6,7,5,3,6,9};

        HashMap<Integer, Integer> hashTable = new HashMap<Integer, Integer>();
        for(int i = 0; i < n.length; i++)   {
            hashTable.put(n[i], hashTable.containsKey(n[i])? hashTable.get(n[i])+1 : 1);
        }

        int maxValue = n[0], maxCount = 0;
        for(int key : hashTable.keySet())   {
            if(hashTable.get(key)>maxCount) {
                maxCount=hashTable.get(key);
                maxValue=key;
            }
        }
    }
}
