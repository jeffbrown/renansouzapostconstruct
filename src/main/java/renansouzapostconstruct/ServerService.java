package renansouzapostconstruct;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

@Singleton
public class ServerService {

    @PostConstruct
    public void print() {
        System.out.println("Hello!");
    }
}