package week14;

public class MyClassEx {
	public static void main(String[] args) {
		MyClass<Integer> intClass = new MyClass<>();
		intClass.printValue(100);
		
		MyClass<String> strClass = new MyClass<>();
		strClass.printValue("HiHI~");
		
		MyClass<Boolean> boolClass = new MyClass<>();
		boolClass.printValue(true);
	}

}
