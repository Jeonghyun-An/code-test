package week14;


public class RentEx {
	public static void main(String[] args) {
		//중개사 객체를 생성, 인터페이스 연결되있음
		HouseAgency houseA = new HouseAgency();
		
		//생성 하면서 하우스 활성화,렌트 객체 받기
		House house = houseA.rent();
		//집 빌려서 불 켤 수 있음.
		house.turnOnLight();
		
		
		CarAgency carA = new CarAgency();
		
		Car car = carA.rent();
		
		car.carPrint();
		car.run();
		
	}

}
