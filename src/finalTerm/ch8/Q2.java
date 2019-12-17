package finalTerm.ch8;

import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {
        int v[]= {2,3,6,8,9};
        Arrays.sort(v); // 배열 정렬
        int key=8;
        int index=binarySearch(v, key, 0, v.length - 1); // 정렬된 배열 내 자료 위치 이진 탐색
        if(index<0) System.out.println("배열 내 자료 없음");
        else System.out.println("자료 발견 위치(배열 내 index): "+index);
    }

    private static int binarySearch(int[] v, int key, int left, int right) {
        if(left>right) return -1;
        int     m=(left+right)/2;
        if(key==v[m]) return m;
        if(key<v[m]) return binarySearch(v, key, left, m-1);        // m을 검사하니깐 m-1, m+1만 사용하면 됨
        else return binarySearch(v, key, m+1, right);
    }
}

