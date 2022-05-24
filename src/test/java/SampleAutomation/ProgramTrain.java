package SampleAutomation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomStringUtils;

public class ProgramTrain {

	public static void main(String[] args) throws IOException   {
	
		
//Reverse a String
		String s1="This is Suja";
		StringBuilder sb=new StringBuilder(s1);
		System.out.println(sb.reverse());
		
//1st non repeated letter in String
		String s2="This is Tsuja";
	String s3=s2.toUpperCase();
		for(char c : s3.toCharArray()) {
			if(s3.indexOf(c)==s3.lastIndexOf(c))
			{
			System.out.println("Occurance is 1 for "+ c);
			break;
			}
		}
		
//Intersection of 2 arrays
		int[] ar= {1,4,6,8,2,6};
		int[] ar1= {2,6,5,0,9,1,3};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar1.length;j++) {
				if(ar[i]==ar1[j])
				{
					set.add(ar[i]);
			}
		}
		}
			System.out.println(set);
		
//String have unique characters
			
		String s4="Unique";
		Set <Character> set1=new LinkedHashSet<Character>();
		for(int i=0;i<s4.length();i++) {
			set1.add(s4.charAt(i));
		}
		
		if(s4.length()==set1.size()) {
			System.out.println("All Characters are Unique");
		}
		
		else
			System.out.println("String have duplicate characters");
		

//Count number of words in the String
		String s5="There are four no of words   ";
		String[] sar=s5.split(" ");
		System.out.println(sar.length);
		
//Remove all white spaces in String
		System.out.println(s5.replace(" ", ""));
		
//String Anagram
		String s7="AiJth y d";
		String s6="AYjIht ";
		
		char[] car1=s7.toUpperCase().toCharArray();
		char [] car2=s6.toUpperCase().toCharArray();
		Arrays.sort(car1);
		Arrays.sort(car2);
	
		if(Arrays.equals(car1, car2))
		{
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");
		
//Factorial
		int n=5;
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);
		
//printing patterns
		int rows=5;
		for(int i=0;i<rows;i++) {
			for(int j=1;j<=i+1;j++ )
			{
			System.out.print(j+ " ");
		}
		System.out.println();
		
		}
		for(int i=rows;i>=0;i--) {
			for(int j=1;j<=i+1;j++)
			{
			System.out.print(j+ " ");
		}
		System.out.println();
		
		}
		
		System.out.println("-----------------------------------");
//Printing Pattern two
		
		int row=5;
		int k=1;
		for(int i=0;i<row;i++) {
			for(int j=1;j<=i+1;j++ )
			{
			System.out.print(k+ " ");
			
		}
			k++;
		System.out.println();
		
		}
		
		System.out.println("-----------------------------------");
		
//Pattern #3
		
		for(int i=0;i<rows;i++) {
			for(int j=rows;j>i;j--)
			{
			System.out.print(j+ " ");
		}
		System.out.println();
		
		}
			
		System.out.println("-----------------------------------");
		
//Pattern #4
		 
		
		for(int i=0;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++)
			{
			System.out.print(j+ " ");
		}
		System.out.println();
		
		}
			
	System.out.println("-----------------------------------");
		
//Pattern #5		
		for(int i=0;i<rows;i++) {
			for(int j=rows-i;j>=1;j--)
			{
			System.out.print(j+ " ");
		}
		System.out.println();
		
		}
			
		System.out.println("-----------------------------------");

		
//square root in Java
		int n1=1600;
		System.out.println(Math.sqrt(n1));
		
		System.out.println("-----------------------------------");
		

		
