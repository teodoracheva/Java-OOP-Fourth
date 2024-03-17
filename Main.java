import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Създайте колекция от тип ArrayList
        // и добавете в нея 5 обекта на класа Car – 2 камиона (Truck), 1 Ford и 2 седана (Sedan)
        ArrayList<Car> cars = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.println("Item(car): " + (i + 1));
            Car car = null;
            char c = 't';

            switch(i){
                case 0:
                    c = 't';
                    break;
                case 1:
                    c = 't';
                    break;
                case 2:
                    c = 'f';
                    break;
                case 3:
                    c = 's';
                    break;
                case 4:
                    c = 's';
                    break;
            }
            switch(c){
                case 't':
                    Truck truck = new Truck();

                    System.out.print("Weight: ");
                    int weight = s.nextInt();
                    truck.setWeight(weight); //!

                    System.out.print("Speed: ");
                    int speed = s.nextInt();
                    truck.setSpeed(speed);

                    System.out.print("Regular price: ");
                    double regularPrice = s.nextDouble();
                    truck.setRegularPrice(regularPrice);
                    car = truck;

                    break;
                case 'f':
                    Ford ford = new Ford();

                    System.out.print("Year: ");
                    int year = s.nextInt();
                    ford.setYear(year);

                    System.out.print("Manufacturer discount: ");
                    int manufacturerDiscount = s.nextInt();
                    ford.setManufacturerDiscount(manufacturerDiscount);

                    System.out.print("Speed: ");
                    int fordSpeed = s.nextInt();
                    ford.setSpeed(fordSpeed);

                    System.out.print("Regular price: ");
                    double fordRegularPrice = s.nextDouble();
                    ford.setRegularPrice(fordRegularPrice);
                    car = ford;

                    break;
                case 's':
                    Sedan sedan = new Sedan();

                    System.out.print("Length: ");
                    int length = s.nextInt();
                    sedan.setLength(length);

                    System.out.print("Speed: ");
                    int sedanSpeed = s.nextInt();
                    sedan.setSpeed(sedanSpeed);

                    System.out.print("Regular price: ");
                    double sedanRegularPrice = s.nextDouble();
                    sedan.setRegularPrice(sedanRegularPrice);
                    car = sedan;

                    break;
            }
            // Добавяне на създадения обект в колекцията
            cars.add(car);

            // Присвояване на salePrice за текущия обект
            car.setSalePrice(car.getSalePrice());

            System.out.println("Car " + (i + 1) + ": Type = " + car.getClass().getSimpleName() +
                    ", Speed = " + car.getSpeed() +
                    ", Regular price = " + car.getRegularPrice() +
                    ", Sale price = " + car.getSalePrice());
        }

        System.out.println("");
        double totalDiscount = 0;

        // Итерация през всички обекти от колекцията
        for(int i = 0; i < cars.size(); i++) {
            // Вземаме текущия обект от колекцията
            Car car = cars.get(i);

            // Намираме стойностите на редовната и намалената цени
            double regularPrice = car.getRegularPrice();
            double salePrice = car.getSalePrice();

            // Изчисляваме отстъпката
            double discount = regularPrice - salePrice;

            // Добавяме отстъпката към общата отстъпка
            totalDiscount = totalDiscount + discount;
        }
        System.out.println("Total discount: " + totalDiscount);
    }
}