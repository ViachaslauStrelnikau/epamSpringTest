package epam.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );



    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        Human Man = (Human) context.getBean("Dima");
        Man.speak();
        Human Man2 = (Human) context.getBean("Vasia");
        Man2.speak();
        Programist man3 = (Programist) context.getBean("Petia");
        System.out.println(man3);
        Programist man4 = (Programist) context.getBean("Kolia");
        System.out.println(man4);
        Human man5 = (Human) context.getBean("Olia");
        System.out.println(man5);


        Manager man6 = (Manager) context.getBean("Coolmanager");
        System.out.println(man6);

    }

}
