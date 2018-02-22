package epam.spring.test;

public class simpleManwFriend implements Human {
    String name;
    private Human friend;
    public void speak() {
        System.out.println("I have a freind!");
    }

    public simpleManwFriend() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFriend(Human freind) {
        this.friend = freind;
    }

    @Override
    public String toString() {
        return "simpleManwFriend{" +
                "name='" + name + '\'' +
                ", freind=" + friend.toString() +
                '}';
    }




}
