package docker.org.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ControllerRest {
    @GetMapping("/test")
    public Map<String,Object> index(){
          Map<String,Object> mp = new HashMap<>();
          mp.put("name","docker");
          mp.put("counter",987);
          return mp;
    }
}
