package beans;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    @PostConstruct
    public void init(){
        name = "Kiki";
    }

    public String getName() {
        return name;
    }
}

