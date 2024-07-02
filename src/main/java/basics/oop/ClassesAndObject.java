package basics.oop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ClassesAndObject {

	public static void main(String[] args) {

		System.out.println("this is first program");
//		varArgsDemo(1,2,3,4,5,56,67);
//		bitwiseExample();
//		array();

		iterableExample();
	}

	public static void varArgsDemo(int... test) {
		for (int i : test) {
			System.out.println("this is i +" + i);
		}
	}

	public static void bitwiseExample() {

		long i = 16;

		System.out.println(i << 1);
		System.out.println(i >> 2);
	

	}
	public static void array() {
		
		List<Integer> ar= new ArrayList<>();
		for(int i=0;i<10;i++) {
			ar.add(i);
		}
		Iterator<Integer> it= ar.iterator();
		while(it.hasNext()) {
			int a = it.next();
			if(a%2==0) {
				it.remove();
			}
		}
		
		ar.stream().forEach(x->System.out.println(x));
	}
	
	public static void iterableExample() {
		
		TestComposible tlist= new TestComposible();
		tlist.add(new Test(1));
		tlist.add(new Test(3));
		tlist.add(new Test(4));
		tlist.add(new Test(5));
		tlist.add(new Test(16));
		tlist.add(new Test(17));
		
		tlist.forEach(x->System.out.println(x));
		
	}
	
}
class Test {
	Test(int i) {
		this.i= i;
	}
	public int i;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(i);
	}
	
}


 class TestComposible implements Iterable<Test>{
	
	 List<Test> test= new ArrayList<Test>();
	 public void add(Test t) {
		 test.add(t);
	 }

	@Override
	public Iterator<Test> iterator() {
		// TODO Auto-generated method stub
		return test.iterator();
	}
 }
