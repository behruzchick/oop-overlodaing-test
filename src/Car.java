public class Car {
    String model;
    String color;
    int price;
    String type;

    public Car(String model , String color , String type , int price) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.type = type;
    }


    public void print(){
        System.out.println("Car created! \n");
        System.out.println("Model: " + model + "\n");
        System.out.println("Color: " + color + "\n");
        System.out.println("Price: " + price + "\n");
        System.out.println("Type of car: " + type);

    }
}
