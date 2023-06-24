package week14;

//public class Util {
//	public static <T> Box<T> boxing(T t){	//generic type
//		
//		Box<T> box = new Box<>();
//		box.setT(t);
//		return box;
//		
//	}
//
//}


public class Util{
	public static <T> Box<T> boxing(T t){	//generic Type
		
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
		
	}
}