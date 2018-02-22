package epam.spring.test;

import java.util.List;

public class Manager {
    String name;
    List<String> emails;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", emails=" + emails +
                '}';
    }
}
