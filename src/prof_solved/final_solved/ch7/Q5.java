//package prof_solved.final_solved.ch7;
//
//public class Q5 {
//    private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
//        int     w[]=new int[right1-left1+1+right2-left2+1];
//        int     i=left1, j=left2, k=0;
//        while(i<=right1 && j<=right2) w[k++]=(v[i]<v[j])? v[i++] : v[j++];
//        while(i<=right1) w[k++]=v[i++];
//        while(j<=right2) w[k++]=v[j++];
//        for(k=0, i=left1; i<=right1; ) v[i++]=w[k++];
//        for(j=left2; j<=right2; ) v[j++]=w[k++];
//    }
//}
