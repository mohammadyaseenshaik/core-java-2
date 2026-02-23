package Loops;

public class ArrayTest {
	//to store multiple value of same type
	//int -datatype
	//arr -refference variable
	//new -keyword
	//[4] -length of array
	//array have fix size
	public static void main(String[] args) {
		int arr[]=new int[4]; //array object
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//arr[4]=50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		//System.out.println(arr[4]);
		System.out.println("-------------");
		for(int i=0;i<4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------");
	
		
}
}