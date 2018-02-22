package epam.spring.test;

public class simpleMan implements Human {
    String name;

    public simpleMan(String name) {
        this.name = name;
    }
    public simpleMan(){}
    public void speak() {
        System.out.println("Im simple man!");

    }
}
