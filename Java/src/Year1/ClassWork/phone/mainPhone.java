package Year1.ClassWork.phone;

public class mainPhone {
    public static void main(String[] args) {
        iphone13 phone1 = new iphone13();
        phone1.setModelName("IPhone 13 pro max");
        phone1.setColor("Sky blue");
        phone1.setRam(16);
        phone1.setStorage(128);

        System.out.println(phone1.operatingSystem());
        System.out.println(phone1.getModelName());
        System.out.println(phone1.getColor());
        System.out.println(phone1.camera());
        System.out.println(phone1.getStorage()+" GB");
        System.out.println(phone1.getRam()+" GB");

    }
}
