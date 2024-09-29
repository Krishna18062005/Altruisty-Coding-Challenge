import java.util.*;

public class Third {
    public static void main(String[] args) {// 3rd problem
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++) arr[i]=sc.nextInt();
      
      ArrayList<Integer> KsizeMin=new ArrayList<>();
      int[] sub=new int[x];
      for(int i=0;i<x;i++){
        sub[i]=arr[i];
      }
      KsizeMin.add(min(sub)); //add min element in min ArrayList 
      
      for(int i=x;i<n;i++){
        sub[0]=arr[i];
        KsizeMin.add(min(sub));
      }
      int max=KsizeMin.get(0);
      for(int i:KsizeMin) max=Math.max(i,max);
      
      
      System.out.println(max);
  }
  public static int  min(int[] arr){
    int mine=arr[0];
    for(int i: arr) mine=Math.min(i,mine);
    return mine;
  }
}
