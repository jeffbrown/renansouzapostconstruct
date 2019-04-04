package renansouzapostconstruct;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/demo")
public class DemoController {

    private ServerService serverService;

    public DemoController(ServerService serverService) {
        this.serverService = serverService;
    }

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}