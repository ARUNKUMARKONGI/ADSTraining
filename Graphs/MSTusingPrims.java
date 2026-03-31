import java.util.*;
public class MSTusingPrims {

    static class Pair {
        int v, w;
        Pair(int a, int b) {
            v=a; w=b;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int tc=1; tc<=t; tc++) {

            int n=sc.nextInt();
            int m=sc.nextInt();

            List<List<Pair>> g=new ArrayList<>();
            for(int i=0;i<=n;i++) g.add(new ArrayList<>());

            for(int i=0;i<m;i++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int w=sc.nextInt();
                g.get(a).add(new Pair(b,w));
                g.get(b).add(new Pair(a,w));
            }

            boolean[] vis=new boolean[n+1];
            PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)->x.w-y.w);
            pq.add(new Pair(1,0));

            int total=0;
            int cnt=0;

            while(!pq.isEmpty()) {
                Pair p=pq.poll();
                int node=p.v;
                int wt=p.w;

                if(vis[node]) continue;

                vis[node]=true;
                total+=wt;
                cnt++;

                for(Pair nxt : g.get(node)) {
                    if(!vis[nxt.v]) pq.add(new Pair(nxt.v,nxt.w));
                }
            }

            System.out.println("Case #"+tc+":");
            if(cnt!=n) System.out.println(-1);
            else System.out.println(total);
        }
    }
}
