package problem2;

public class testCars {
	public static void main(String[] args) {
		
		RentalCar car1 = new RentalCar("Ford", "Escape", 2016);
		RentalCar car2 = new RentalCar("Ford", "Explorer", 2020);
		RentalCar car3 = new RentalCar("Ford", "Edge", 2018);
		RentalCar car4 = new RentalCar("Subaru", "Outback", 2020);
		RentalCar car5 = new RentalCar("Subaru", "Forester", 2021);
		RentalCar car6 = new RentalCar("Subaru", "Crosstek", 2019);
		RentalCar car7 = new RentalCar("Honda", "Civic", 2022);
		RentalCar car8 = new RentalCar("Toyota", "Corolla", 2024);
		RentalCar car9 = new RentalCar("Honda", "Accord", 2020);
		RentalCar car10 = new RentalCar("Toyota", "Camry", 2023);
		
		RentalAgency myAgency = new RentalAgency("Hertz", "Santa Barbara", "California");
		
		System.out.println(myAgency.addCar(car1));
		System.out.println(myAgency.addCar(car2));
		System.out.println(myAgency.addCar(car3));
		System.out.println(myAgency.addCar(car4));
		System.out.println(myAgency.addCar(car5));
		System.out.println(myAgency.addCar(car6));
		System.out.println(myAgency.addCar(car7));
		System.out.println(myAgency.addCar(car8));
		System.out.println(myAgency.addCar(car9));
		System.out.println(myAgency.addCar(car10));
		
		System.out.println(myAgency.addCar(car1));
		
		car1.setDailyCost(10);
		RentalCar rental1 = myAgency.rentCar(car1.getID());
		int rental1ID;
		
		if(rental1!=null) {
			rental1ID = rental1.getID();
		}
		else {
			rental1ID= -1;
		}
		
		
		RentalCar rental2 = myAgency.rentCar(car1.getID());
		int rental2ID;
		
		if(rental2!=null) {
			rental2ID = rental1.getID();
		}
		else {
			rental2ID= -1;
		}
		System.out.println(rental1ID);
		System.out.println(rental2ID);
		
		RentalCar[] carsInStock = myAgency.carsInStock();
		for(RentalCar car: carsInStock) {
			if(car!=null) {System.out.println(car.getID() + " ");}
		}
		
		System.out.println(myAgency.returnCar(car1.getID(), 7));
		System.out.println(myAgency.returnCar(car2.getID(), 7));
	}

}
