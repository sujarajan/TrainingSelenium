package SampleAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Samplepro {

	public static void main(String[] args) {
		
		
//Reverse a string
		String s1="Suja Vishnu";
		String s2 ="";
		int l=s1.length()-1;
		for(int i=l;i>=0;i--) {
        s2+=s1.charAt(i);

		}
		System.out.println(s2);
		
// Swap 2 numbers
		int a=10 , b=3;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		
//Check if vowel is present
		String s3="  This is string to check aa vowels occurence count for a every vowel  ";
		char[] c=s3.toCharArray();
		
		HashMap <Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char i:c) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
		    else
			    map.put(i, 1);
			}
		for (Map.Entry<Character, Integer> i:map.entrySet()) {
			
			if(i.getKey().equals('a')||i.getKey().equals('e')||i.getKey().equals('i')||i.getKey().equals('o')||i.getKey().equals('u'))
			{
				System.out.println(i.getKey()+" Occurance is "+i.getValue());
			}
		}
//Prime Number check		
		boolean value=isPrime(11);
		if(value) {
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");
		
//list contains only odd
		List <Integer> lis=new ArrayList<Integer>();
		int count=0;
		int[] arr= {1,2,3,5,7,9,10,11,13};
	for(int i=0;i<arr.length;i++) {
		lis.addAll(Arrays.asList(arr[i]) );	
	}
		System.out.println(lis);
   for(Integer in:lis) {
	   if(in%2!=0) 
		count++;
   }
   System.out.println("total odd numbers are "+ count);
		
		
//remove spaces
   System.out.println(s3.trim());
   System.out.println(s3.strip());
		
//Array sorting
   int[] ar= {200,11,2,3,555,6,1,0};
   int temp=0;
   for(int i=0;i<ar.length;i++) {
	   for(int j=i+1;j<ar.length;j++) {
		   if(ar[i]>ar[j]) {
			  temp=ar[i];
			  ar[i]=ar[j];
			  ar[j]=temp;
		   }
	   }
   }
   for(int i=0;i<ar.length;i++) {
   System.out.println(ar[i]);
   }	
//print pyramid
   int n=4;
   for (int i=0; i<n; i++)
   {
       for (int j=n-i; j>1; j--)
       {
           System.out.print(" ");
       }
       for (int j=0; j<=i; j++ )
       {
           System.out.print("* ");
       }
       System.out.println();
   }

//Array have same elements
   
   int[] ar1= {1,2,3};
   int[] ar2= {0,1,100,2,3,4};
   if(Arrays.equals(ar1, ar2)) {
	   System.out.println("Yes");
   }
   else
   System.out.println("No");
   
//sum of elements in array
   int sum1=0;
   int sum2=0;
   for(int i=0;i<ar1.length;i++) {
	   sum1+=ar1[i];
   }
   for(int i=0;i<ar2.length;i++) {
	   sum2+=ar2[i];
   }	
   sum2+=sum1;
   System.out.println(sum2);
   
//2nd largest number in array
   Arrays.sort(ar2);
   System.out.println(ar2[ar2.length-2]);
   System.out.println("---------");
   
//String reverse and preserve space
   
   String np="This is Vishnu";

  
   StringBuffer sb= new StringBuffer(np);
   sb.reverse();
   
   for(int i=0 ; i<np.length(); i++){
   if(np.charAt(i)== ' '){
      sb.insert(i, " ");
   }
}
//sb.append("");
System.out.println(sb);

//Last digit and 1st digit
		int number=502356998;
	while(number!=0)	{
		int i = number%10;
		System.out.println(i);
		number/=10;
	}
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}

	private static boolean isPrime(int n) {
		if(n==0||n==1)
			return false;
		if(n==2)
			return true;
		for (int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		
		return true;
		
	}}
