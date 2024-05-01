import java.util.*;
public class Leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the items in an array: ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int b = 0;
		String res = "";
		ArrayList<String> sol = new ArrayList<>();
		int s[];
		for(int j=n-1;j>=0;j--) {
				if(a[j]> b) {
					res = String.valueOf(a[j]);
					sol.add(res);
					b = a[j];
				}
		}
		System.out.println(sol);
	}

}