//Check if String can form Palindrome
		
		String w="abab";
		char[] c=w.toCharArray();
		int even=0;
		int odd=0;
		HashMap <Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char i:c) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
		    else
			    map.put(i, 1);
			}
		
		System.out.println(map);
		Set <Integer> se=new TreeSet<Integer>();
		
			for(Map.Entry<Character, Integer> m: map.entrySet()) {
				se.add(m.getValue());	
		}
			System.out.println(se);
		 if(w.length()%2==0) {
			 
			 for(Integer in: se) {
				 if(in%2!=0) {
					 even++;
				 }
			 } 
			 if(even>0) {
				 System.out.println("Even : String is Not Palindrome");
			 }
			 else
				 System.out.println("Even : String is Palindrome");
		
		 }
		
		if(w.length()%2!=0) {
			
		
			 for(Integer in: se) {
				 if(in%2!=0) {
					 odd++;
				 }
		}
			 if(odd==1) {
				 System.out.println("Odd: String is  Palindrome");
			 }
			 else
				 System.out.println("Odd: String is Not Palindrome");
			 
			 
			 
		}
		
//MIn value and Max value of the Data Type		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

//converted signed integer to String
		int u=-123;
		String y=String.valueOf(u);
		System.out.println(y);
		
//Array programs
		int[] arr= {2,4,7,1,2,3,6};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 4));
		
//Sort map for Key map can be converted to TreeMap
		Map <Integer,String> l1=new LinkedHashMap<Integer,String>();
		
		l1.put(4,"Suja");
		l1.put(3,"Visnu");
		l1.put(9,"Gowri");
		l1.put(1,"Rajil");
		
		System.out.println(l1);
		
		Map <Integer,String> l2=new TreeMap<Integer,String>(l1);
		
		System.out.println(l2);
		
//Sort map based on value		
		List <Entry <Integer,String>> l3=new ArrayList<Entry<Integer,String>>(l2.entrySet());
		
		Collections.sort(l3, new Comparator<Map.Entry<Integer,String>>(){

			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
			
		});
		
		for(Map.Entry<Integer, String> m:l3) {
			System.out.println(m.getKey() + "-"+m.getValue());
		}

//Reverse Array list
		int[] iar= {2,5,4,6};
		List<Integer> l4 =Arrays.asList(ArrayUtils.toObject(iar));	
		Collections.reverse(l4);
		System.out.println(l4);
		
//Print Random numbers		
	System.out.println(RandomStringUtils.randomNumeric(10));
	
	Random rn=new Random();
	
	System.out.println(rn.nextInt(10000));	
		
//Reverse words in the String
	
	String g="Welcome to Java";

	String[] e=g.split(" ");

	StringBuilder bu=new StringBuilder();
	for(int i=e.length-1;i>=0;i--) {
		
		for(int j=e[i].length()-1;j>=0;j--) {
			
			bu.append(e[i].charAt(j));
		}
		
		bu.append(" ");
		
	}
	System.out.println(bu);
	
//Sort in Reverse order
	
	List<Integer> al=new ArrayList<Integer>();
	al.add(1);
	al.add(3);
	al.add(90);
	al.add(0);
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	
	
//Array to TreeSet
	
	int[] fa= {9,3,4,6,1};
	
	List <Integer> iN=Arrays.asList(ArrayUtils.toObject(fa));
	
	Set<Integer> sed=new TreeSet<Integer>(iN);
	
	System.out.println(sed);
	
int[] fb=ArrayUtils.toPrimitive(sed.toArray(new Integer[sed.size()]));
	
	for(int i:fb)
	{
		System.out.print(i+" ");
	}

	//All permutations of the String
			String str1="ABC";
			int r=str1.length()-1;
			permute(str1,0,r);
			System.out.println("-----------------------------------");
}	
		
public static void permute(String str,int l,int r) {
	
	if(l==r) {
		System.out.println(str);
	}
	else
	{
		for(int i=l;i<=r;i++) {
			str=swap(str,l,i);
			permute(str,l+1,r);
			str=swap(str,l,i);
			}}
	
	
}
		
public static  String swap(String str,int i, int j) {
	char temp;
	char[] c=str.toCharArray();
    temp=c[i];
    c[i]=c[j];
    c[j]=temp;
    
	return String.valueOf(c);
	
}























}
