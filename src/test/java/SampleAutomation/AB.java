package SampleAutomation;

import java.util.Arrays;
import java.util.Scanner;

public class AB{

public static void main(String[] args)
{


int[] a= {1,5,2,4,3,5,7,0,2,0,4,0,0,7};

//Array Length
System.out.println(a.length);

//get array of values
//int[] b =new int[4]; 
//System.out.println("Enter " + b.length+" values");
//Scanner s=new Scanner(System.in);
//for(int i=0;i<b.length;i++) {
//	b[i]=s.nextInt();
//}
//
//for(int i=0;i<b.length;i++) {
//System.out.print(b[i]+" ");	
//}


// array from method
 int[] c=arr(a);
System.out.println(Arrays.toString(c));

//2D Array Print
int[][] d= {{1,2,3},{3,6},{6,9,0,8}};

for(int i=0;i<d.length;i++) {
	for(int j=0;j<d[i].length;j++) {
		System.out.print(d[i][j]+" ");
	}
	System.out.println();
}

for(int[] i:d) {
	for(int j:i) {
		System.out.print(j);
	}
	System.out.println();
}

//Average of array in Java

int[] e= {4,0,2,0,7};
int sum = 0;
for(int i:e) {
	sum+=i;
}
System.out.println(sum%e.length);


	int[] f=Arrays.copyOfRange(e, 0, e.length);
	
	System.out.println(Arrays.toString(f));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

public static int[] arr(int[] val) {
	return val;
}







}
