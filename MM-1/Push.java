import java.util.Scanner;

public class Push {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] a=new int[n];
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     int in=0;
     for(int i=0;i<n;i++){
        if(a[i]!=0){
            a[in]=a[i];
            in++;
        }


     }
     while(in<n){
        a[in]=0;
        in++;
     }

     for(int e:a){
        System.out.print(e+" ");
     }

 }   
}
