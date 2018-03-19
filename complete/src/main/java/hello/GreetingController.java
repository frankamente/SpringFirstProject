package hello;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private ServicesManager servicesManager;

    public GreetingController(){
        servicesManager = new ServicesManager();
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Collection<Person> greeting() {
        Collection<Person> greetingsCollection = servicesManager.getPeople();
        return greetingsCollection;
    }
}
