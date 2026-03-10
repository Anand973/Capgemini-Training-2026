import java.util.*;

public class Ocur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] a=new int[26];
        int mx=0;
        for(int i=0;i<s.length();i++){
         int v=s.charAt(i)-'a';
            a[v]+=1;
            mx=Math.max(mx,a[v]);
        }
        boolean ch=false;
        int c=0;
        for(int i=0;i<26;i++){
            if(a[i]==mx){
                if(c==0){ c++; continue;}
                else ch=!ch; break;
            }
        }
        if(ch){
            System.out.println(0);
        }
        else{
            System.out.println(mx);
        }

    }
}
