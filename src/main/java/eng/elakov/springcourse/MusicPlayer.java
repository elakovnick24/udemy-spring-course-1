package eng.elakov.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Random random = new Random();

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume;

    }
}
