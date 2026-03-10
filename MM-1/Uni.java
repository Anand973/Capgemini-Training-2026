import java.util.HashSet;
import java.util.Scanner;

public class Uni {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s.add(a[i]);

        }
        int[] r=new int[n];
        int id=0;
        for(int  e:s){
            r[id++]=e;

        }
     System.out.println(r.toString());
    }
}
