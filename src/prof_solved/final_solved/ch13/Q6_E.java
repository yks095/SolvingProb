package prof_solved.final_solved.ch13;

public class Q6_E {
    public static void main(String[] args)  {   // 제약이 있고 숫자일때만 사용 가능
        int n[] = {1,2,6,4,3,6,4,8};

        int count[] = new int[101];

        for(int i = 0; i < n.length; i++)   {
            count[n[i]]++;
        }

        int     maxCount=count[0], maxValue=0;

        for (int i = 1; i < count.length; i++) {
            if(count[i]>maxCount){
                maxCount=count[i];
                maxValue=i;
            }
        }
    }
}
