package lvl2.app;

import lvl2.model.SmartPhone;

public class Main {
    public static void main(String[] args) {

        SmartPhone phone1 = new SmartPhone("Xiaomi", "14");
        phone1.call("699072096");
        phone1.takePicture();
        phone1.alarm();

        System.out.println(phone1);
    }
}


