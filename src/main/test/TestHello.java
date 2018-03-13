package java;

import bean.PersonService;
import config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestHello {

    @Test
    public  void testSayHello() {

        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService = app.getBean(PersonService.class);

        personService.sayHello();


    }


}
