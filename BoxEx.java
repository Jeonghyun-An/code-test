package week14;

public class BoxEx {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setT("HiHIHIHIHI");
		String str = box.getT();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
//		box2.setT("33");
		box2.setT(33);
		Integer str2 = box2.getT();
		System.out.println(str2);
		

	}

}
