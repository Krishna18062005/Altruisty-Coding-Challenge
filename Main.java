import java.util.*;

public class Main {
    public static void main(String[] args) {// first program Altruisty
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++) arr[i]=sc.nextInt();
      int maxpr=0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          maxpr=Math.max(maxpr,arr[j]-arr[i]);
        }
      }
      System.out.println(maxpr);
  }
}
