package prof_solved.final_solved.ch11;

import java.util.LinkedList;

public class Q6 {
    private static boolean isFriend(int[] groups, int i, int j) {
        return groups[i]==groups[j];
    }
    private static int[] connected(LinkedList<Integer>[] adjList, int V) {
        int     groups[]=new int[V];
        int     label=1;
        for (int i = 0; i < groups.length; i++) {
            if(groups[i]==0){
                dfs(adjList, V, groups, i, label);
                label++;
            }
        }
        return groups;
    }
    private static void dfs(LinkedList<Integer>[] adjList, int V, int[] groups, int v, int label) {
        groups[v]=label;
        for (Integer w : adjList[v]) {
            if(groups[w]==0) dfs(adjList, V, groups, w, label);
        }
    }
}
