import java.util.*;

public class Miss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int id=0;
       Arrays.sort(a);
       for(int i=1;i<=n;i++){
        if(a[i-1]!=i){
            id=i;
            break;
        }
       }
        System.out.println(id);
       

    }
}
