package level2.application;

import level2.model.SmartPhone;

public class Main {
    public static void main(String[] args) {

        SmartPhone phone1 = new SmartPhone("Xiaomi", "14");
        System.out.println();
        phone1.call("699072096");
        System.out.println();
        phone1.takePicture();
        System.out.println();
        SmartPhone phone2 = new SmartPhone("Redmi", " Note 8");
        phone2.alarm();
    }
}


