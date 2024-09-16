package util;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements coach{

    @Override
    public String getWorkDaily() {
        return "practice bowling daily for 2 hours !";
    }
}
