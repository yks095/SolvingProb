package chapter.ch8;

import java.util.Random;

public class Q1_C {     // 순차 탐색의 시간을 절반으로 줄임
    public static void main(String[] args) {
        int v[]=new int[1000000];
        Random random=new Random();
        for (int i = 0; i < v.length; i++) v[i]=random.nextInt(1000000);
        int key=1234;
        System.out.println(search(v, key));
    }
    private static int search(int[] v, int key) {

        int i = 0;
        int lastVal = v[v.length - 1];
        v[v.length - 1] = key;

        while(v[i] != key)
            i++;

        v[v.length - 1] = lastVal;  // 마지막 값 복원

        if(i < v.length - 1)
            return i;

        if(i == v.length - 1)  {
            if(key == lastVal)
                return v.length - 1;
        }

        return -1;

    }
}
