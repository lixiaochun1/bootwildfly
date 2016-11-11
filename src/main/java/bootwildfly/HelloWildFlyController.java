package bootwildfly;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWildFlyController {
	
	private RestTemplate restTemplate;
	
	@RequestMapping( value="/**", method= RequestMethod.GET)
    public String sayBoot(HttpServletRequest request){
    //    return ("Hello, map all reuqest to return say boot");
        return getRestTemplate().getForObject(request.getRequestURL().toString(), String.class);
    }
	
    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
    
    private RestTemplate getRestTemplate(){
        if(restTemplate==null){
            restTemplate= new RestTemplate();
        }
        return restTemplate;
    }
}