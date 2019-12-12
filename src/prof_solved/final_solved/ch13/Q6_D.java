//package prof_solved.final_solved.ch13;
//
//import java.util.TreeMap;
//
//public class Q6_D {
//    public static void main(String[] args)  {
//        int n[] = {1,3,4,6,7,5,3,6,9};
//
//        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
//        for(int i = 0; i < n.length; i++)   {
//            if(hashTable.containsKey(n[i]))
//                hashTable.put(n[i], hashTable.get(n[i] + 1));
//            else
//                hashTable.put(n[i], 1);
//        }
//
//        int maxValue = n[0], maxCount = 0;
//        for(int key : hashTable.keySet())   {
//            int count = hashTable.get(key);
//            if(count > maxCount)    {
//                maxCount = count;
//                maxValue = key;
//            }
//        }
//    }
//}
//
