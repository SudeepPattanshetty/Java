import java.util.*;
public class Majorityvoting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number of items: ");
	     int n = sc.nextInt();
	     int a[]= new int[n];
	     System.out.println("Enter the items in an array: ");
	     for(int i=0; i<n; i++) {
	       a[i] = sc.nextInt();
	     }
	     System.out.println("Enter the key element: ");
	     int k = sc.nextInt();
	     int res = n/k;
	     
	     int[] fr = new int[a.length];
	     int visited = -1;
	     for(int i=0;i<a.length;i++) {
	    	 int count = 1;
	    	 for(int j=i+1;j<a.length;j++) {
	    		 if(a[i] == a[j]) {
	    			 count++;
		    		 fr[j] = visited;
	    		 }
	    	 }
	    	 if(fr[i] != visited) {
	    		 fr[i] = count;
	    	 }
	     }
	     
	     for(int i=0;i<fr.length;i++) {
	    	 if(fr[i]!=visited) {
	    		 if(fr[i]> res) {
	    			 System.out.println("Freq "+a[i] +" -> "+fr[i] );
	    		 }
	    	 }
	     }
	}
}
