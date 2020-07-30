package singletonclass;

public class SingleTonClass {
    private int age;
    private String name;
    private String place;

    private SingleTonClass singleTonClass;

    private SingleTonClass() {
        System.out.println("Object is created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public SingleTonClass getInstance(){

        if (singleTonClass!=null)singleTonClass=new SingleTonClass();

        return singleTonClass;


    }



}
