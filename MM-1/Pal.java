import java.util.*;
public class Pal {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String[] a=s1.split("\\s+");
        int c=0;
        for(int i=0;i<a.length;i++){
            String s=a[i];
            if(isPal(s,0,s.length()-1)){
                 c++;
            }

        }
        System.out.println(c);
    }
    public static  boolean isPal(String s,int st , int ed){
         while(st<ed){
            if(s.charAt(st)!=s.charAt(ed)){
                return false;
            }
            st++;
            ed--;
         }
         return true;
    }
}
