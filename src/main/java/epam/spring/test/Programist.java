package epam.spring.test;

public class Programist implements Human {
    private String name;
    private String skill;
    private boolean likeCoffee;

    public Programist(String name, String skill, boolean likeCoffee) {
        this.name = name;
        this.skill = skill;
        this.likeCoffee = likeCoffee;
    }
    public Programist(){}
    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public boolean isLikeCoffee() {
        return likeCoffee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setLikeCoffee(boolean likeCoffee) {
        this.likeCoffee = likeCoffee;
    }

    @Override
    public String toString() {
        return "Programist{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", likeCoffee=" + likeCoffee +
                '}';
    }

    public void speak() {

    }
}

