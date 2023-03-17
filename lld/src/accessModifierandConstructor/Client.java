package accessModifierandConstructor;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("Tarun",21,true,56,'b');
//        System.out.println(s.getName());
//        System.out.println(s.getRno());
//        System.out.println(s.isPass());
//        System.out.println(s.getPercentage());
//        System.out.println(s.getGrade());
        Phone i11 = new Phone(11,"Iphone",13,4000,12,60000);
        Phone i12 = new Phone(i11);
        System.out.println(i12.getModelNo());
        System.out.println(i12.getModelName());
        System.out.println(i12.getProcessorVersion());
        System.out.println(i12.getBatteryCapacity());
        System.out.println(i12.getCameraSpecs());
        System.out.println(i12.getPrice());

    }
}
