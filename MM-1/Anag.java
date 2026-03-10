import java.util.*;

public class Anag {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int[] a1=new int[26];
        int[] a2=new int[26];
        for(int i=0;i<s1.length();i++){
            a1[s1.charAt(i)-'a']+=1;
            a2[s2.charAt(i)-'a']+=1;
        }
        boolean ch=false;
        for(int i=0;i<26;i++){
        if(a1[i]!=a2[i]){
        ch=!ch;
            break;
        }
        
           
        
    }
    if(ch){
        System.out.println(false);
    }
    else{
        System.out.println(true);
    }

 }   
}
