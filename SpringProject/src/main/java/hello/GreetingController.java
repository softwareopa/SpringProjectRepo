package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting", produces = "application/json; charset=utf-8")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    
  /**
   *    TODO: expand songs with more attributes
   *    
   *    /songs --> return full list of songs known by the system
   *    /songs/{title} --> return song if songs exists, otherwise HTTP 404
   *    /singers/ --> full list of singers
   *    /singers/{name} --> return singer if exists, otherwise 404
   *    /directors/
   *    /directors/{name}
   */
}