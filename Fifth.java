import java.util.*;

public class Fifth {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int[] arr=new int[9];
      for(int i=0;i<9;i++) arr[i]=sc.nextInt();
      
      int t1,t2,t3;
      t1=t2=t3=0;
      for(int i=0;i<9;i+=3){
        t1+=arr[i];
        t2+=arr[i+1];
        t3+=arr[i+2];
      }
      t1=(int)t1/3;
      t2=(int)t2/3;
      t3=(int)t3/3;
      int no=3;
      int max=Math.max(t1,Math.max(t2,t3));
      
      if(max<70){
        System.out.print("All trainees are unfit");
      }
      else if(max==t1&&max==t2&&max==t3){
        System.out.println("Trainee Number : 1");
        System.out.println("Trainee Number : 2");
        System.out.println("Trainee Number : 3");
      }
      else if(t1==t2){
        System.out.println("Trainee Number : 1");
        System.out.println("Trainee Number : 2");
      }
      else if(t2==t3){
        System.out.println("Trainee Number : 2");
        System.out.println("Trainee Number : 3");
      }
       else if(t1==t3){
        System.out.println("Trainee Number : 1");
        System.out.println("Trainee Number : 3");
      }
      else{
        if(max==t1){
          no=1;
        }
        else if(max==t2){
          no=2;
      }
      System.out.println("Trainee Number : "+no);
      }
  }
  
}
