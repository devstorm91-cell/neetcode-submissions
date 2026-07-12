class Solution {
    private int top;
    private char[] arr;

    public Solution(){
        arr=new char[1001];
        top=-1;
    }
    public boolean isValid(String s) {
        for (char elem : s.toCharArray()) {
            if (elem=='{'||elem=='('||elem=='['){
                top++;
                arr[top] = elem;
            }
            else{
                if (top == -1) return false;
                if(elem=='}'&& arr[top]=='{'){
                    top--;
                }
                else if(elem==')'&& arr[top]=='('){
                    top--;
                }
                else if(elem==']'&& arr[top]=='['){
                    top--;
                }
                else{
                    return false;
                }
            }
        }
        return top == -1;
    }
}