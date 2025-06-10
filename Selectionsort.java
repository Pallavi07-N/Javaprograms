import java.util.*;
public class BinarySearch
{
	public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	int []a=new int[6];
	for( int i=0;i<a.length;i++){
	    a[i]=sc.nextInt();
	}
	int s=sc.nextInt();
	int i=0;
	int j=a.length-1;
	while(i<j){
	   int  mid=(i+j)/2;
	    if(a[mid]==s){
	        System.out.println(mid);
	        System.exit(0);
	    }
	
	   if((a[mid])<s)i=mid+1;
	   if ((a[mid])>s)j=mid;
	}
	System.out.println("not found");
	}
}