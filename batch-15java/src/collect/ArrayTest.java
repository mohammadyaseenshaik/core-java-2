package collect;

public class ArrayTest {
	public static void main(String[] args) {
		//array store multiple value of same type
		//array have fixed length
		//array index starts from 0
		//"arr.length" act as dynamically 
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//arr[4]=50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println("-----------");
		for(int i=0;i<arr.length;i++) {   //for loop
			System.out.println(arr[i]);
		}
		System.out.println("-------");
		for(int val:arr) {                //foreach
			System.out.println(val);
		}
		
		
	}

}
