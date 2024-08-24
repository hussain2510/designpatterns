package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TV t1=TV.getInstanceOfTv();
//		TV t2=TV.getInstanceOfTv();
//		System.out.println(t1+" "+t2);
		
		ExecutorService executor=Executors.newFixedThreadPool(2);
		executor.execute(()->TV.getInstanceOfTv());
		executor.execute(()->TV.getInstanceOfTv());
		executor.execute(()->TV.getInstanceOfTv());
		executor.execute(()->TV.getInstanceOfTv());
		executor.execute(()->TV.getInstanceOfTv());
		executor.execute(()->TV.getInstanceOfTv());
		executor.execute(()->TV.getInstanceOfTv());
		executor.execute(()->TV.getInstanceOfTv());

	}

}
