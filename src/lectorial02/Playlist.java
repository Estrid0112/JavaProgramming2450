package lectorial02;

import java.util.LinkedList;

public class Playlist {
    public static void main(String[] args) {
    	LinkedList<Playable> pl = new LinkedList<>();
    	pl.add(new AudioPlayer());
    	pl.add(new VideoPlayer());
        for (Playable item: pl) {
            item.play();
        }
    }
}

