package finalTerm.ch11;

public class Q4 {
    public static void main(String[] args) {
        int V=8;
        String input="0 1 0 3 1 2 3 2 3 4 2 5 4 5 6 7"; // 무방향 간선으로 해석
        int adjMat[][]=new int[V][V];
        String s[]=input.split("\\s+");
        for (int i = 0; i < s.length; i+=2){
            int v1=Integer.parseInt(s[i]);
            int v2=Integer.parseInt(s[i+1]);
            adjMat[v1][v2]=1;
            adjMat[v2][v1]=1;
        }
        connected(adjMat, V);
    }
    private static void connected(int[][] adjMat, int V) {
        boolean[] visited = new boolean[V];

        for(int i = 0; i < visited.length; i++) {
            if(visited[i] == false)    {
                dfs(adjMat, V, visited, i);
                System.out.println();
            }
        }
    }
    private static void dfs(int[][] adjMat, int V, boolean[] visited, int v) {
        visited[v]=true;
        System.out.print(v+" ");
        for (int w = 0; w < V; w++) {
            if(adjMat[v][w]==1 && visited[w]==false)    // 조건문 확인!
                dfs(adjMat, V, visited, w);
        }
    }
}

