package guru.springframework.demo;

import guru.springframework.demo.controllers.ConstructorInjectedController;
import guru.springframework.demo.controllers.MyController;
import guru.springframework.demo.controllers.PropertyInjectedController;
import guru.springframework.demo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    /*public static void main(String[] args) {
        SpringApplication.run(DiDemoApplication.class, args);
    }*/

    public static void main (String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
    }
}
