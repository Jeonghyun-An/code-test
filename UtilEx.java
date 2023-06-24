package week14;

//public class UtilEx {

//	public static void main(String[] args) {
//		Box<Integer> box1 = Util.boxing(100);
//		int intval = box1.getT();
//		System.out.println("box1 = "+intval);
//		
//		Box<String> box2 = Util.boxing("Love");
//		String strval = box2.getT();
//		System.out.println("box2 = "+strval);
//	}
//
//}

public class UtilEx {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(100); // 안에 넣은 값으로 명시적으로 유추 인티저라는걸.
		int intVal = box1.getT();
		System.out.println("box1 = " + intVal);

		Box<String> box2 = Util.boxing("HiHI");
		String strVal = box2.getT();
		System.out.println("box2 = " + strVal);
	}
}