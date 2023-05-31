package eng.elakov.springcourse.genres;

import eng.elakov.springcourse.Music;
import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "Oxxymiron - Mokh";
    }
}

