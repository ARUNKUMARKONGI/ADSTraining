package Graphs;

import java.util.*;
public class MaximumPathSum {
    static int max_sum;
    static void dfs(int node, int dest, int sum, Map<Integer,List<int[]>> g, boolean[] vis) {
        if(node==dest) {
            if(sum>max_sum) max_sum=sum;
        }
        vis[node]=true;
        if(g.containsKey(node)) {
            for(int[] nxt : g.get(node)) {
                int v=nxt[0];
                int w=nxt[1];
                if(!vis[v]) dfs(v,dest,sum+w,g,vis);
            }
        }
        vis[node]=false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int s=sc.nextInt();
            int d=sc.nextInt();
            Map<Integer,List<int[]>> g=new HashMap<>();
            List<int[]> edges=new ArrayList<>();
            while(sc.hasNextInt()) {
                int u=sc.nextInt();
                int v=sc.nextInt();
                int w=sc.nextInt();
                edges.add(new int[]{u,v,w});
                if(!sc.hasNextLine()) break;
                sc.nextLine();
                if(sc.hasNextInt()==false) break;
            }
            for(int[] e:edges) {
                g.putIfAbsent(e[0],new ArrayList<>());
                g.putIfAbsent(e[1],new ArrayList<>());
                g.get(e[0]).add(new int[]{e[1],e[2]});
                g.get(e[1]).add(new int[]{e[0],e[2]});
            }
            max_sum=-1;
            boolean[] vis=new boolean[100005];
            dfs(s,d,0,g,vis);
            System.out.println(max_sum);
        }
    }
}

