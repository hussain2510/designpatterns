//package Singleton;
//
//public class TV {
//	public static TV tv=null;
//	private TV()
//	{
//		
//	}
//	public static TV getInstanceOfTv()
//	{
//		if(tv==null)
//		{
//			tv=new TV();
//		}
//		return tv;
//		
//	}
//
//}

//thread issue :1

//package Singleton;
//
//public class TV {
//	public static TV tv=null;
//	private TV()
//	{
//		
//	}
//	public synchronized static TV getInstanceOfTv()
//	{
//		if(tv==null)
//		{
//			tv=new TV();
//		}
		//heavy code here
//		return tv;

//		
//	}
//
//}


//so because synchrozied only one thread is allowed to enter the function and headcode is not able to execute:
//taking time:2


//double checking:
//package Singleton;
//
//public class TV {
//	public static TV tv=null;
//	private TV()
//	{
//		
//	}
//	public  static TV getInstanceOfTv()
//	{
//		
//		if(tv==null)
//		{
//			synchronized(TV.class) {
//				if(tv==null)
//				{
//					tv=new TV();
//				}
//				
//			}
//			
//		}
//		return tv;
//		
//	}
//
//}


//issue:cour reordering and l1 cache
//every thread maintains a local copy of the flag in cache
//but as we know cou use cache to store data so if we have two threads and they are storing values in chache and the cache is not synup then if value is modified by other cannot be read by other because they are in cache not memory
//to solve that use volatile so that it will save in memeory and volatile se uppr kuch and niche kuch to cpu usko reorder ni kr skta

package Singleton;

public class TV {
	public volatile static TV tv=null;
	private TV()
	{
		System.out.println("object is created");
		
	}
	public  static TV getInstanceOfTv()
	{
		
		if(tv==null)
		{
			synchronized(TV.class) {
				if(tv==null)
				{
					tv=new TV();
				}
				
			}
			
		}
		return tv;
		
	}

}
