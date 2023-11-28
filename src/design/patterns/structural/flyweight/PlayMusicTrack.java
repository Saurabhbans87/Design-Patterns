/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.flyweight;

public class PlayMusicTrack implements Music {
    private final String trackName;
    private final String artistName;
    private final String albumName;

    public PlayMusicTrack(String trackName, String artistName, String albumName) {
        this.trackName = trackName;
        this.artistName = artistName;
        this.albumName = albumName;
    }

    @Override
    public void playMusic(String subscriber) {
        System.out.println(" " +trackName +" is playing by " +artistName +" from " +albumName);
    }
}
