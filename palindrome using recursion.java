public class palindrome using recursion
{    
    public boolean fun(String s,int i,int j)
        {
            if(i==j)
            {
            return true;
            }
           if(s.charAt(i)!=s.charAt(j))
            return false;
            return fun(s,i+1,j-1);
        }
	public static void main(String[] args) {
	    palindrome using recursion m=new palindrome using recursion();
	    String s="121";
	    int i=0;
	    int j=s.length()-1;
	 System.out.println(m.fun(s,i,j));
	}
}