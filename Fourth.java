import java.util.*;

public class Fourth {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      char[] arr=new char[n];
      for(int i=0;i<n;i++) arr[i]=sc.next().charAt(0);
      HashMap<Character,Integer> map=new HashMap<>();
      for(char i : arr){
        if(map.containsKey(i)){
          map.put(i,map.get(i)+1);
        }
        else{
          map.put(i,1);
        }
      }
      
      int max=0;
      for(char i: arr){
        int fre=map.get(i);
        if(fre%2==1){
          if(max<fre){
            max=fre;
          }
        }
      }
      if(max==0){
        System.out.print("All are even");
      }
      else{
      char maxBall=arr[0];
      for(char i:arr){
        if(map.get(i)==max){
          maxBall=i;
          break;
        }
      }
      System.out.println(maxBall);
      }
      
  }
  
}
