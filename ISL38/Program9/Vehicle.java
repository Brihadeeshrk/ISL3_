/*
Write a Java Program that does the following related to Inheritance:
a. Create an abstract class called Vehicle which contains the
‘year_of_manufacture’ data member and two abstract methods ‘getData()’ and
‘putData()’ with a constructor.
b. Create two derived classes “TwoWheeler” and “FourWheeler” and implement
the abstract methods. Make “FourWheeler” as final class.
c. Create class ‘MyTwoWheeler’ which is a sub-class of “TwoWheeler” and
demonstrate the use of super keyword to initialize data members of “MyTwoWheeler”.
*/

abstract class Vehicle {
	public int year_of_manufacture;

	Vehicle() {
	}

	public abstract int getData();

	public abstract void putData(int year);
}

class TwoWheeler extends Vehicle {

	@Override
	public int getData() {
		return year_of_manufacture;
	}

	@Override
	public void putData(int year) {
		year_of_manufacture = year;

	}

	TwoWheeler(int year) {
		year_of_manufacture = year;
	}

}

final class FourWheeler extends Vehicle {

	@Override
	public int getData() {
		return year_of_manufacture;
	}

	@Override
	public void putData(int year) {
		year_of_manufacture = year;
	}

	FourWheeler(int year){
		year_of_manufacture=year;
	}

}

class MyTwoWheeler extends TwoWheeler {
	MyTwoWheeler(int year) {
		super(year);
	}
}

class VehicleMain {
    public static void main(String[] args) {
		MyTwoWheeler myTwoWheeler=new MyTwoWheeler(2077);
		System.out.println(myTwoWheeler.getData());
	}
}