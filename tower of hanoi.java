public class tower of hanoi
{    
    public void fun(String s,String h,String d,int n)
        {
            if(n==1)
            {
           System.out.println("move" +n+ "from" +s+ "to"+d);
           return;
        }
        fun(s,d,h,n-1);
        System.out.println("move" +n+ "from" +s+ "to"+d);
        fun(h,s,d,n-1);
        }
	public static void main(String[] args) {
	    tower of hanoi m=new tower of hanoi();
	    int n=10;
	    int c=0;
	    m.fun("source","helper","destinatio",n);
	}
}