package midTerm;

public class ch1_Q6 {
    public static void main(String[] args)  {
        int n = 987654321;
        int k = 4;

        for(int i = 1; i < k; i++)	{
            n /= 10;
        }


        System.out.println(n % 10);

    }
}
