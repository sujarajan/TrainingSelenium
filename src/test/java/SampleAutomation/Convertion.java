package SampleAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Convertion {

	public static void main(String[] args) {

		
//-----------Array to List ----------------//
		
//Primitive		
		int[] j= {1,2,3,4,8};			
		List <Integer> li1=Arrays.asList(ArrayUtils.toObject(j));
		System.out.println(li1);

//String
		String[] a= {"Abb","ccc","eee"};
		List<String> sli=Arrays.asList(a);
		System.out.println(sli);
		
	
//------------list to Array----------------//
		
//Primitive		
	int[] b=ArrayUtils.toPrimitive(li1.toArray(new Integer[li1.size()]));	
	for(int i=0;i<b.length;i++) {
     System.out.print(b[i] + " ");
	}
   System.out.println();
//String
	
  String[] st=sli.toArray(new String[sli.size()]);
  for(int i=0;i<st.length;i++)
  {
  System.out.println(st[i]);
  }

//------------String to int----------------//

  String h="1234";
  int n=Integer.parseInt(h);
  System.out.println(n);
  
//------------String to Integer---------------//

	String h1="1234567";
	Integer i1=Integer.valueOf(h1);
	System.out.println(i1);

//----------int to String-----------------//

  int s1=987654;
  String su=String.valueOf(s1);
  System.out.println(s1);

//----------Integer to String-----------------//
  
  Integer jr=2543646;
  String su1=String.valueOf(jr);
  System.out.println(su1);
  
//----------char to String-----------------//

  char c='w';
  String s =String.valueOf(c);
  
//----------char to String-----------------//
  String g="thi";
  
  for (int i=0;i<g.length();i++) {
	 char cw =g.charAt(i);
	 System.out.print(cw);
  }
  System.out.println();
  
//----------char array to String-----------------//

  char[] yy= {'q','w','r','t'};
  String s2=String.valueOf(yy);
  System.out.println(s2);

//---------String to Char array----------------//
  
  String b8="This is Suja";
  char[] cc=b8.toCharArray();
  
  for(int i=0;i<b8.length();i++) {
	  System.out.print(cc[i]);
  }
  
  

  
  
  

		  
































































}}