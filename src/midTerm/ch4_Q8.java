package midTerm;

import java.util.StringTokenizer;

public class ch4_Q8 {
    public static void main(String[] args) {
        String e="2018-09-17 17:23:49";
        StringTokenizer stok=new StringTokenizer(e, "- :");
        //StringTokenizer stok=new StringTokenizer(e, "- :", true);
        while (stok.hasMoreTokens()) {
            System.out.println(stok.nextToken());
        }
    }
}
