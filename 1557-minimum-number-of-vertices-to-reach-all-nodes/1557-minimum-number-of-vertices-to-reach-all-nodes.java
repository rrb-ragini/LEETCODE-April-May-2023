class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] indegree = new boolean[n]; 
        
        for(int i = 0; i < edges.size(); i++)
            indegree[edges.get(i).get(1)] = true;
        List<Integer>ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            if(indegree[i]==false) ans.add(i);
        return ans;
    }
}