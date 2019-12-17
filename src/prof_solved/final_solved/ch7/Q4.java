//package prof_solved.final_solved.ch7;
//
//public class Q4 {
//    private static int[] mergeArray(int[] n, int[] m) {
//        int     v[]=new int[n.length+m.length];
//        int     i=0, j=0, k=0;
//        while(i<n.length && j<m.length) v[k++]=(n[i]<m[j])? n[i++] : m[j++];
//        while(i<n.length) v[k++]=n[i++];
//        while(j<m.length) v[k++]=m[j++];
//        return v;
//    }
//}
