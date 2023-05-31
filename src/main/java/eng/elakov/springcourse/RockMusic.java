package eng.elakov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> rockSongs = new ArrayList<>();

    {
        rockSongs.add("Numb");
        rockSongs.add("Nothing else matters");
        rockSongs.add("In the end");
    }
    @Override
    public List<String> getSongs() {
        return rockSongs;
    }
}
