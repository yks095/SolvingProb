package quiz;

public class Q1 {
    public static void main(String[] args)  {

        long v[] = {34, 76, 11, 3, 7, 13, 9};

        long distance;
        long min = Math.abs(v[0] - v[1]);

        for(int i = 0; i < v.length; i++)   {
            for(int j = i + 1; j < v.length; j++)   {
                distance = Math.abs(v[j] - v[i]);

                if(distance <= min)
                    min = distance;
            }
        }

        System.out.println(min);
    }
}
