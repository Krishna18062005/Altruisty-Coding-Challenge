import java.util.*;

public class Second {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int sts=sc.nextInt();
      int[] starr=new int[sts];
      for(int i=0;i<sts;i++){
        starr[i]=sc.nextInt();
      }
      int eds=sc.nextInt();
      int[] eda=new int[eds];
      for(int i=0;i<eds;i++){
        eda[i]=sc.nextInt();
      }
      for(int i=0;i<eds;i++){
        System.out.print(solve(s,starr[i],eda[i])+" ");
      }
      
  }
  public static int solve(String s,int i,int j){
    int c=0;
    while(s.charAt(i-1)!='|'){
      i++;
    }
    while(s.charAt(j-1)!='|'){
      j--;
    }
    if(i<j){
      for(int k=i-1;k<j;k++){
        if(s.charAt(k)=='*') c++;
      }
    }
    return c;
  } 
  
}
