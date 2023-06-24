package week14;

public class ProductEx {
	public static void main(String[] args) {
		Product<Tv, String> prod1 = new Product<>();	//kind, type
		prod1.setK(new Tv());
		prod1.setM("samsung");
		Tv tv = prod1.getK();
		String model = prod1.getM();
		tv.tvPrint();
		System.out.println(model);
		
		prod1.setM("LG");
		String tvModel2 = prod1.getM();
		tv.tvPrint();
		System.out.println(tvModel2);
		
		System.out.println();
		
		Product<Car, String> prod2 = new Product<>();
		prod2.setK(new Car());
		prod2.setM("Maceratti");
		Car car = prod2.getK();
		car.carPrint();
		System.out.println("=====>\n"+prod2.getM());
	}

}
