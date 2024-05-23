import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Fill the under Scores;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		List<String> Ar=new ArrayList<>(n);
		for(int i=0;i<n;i++){
		    Ar.add(sc.next());
		}
		String[] slo=s.split("[^_]+");
		int counter=0;
		for(String sl:slo){
		    int le=sl.length();
		    if(sl.isEmpty()) continue;
		    for(String str:Ar){
		        if(le==str.length()){
		            counter++;
		           Ar.remove(str);
		           break;
		        }
		    }
		}
		//for(int i=0;i<n;i++) System.out.print(Ar[i]+" ");
		
		System.out.print(counter);

	}
}
