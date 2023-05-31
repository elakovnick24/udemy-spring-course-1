package eng.elakov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("singleton")
//@Scope("prototype")
public class ClassicalMusic implements Music {
//    List<String> classicalSongs = new ArrayList<>();
//
//    {
//        classicalSongs.add("Ludwig van Beethoven");
//        classicalSongs.add("Wolfgang Amadeus Mozart");
//        classicalSongs.add("Pyotr Ilyich Tchaikovsky");
//    }
//
//    @Override
//    public List<String> getSongs() {
//        return classicalSongs;
//    }

//    private ClassicalMusic() {};
//
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
