package com.coderising.array;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		int[] a =new int[]{7, 9 , 30, 3} ;
		ArrayUtil array = new ArrayUtil();
//	 	array.reverseArray(a);
//	 	for( int b:a)
//	 	{System.out.println(b);}
//	 	  int[] oldArr= new int[]{1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
//	 int[] newArr=	array.removeZero(oldArr);
//	 for (int arr:newArr)
//	 {
//		 System.out.println(arr);
//	 }
	 
//	 System.out.println(array.join(a,"-"));
	
//	 for (int arr:array.fibonacci(100))
//		 {
//		 System.out.println(arr);
//		 }
		int[] a =new int[]{3, 5, 7, 10}  ;
		int[] b =new int[]{10, 11, 12,13} ;
		for (int arr:array.merge(a, b))
			 {
			 System.out.println(arr);
			 }
	}
	
		

}
