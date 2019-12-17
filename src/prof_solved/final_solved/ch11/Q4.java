//package prof_solved.final_solved.ch11;
//
//public class Q4 {
//    private static void dfs(int[][] adjMat, int V) {
//        boolean visited[]=new boolean[V];
//        for (int i = 0; i < visited.length; i++) {
//            if(visited[i]==false){
//                dfs(adjMat, V, visited, i);
//                System.out.println();
//            }
//        }
//    }
//    private static void dfs(int[][] adjMat, int V, boolean[] visited, int v) {
//        visited[v]=true;
//        System.out.print(v+" ");
//        for (int w = 0; w < V; w++) {
//            if(adjMat[v][w]==1 && visited[w]==false) dfs(adjMat, V, visited, w);
//        }
//    }
//}
