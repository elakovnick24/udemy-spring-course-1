package eng.elakov.springcourse.genres;

import eng.elakov.springcourse.Music;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}