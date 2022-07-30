

public class ShapePattern {

	public static void main(String[] args) {
	
		//3.WAP TO PRINT 			
		int n=15;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0  || j==0 || i==n-1 || j==n-1 || i+j <= (n-1)/2 || j-i  >= (n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			
			System.out.print("             ");
	//4.WAP TO PRINT 		
			for(int j=0; j<n; j++) {
				if( j==0 && i==n-1/2  || j==n-1 && i==n-1/2 || i-j >=(n-1)/2 || i+j >= n-1 + n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			
			System.out.print("          ");
			
			
	//5.
			for(int j=0; j<n; j++) {
				if(i==0  || j==0 || i==n-1  || i+j <= (n-1)/2 || i-j >= (n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			

	}

}
}
