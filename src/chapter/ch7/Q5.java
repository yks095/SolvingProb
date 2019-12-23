package chapter.ch7;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int v[]={1,3,5,7,8,2,4,6,7,10};
        mergeway(v, 0, 4, 5, 9); // v의 부분 배열들 v[0..4], v[5..9]이 정렬된 상태임
        System.out.println(Arrays.toString(v));
    }
    private static void mergeway(int[] v, int left1, int right1, int left2, int right2) {

        int i = left1, j = left2, k = 0;
        int[] arr = new int[right2 - left1 + 1];

        while(i <= right1 && j <= right2)	{
            if(v[i] < v[j])
                arr[k++] = v[i++];
            else if(v[i] > v[j])
                arr[k++] = v[j++];
            else if(v[i] == v[j])	{
                arr[k++] = v[i++];
                arr[k++] = v[j++];
            }
        }

        while(i <= right1)
            arr[k++] = v[i++];
        while(j <= right2)
            arr[k++] = v[j++];

        for(int a = 0; a < arr.length; a++)	{
            v[a] = arr[a];
        }

    }
}
