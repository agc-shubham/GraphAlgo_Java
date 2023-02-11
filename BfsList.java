import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsList{

    public static void bfs(List<List<Integer>> graph, boolean[] visited, List<Integer> list, int v ){

         Queue<Integer> queue = new LinkedList<Integer>();
         queue.add(v);
         visited[v] = true;
         while(!queue.isEmpty()){
            int front = queue.poll();
            list.add(front);
            List<Integer> adj = graph.get(front);
            for(Integer i : adj){
                if(visited[i]) continue;
                queue.add(i);
                visited[i] = true;
            }
         }
    }
    
    public static void main(String[] args) {

        List<List<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>(){{add(1); add(3);}});
        graph.add(new ArrayList<>(){{add(0); add(2); add(4);}});
        graph.add(new ArrayList<>(){{add(1); add(5);}});
        graph.add(new ArrayList<>(){{add(0); add(6);}});
        graph.add(new ArrayList<>(){{add(1); add(7);}});
        graph.add(new ArrayList<>(){{add(2); add(8);}});
        graph.add(new ArrayList<>(){{add(3); add(7);}});
        graph.add(new ArrayList<>(){{add(4); add(6); add(8);}});
        graph.add(new ArrayList<>(){{add(5); add(7);}});

        boolean[] visited = new boolean[graph.size()];
        List<Integer> list = new ArrayList<>();
        bfs(graph, visited, list, 0);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}