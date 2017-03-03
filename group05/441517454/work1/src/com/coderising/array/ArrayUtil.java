package com.coderising.array;
import com.coding.basic.*;
public class ArrayUtil {
	
	/**
	 * 给定一个整形数组a , 对该数组的值进行置换
		例如： a = [7, 9 , 30, 3]  ,   置换后为 [3, 30, 9,7]
		如果     a = [7, 9, 30, 3, 4] , 置换后为 [4,3, 30 , 9,7]
	 * @param origin
	 * @return
	 */
	public void reverseArray(int[] origin){
		int temp;
		int n =origin.length;
		int i,j = n-1,m = (n-1)/2;
		for(i = 0; i <= m; i++)
		 {
		  j = n-1-i;
		  temp = origin[i];
		  origin[i] = origin[j];
		  origin[j] = temp;
		  }
	}
	
	/**
	 * 现在有如下的一个数组：   int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}   
	 * 要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：   
	 * {1,3,4,5,6,6,5,4,7,6,7,5}  
	 * @param oldArray
	 * @return
	 */
	
	public int[] removeZero(int[] oldArray){
		int[] array = new int[oldArray.length];
		int j=0;
		for (int i=0;i<oldArray.length;i++)
			{
				if(!(oldArray[i]==0))
				{
					array[j] =oldArray[i];
					j++;
				}
			
			 
			}	
		int[] newArray = new int[j];
		for(int i=0;i<j;i++)
			{
				newArray[i]=array[i];
			}
	
		return newArray;
	}
	
	/**
	 * 给定两个已经排序好的整形数组， a1和a2 ,  创建一个新的数组a3, 使得a3 包含a1和a2 的所有元素， 并且仍然是有序的
	 * 例如 a1 = [3, 5, 7,8]   a2 = [4, 5, 6,7]    则 a3 为[3,4,5,6,7,8]    , 注意： 已经消除了重复
	 * @param array1
	 * @param array2
	 * @return
	 */
	
	public int[] merge(int[] array1, int[] array2){
		ArrayList arr = new ArrayList();
		int i=0,j=0;
		while(i<array1.length&&j<array2.length)
		{
			if(array1[i]<array2[j])
			{
				arr.add(array1[i++]);
			}else if(array1[i]>array2[j])
			{
				arr.add(array2[j++]);
			}else{
				arr.add(array2[j++]);
				i++;
				}
		}
		if(i==array1.length)
		{
			while(j<array2.length)
				arr.add(array2[j++]);	
		}else
		{
			while(i<array1.length)
				arr.add(array1[j++]);
		}
		int[] merge = new  int[arr.size()];
		for (int m=0; m<arr.size();m++)
		{
			merge[m]=(int)arr.get(m);
		}
			return merge;
		
	
	}
	/**
	 * 把一个已经存满数据的数组 oldArray的容量进行扩展， 扩展后的新数据大小为oldArray.length + size
	 * 注意，老数组的元素在新数组中需要保持
	 * 例如 oldArray = [2,3,6] , size = 3,则返回的新数组为
	 * [2,3,6,0,0,0]
	 * @param oldArray
	 * @param size
	 * @return
	 */
	public int[] grow(int [] oldArray,  int size){
		int[] newArray = new int[oldArray.length+size]; 
		 for (int i=0;i<oldArray.length;i++)
		 {
			 newArray[i]=oldArray[i];
		 }
		
		return newArray;
	}
	
	/**
	 * 斐波那契数列为：1，1，2，3，5，8，13，21......  ，给定一个最大值， 返回小于该值的数列
	 * 例如， max = 15 , 则返回的数组应该为 [1，1，2，3，5，8，13]
	 * max = 1, 则返回空数组 []
	 * @param max
	 * @return
	 */
	public int[] fibonacci(int max){
		ArrayList arr = new ArrayList();
		int f1=1,f2=1,f3;
		boolean flag = true;
		while(flag){
			f3=f1+f2;
			f1=f2;
			f2=f3;
			if (f2<max)
			{
				arr.add(f2);
			}
			else
			{
				arr.add(0, 1);
				arr.add(1, 1);
				flag = false;	
			}
		}
		int[] fibonacci = new  int[arr.size()];
		for (int m=0; m<arr.size();m++)
		{
			fibonacci[m]=(int)arr.get(m);
		}
			return fibonacci;
	}
	
	/**
	 * 返回小于给定最大值max的所有素数数组
	 * 例如max = 23, 返回的数组为[2,3,5,7,11,13,17,19]
	 * @param max
	 * @return
	 */
	public int[] getPrimes(int max){
		ArrayList arr = new ArrayList();
		int mod,i,j,count=0; 
		for(i=2;i<=max;i++)        
	    {
	        mod=(int)Math.sqrt(i); 
	            for(j=2;j<=mod;j++)    
	              if(i%j==0)
	                 count++;
	        if(count==0)
	            arr.add(i);
	        count=0;
	    }
		int[] getPrimes = new  int[arr.size()];
		for (int m=0; m<arr.size();m++)
		{
			getPrimes[m]=(int)arr.get(m);
		}
			return getPrimes;
	}
	
	/**
	 * 所谓“完数”， 是指这个数恰好等于它的因子之和，例如6=1+2+3
	 * 给定一个最大值max， 返回一个数组， 数组中是小于max 的所有完数
	 * @param max
	 * @return
	 */
	public int[] getPerfectNumbers(int max){
		ArrayList arr = new ArrayList();
		for(int i=1;i<=max;i++)	  
		  {   
		 int k=0;   
		  for(int j=1;j<i;j++)
			  {   
			  if(i%j==0)   
			  k+=j;   
			  }   
		  if(i==k)
		  	{  
			  arr.add(i);
		  	}
		  }
		int[] perfectNumbers = new  int[arr.size()];
	for (int j=0; j<arr.size();j++)
	{
		perfectNumbers[j]=(int)arr.get(j);
	}
		return perfectNumbers;
	}
	
	/**
	 * 用seperator 把数组 array给连接起来
	 * 例如array= [3,8,9], seperator = "-"
	 * 则返回值为"3-8-9"
	 * @param array
	 * @param s
	 * @return
	 */
	public String join(int[] array, String seperator){
		String arr="" ;
		for (int i=0;i<array.length-1;i++)
		{
			arr =arr+array[i]+seperator;
			
		}
		arr =arr+array[array.length-1];
		
		
		return arr ;
		
	}
	

}
