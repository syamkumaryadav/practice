package alloops.prgms;

class Car{
	String brand;
	int speed, distance;
	
	public Car(String brand, int speed, int distance) {
		
		this.brand = brand;
		this.speed = speed;
		this.distance = distance;
	}


	 void Dispaly() {
		System.out.println( "Car [brand=" + brand + ", speed=" + speed + ", distance=" + distance + "]");
	}
	
	
}

class SpeedCalculation {

	public static void main(String[] args) {
		
		Car car=new Car("BMW",200,300);
		car.Dispaly();
	}

}
