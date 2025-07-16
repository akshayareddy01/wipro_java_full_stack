 import java.util.Scanner;
 public  class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int flag=0;
        int i=0;
        for(i=0;i<(l/2);i++){
            char c=s.charAt(i);
        if(s.charAt(i)!=s.charAt(l-1-i)){
          flag=1;
        }
    }
           if(flag==0){
            System.out.println("Is Palindrome");
           }
           else{
            System.out.println("Is Not a Palindrome");
           }
        
    }
 }
