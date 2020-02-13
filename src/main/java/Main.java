import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBean.xml");
        PersonPresentation persone = (PersonPresentation) applicationContext.getBean("person");
        persone.present();
        Zoo zoo = (Zoo) applicationContext.getBean("animals");
        zoo.makeSounds();
    }
}