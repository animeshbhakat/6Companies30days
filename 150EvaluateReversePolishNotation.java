class Solution {
    public int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer> st = new Stack<Integer>();
        for(String s : tokens){
            if(s.equals("+")){
                a = st.pop();
                b = st.pop();
                st.add(a + b);
            }
            else if(s.equals("-")){
                a = st.pop();
                b = st.pop();
                st.add(b - a);
            }
            else if(s.equals("*")){
                a = st.pop();
                b = st.pop();
                st.add(a * b);
            }
            else if(s.equals("/")){
                a = st.pop();
                b = st.pop();
                st.add(b / a);
            }
            else {
                st.add(Integer.parseInt(s));
            }
            
        }
        return st.pop();
    }
}
