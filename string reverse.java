public class Main{
 public static void main (String[] args){
 String Str="Open AI";
 String reversed=" ";
 for (int i=Str.length()-1; i>=0; i--){
 reversed += Str.charAt(i);
 }
 System.out.println("Reversed String:"+reversed);
 }
 }