class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        int answer = 0;
        
        for(int i = 0; i<n; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j =0; j<n; j++){
                if( i == j){
                    continue;
                }
                int distance = ((points[i][0] - points[j][0]) * (points[i][0] - points[j][0])) + ((points[i][1] - points[j][1]) * (points[i][1] - points[j][1]));
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }
            for(int val : map.values()){
                answer += val*(val-1);
            }
        }
        return answer;
    }
}
