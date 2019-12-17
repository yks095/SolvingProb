//package prof_solved.final_solved.ch7;
//
//public class Q15 {
//    private static void sort(int[] v) {
//        int     min=v[0], max=v[0];
//        for (int i = 1; i < v.length; i++){
//            if(v[i]>max) max=v[i];
//            if(v[i]<min) min=v[i];
//        }
//        int     count[]=new int[max-min+1];
//        for (int i = 0; i < v.length; i++) count[v[i]-min]++;
//        for (int i = 0, k=0; i < count.length; i++) {
//            while(count[i]-->0) v[k++]=i+min;
//        }
//    }
//}
