import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.*;
import org.springframework.util.Assert;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        Cat one = applicationContext.getBean("cat", Cat.class);
        Cat two = applicationContext.getBean("cat", Cat.class);
        System.out.println(one == two);
        System.out.println(helloWorld == bean);
    }
}