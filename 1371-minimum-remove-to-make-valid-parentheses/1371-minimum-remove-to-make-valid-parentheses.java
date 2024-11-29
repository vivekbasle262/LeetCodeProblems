class Solution {
    public String minRemoveToMakeValid(String s) {
        List<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== '(')
            {
                st.push(i);
            }
            if(s.charAt(i)==')')
            {
                if(st.isEmpty())
            {
                list.add(i);
            }
            else
            {
                st.pop();
            }
            }
        }
          while(!st.isEmpty())
    {
        int index = st.pop();
        list.add(index);
    }
            String ans="";
            for(int j=0;j<s.length();j++)
            {
                if(!list.contains(j))
                {
                    ans+=s.charAt(j);
                }
            }
            System.out.println(ans);
            return ans;
        
    }
}