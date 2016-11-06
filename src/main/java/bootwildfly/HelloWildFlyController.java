package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {
	
	@RequestMapping( value="/**", method= RequestMethod.GET)
    public String sayBoot(){
        return ("Hello, map all reuqest to return say boot");
    }
	
    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
}