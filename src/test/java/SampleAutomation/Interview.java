package SampleAutomation;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class Interview {

	public static void main(String[] args) {
		
//Date format		
		Date date=new Date();
		
		SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
		String s=formatter.format(date);
		System.out.println(s);
 
//pair with maximum product
		int[] ar= {10, 9, 3, 6, 7, 90} ;
		
		int a= ar[0], b=ar[1];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++) 
			{
				if(ar[i]*ar[j]>a*b) {
					a=ar[i];
					b=ar[j];
				}
			}
		}
		
		System.out.println(a+" "+b+ " "+ a*b);	
		
//check if string is substring of another string		

		String s1 = "men";
		 String s2 = "womemmen";

		 int t;
			int M=s1.length();
			int N=s2.length();
			for(int i=0;i<=N-M;i++)
			{
				for(t=0;t<M;t++) 
					if(s2.charAt(i+t)!=s1.charAt(t))
						break;
				if(t==M)
				System.out.println("Present at "+ i);
			}
			
//Closest Palindrome		
		closestpalindrome(121);
		
//find if array have duplicates
		
			int[] ary= {1,1,4,5,7,8,2,1,4};
	List<Integer> list=Arrays.asList(ArrayUtils.toObject(ary));
	Set<Integer> set=new LinkedHashSet<Integer>(list);
	System.out.println(ary.length+" "+set.size());
	if(ary.length==set.size())
	{
		System.out.println("No Duplicates");
	}
	else
		System.out.println("Duplicates are Present");

//1st and final occurrence of a number
	
	
	int[] li = {1,2,3,4,5,5,7,8,5};
	int h=5;
	List<Integer> lis=new ArrayList<Integer>();
	int f=0;
	for(int i=0;i<li.length;i++) {
			if(li[i]==5) {
			lis.add(i);
			System.out.println(f +" "+ i);
			f++;
			}
		}
	System.out.println(lis);
	
	System.out.println("Firts occurance of 5 "+ lis.get(0));
	
	System.out.println("Firts occurance of 5 "+ lis.get(lis.size()-1) );
	
//1st non repeated character in String
	String ss="qasadsmsmdw";
	int ct=0;
	char[] ca=ss.toCharArray();
	Map <Character,Integer> map=new LinkedHashMap<Character,Integer>();
	
	for(Character c:ca) {
		if(map.containsKey(c))
			map.put(c, map.get(c)+1);
		else
			map.put(c, 1);
	}
	
	System.out.println(map);
	
	for(Map.Entry<Character, Integer> m:map.entrySet())
	{
		if(m.getValue()==1)
		{
			ct++;
			if(ct==1) {
				System.out.println("First non dup chracter is "+ m.getKey());
			}
			
		}
	}
	
	if(ct==0)
		System.out.println("All chracters are duplicated");
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
	
	
	
	public static void closestpalindrome(int n) {
		
		int Lnum=n-1;
		while(isPalindrome(String.valueOf(Lnum))==false) {
			Lnum--;
		}
		
		int Rnum=n+1;
		while(isPalindrome(String.valueOf(Rnum))==false) {
			Rnum++;
		}
		
		if(Math.abs(n-Rnum)<Math.abs(n-Lnum)){
			System.out.println(Rnum);
		}
		else
			System.out.println(Lnum);
	
	}
	
	
	public static boolean isPalindrome(String y) {
		char[] x = y.toCharArray();
		String d = "";
		for(int i=x.length-1;i>=0;i--) {
			d+=String.valueOf(x[i]);
		}
		if(d.equals(y)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

