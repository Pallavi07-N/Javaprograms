public class Main{
 public static void main (String[] args){
 String Str="madam";
 String reversed=new StringBuilder(Str).reverse().toString();
 if(Str.equals(reversed)){
     System.out.println("palindrome");
 }else{
     System.out.println("not palindrome");
 }
 }
 }