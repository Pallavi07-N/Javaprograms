public class Main{
    public static void main(String[] args){
        String str= "open AI";
        String reversed =" ";
        for(int i=str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        System.out.println("reversed String:"+ reversed);
    }
}