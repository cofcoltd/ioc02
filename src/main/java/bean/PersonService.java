package bean;


import handler.PersonHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

     // 自动装配 , 不需要 new
    private  @Autowired  PersonHandler personHandler;

    public void sayHello() {
        personHandler.say();
    }
}
