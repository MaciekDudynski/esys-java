package esys.api;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public TestApi greeting(@RequestParam(value="name", defaultValue="someone") String name) {
        return new TestApi(counter.incrementAndGet(),
                String.format(template, name));
    }
}
