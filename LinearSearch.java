import java.util.*;
public class LinearSearch
{
	public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	int []a=new int[5];
	for( int i=0;i<a.length;i++){
	    a[i]=sc.nextInt();
	}
	int s=sc.nextInt();
	for(int i=0;i<a.length;i++){
	    if(a[i]==s){
	        System.out.println(i);
	        System.exit(0);
	    }
	}
	System.out.println("not found");
	}
}