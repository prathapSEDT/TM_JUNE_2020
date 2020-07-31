package singletonclass;

public class TestSingleTonClass {
    public static void main(String[] args) {

SingleTonClass obj=SingleTonClass.getInstance();
obj.setName("Prathap");
obj.setPlace("Hyderabad");
obj.setAge(25);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getPlace());


    }
}
