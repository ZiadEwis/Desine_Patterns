void main() {
    Car car1 = CarFactory.getCar("Porche");
    car1.drive();

    Car car2 = CarFactory.getCar("BMW");
    car2.drive();

    Car car3 = CarFactory.getCar("Benz");
    car3.drive();

//    Car car4 = CarFactory.getCar("ABC");
//    car4.drive();     ======> ERROR
}
