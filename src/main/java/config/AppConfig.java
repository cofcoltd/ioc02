package config;


import bean.PersonService;
import handler.PersonHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    //@Bean 代表声明一个Bean 实例在容器中 .    , 而在 2.x / 3.x  <bean id="personService" class="bean.PersonService">
    @Bean
    public PersonService personService() {
        return new PersonService();
    }

    @Bean
    public PersonHandler personHandler() {
        return new PersonHandler();
    }

    public static void main(String[] args) {
        //初始化容器
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

        //从容器中获取  PersonService 实例 // 不需要去 new 这个实例 .
        PersonService personService = app.getBean(PersonService.class);

        personService.sayHello();
    }



}
