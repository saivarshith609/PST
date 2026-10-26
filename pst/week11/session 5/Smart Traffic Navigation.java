import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph =
                new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        boolean[] visited =
                new boolean[N + 1];

        Queue<Integer> q =
                new LinkedList<>();

        q.add(source);
        visited[source] = true;

        boolean found = false;

        while (!q.isEmpty()) {

            int node = q.poll();

            if (node == destination) {
                found = true;
                break;
            }

            for (int next : graph.get(node)) {

                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}