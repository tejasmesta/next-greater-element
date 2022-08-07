class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long ans[] = new long[n];
        
        ans[n-1] = -1;
        
        Stack<Long> st = new Stack<>();
        
        st.push(arr[n-1]);
        
        for(int i=n-2;i>=0;i--)
        {
            if(st.peek()>arr[i])
            {
                ans[i] = st.peek();
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i])
                {
                    st.pop();
                }
                if(st.size()>0)
                {
                    ans[i] = st.peek();
                }
                else{
                    ans[i] = -1;
                }
            }
            st.push(arr[i]);
        }
        
        return ans;
        
    } 
}
