import java.util.*;

public class treeset {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			ts.add(sc.next());
		}
        
		System.out.println(ts);
        sc.close();

	}

}
