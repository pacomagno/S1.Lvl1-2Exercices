package level2.model;

public class SmartPhone extends Phone {

    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    public void takePicture() {
        System.out.println("The " + getBrand() + " " + getModel() + " its taking a picture");
    }

    public void alarm() {
        System.out.println("The " + getBrand() + "" + getModel() + " alarm is Sounding");
    }
}
