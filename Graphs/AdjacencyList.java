import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {

        int n = 3, m = 3;
        ArrayList <ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(2);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);

        for(int i=1; i<n; i++){
            for(int j=0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
        
    }

    // [1 2] [1 3] [2 4] [3 4] [2 5] [4 5]
    // ArrayList allocation like: 
    // 1 -> {2, 3} | 2 -> {1, 4, 5} | 3 -> {1, 4} | 4 -> {2, 3, 5} | 5 -> {2, 4}
    // Space complexity: O(2M) M-edges
}
