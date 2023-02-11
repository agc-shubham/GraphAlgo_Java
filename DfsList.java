import java.util.ArrayList;
import java.util.List;


public class DfsList{

    public static void dfs(List<List<Integer>> graph, boolean[] visited, List<Integer> list, int v ){

        list.add(v);
        visited[v] = true;
        List<Integer> adj = graph.get(v);

        for (Integer integer : adj) {
            if(visited[integer]) continue;
            dfs(graph, visited, list, integer);
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
        dfs(graph, visited, list, 0);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}