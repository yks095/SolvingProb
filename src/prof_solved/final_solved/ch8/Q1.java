//package prof_solved.final_solved.ch8;
//
//public class Q1 {
//
//    private static int search(int[] v, int key) {
//        for (int i = 0; i < v.length; i++) if(v[i]==key) return i;
//        return -1;
//    }
//    private static int search(int[] v, int key) {
//        int     lastValue=v[v.length-1];
//        v[v.length-1]=key;
//        int     i=0;
//        while(v[i]!=key) i++;
//        v[v.length-1]=lastValue;
//        if(i<v.length-1) return i;
//        if(key==lastValue) return v.length-1;
//        return -1;
//    }
//}
