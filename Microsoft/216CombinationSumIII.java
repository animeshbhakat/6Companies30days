class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> answer = new ArrayList<>();
        combination(1, answer, new ArrayList<Integer>(), k, n);
        return answer;
    }

    public void combination(int start, List<List<Integer>> answer, List<Integer> comb, int k, int n){
        if(comb.size() == k && n == 0){
            answer.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i = start; i<=9; i++){
            comb.add(i);
            combination(i+1, answer, comb, k, n-i);
            comb.remove(comb.size()-1);
        }
    }    
}
