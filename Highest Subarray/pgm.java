import java.util.*;
public class Kadanesalg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements in an array: ");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int max_so_far = Integer.MIN_VALUE, max_end = 0;
		for(int j=0;j<a.length;j++) {
			max_end = max_end + a[j];
			if(max_so_far < max_end) {
				max_so_far = max_end;
			}
			if(max_end < 0) {
				max_end = 0;
			}
		}
		System.out.println("Higest Subarray= " +max_so_far);
	}

}
