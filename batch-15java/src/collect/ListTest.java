package collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	public void Arraylist() {
		//<> - generic
		//<E> - element type
		//type- Integer,String,Double,Employee,Customer
		//by default  java provoids the 10 index for Arraylist
		//Arraylist is class and it is dynamically increase 50%
		//Arraylist performs get operations are frequently to compare than add and remove operations
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.remove(0);    //it remove index value 
		System.out.println("===========");
		System.out.println(al.get(2)); // if you want preferable index which will read 
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));//here get is used to read data in index of array
		}
		System.out.println("===========");
		for(int val:al) {
			System.out.println(val);
		}	
		
	}
	public void LinkedListTest() {
		//in linkedlist values or elements are stored in nodes
		//linkedlist contains single and double linkedlsit
		//Asynchronous 
		LinkedList<Integer> li=new LinkedList<Integer>();
		                    li.add(10);
		                    li.add(20);
		                    li.add(30);
		                    li.add(40);
		                    li.remove(1);
		                    li.add(2,100);
		                    for(Integer val:li) {
		                    	System.out.println(val);
		                    }
	}
	public void VectorTest() {
		//its similar to Arraylist
		//it increase double 
		Vector<String> v=new Vector<String>();
		                v.add("yaseen");
		                v.add("sai");
		                v.add("teja");
		                v.add("raju");
		                for(String str:v) {
		                	System.out.println(str);
		                }
		                
		                
	}
	public void StackTest() {
		//
		Stack<String> s=new Stack<String>();
		              s.add("DVD1");
		              s.add("DVD2");
		              s.add("DVD3");
		              s.add("DVD4");
//		              s.pop();
//		              s.pop();
//		              s.pop();
		              s.push("yaseen");
		              //System.out.println("its show pop element"+s.peek());
		              for(String str:s) {
		            	  System.out.println(str);
		              }
	}
	public static void main(String[] args) {
		ListTest a=new ListTest();
		//a.Arraylist();
		//a.LinkedListTest();
		//a.VectorTest();
		a.StackTest();
	}

}
