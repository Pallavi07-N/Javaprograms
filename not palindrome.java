
public class Main{
    public static void main(String[] args){
        String str="pallavi";
        String reversed=new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println("palindrome");
            
        }
        else
        {
            System.out.println("not polindrome");
    }    }
}