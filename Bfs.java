import java.util.LinkedList;
import java.util.Queue;

class Bfs{

    static class pair{

        int first, second;

        public pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    

    public static void bfs(int[][] matrix, boolean[][] visited, int r, int c){

        int row = matrix.length, column = matrix[0].length;

        Queue<pair> queue = new LinkedList<>();
        queue.add(new pair(r,c));
        visited[r][c] = true;
        int direction[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            pair curr = queue.poll();
            int x = curr.first;
            int y = curr.second;

            System.out.println(matrix[x][y]+" ");

            for(int i=0;i<4;i++){
                int adjx = x + direction[i][0];
                int adjy = y + direction[i][1];

                if(adjx < 0 || adjx >= row || adjy < 0 || adjy >= column || visited[adjx][adjy] == true ) continue;
                queue.add(new pair(adjx, adjy));
                visited[adjx][adjy] = true;
            }


        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
       };
       boolean[][] visited = new boolean[matrix.length][matrix[0].length];
       bfs(matrix, visited, 0, 0);
    }
}