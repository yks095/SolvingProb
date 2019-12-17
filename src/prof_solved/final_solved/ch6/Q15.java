//package prof_solved.final_solved.ch6;
//
//public class Q15 {
//    private static void dfs(char[][] ground, int R, int C, int i, int j) {
//        ground[i][j]='0';
//        for (int dr = -1; dr <=1; dr++) {
//            for (int dc = -1; dc <=1; dc++) {
//                int     r=i+dr, c=j+dc;
//                if(r>=0 && r<R && c>=0 && c<C && ground[r][c]=='1') dfs(ground, R, C, r, c);
//            }
//        }
//    }
//}
