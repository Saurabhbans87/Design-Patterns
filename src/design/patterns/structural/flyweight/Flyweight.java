/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    static Map<String,PlayMusicTrack> stringPlayMusicTrackMap = new HashMap<>();

    public static PlayMusicTrack MusicTrack(String trackName, String artistName, String albumName){
        String key = trackName+artistName+albumName;
        if(!stringPlayMusicTrackMap.containsKey(key)){
            stringPlayMusicTrackMap.put(key,new PlayMusicTrack("Dil is "," by Arjit Singh"," Love Album"));
        }
        return stringPlayMusicTrackMap.get(key);
    }
}
