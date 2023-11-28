/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        PlayMusicTrack playMusicTrack = new PlayMusicTrack("Dil","Arjit","Love");
        playMusicTrack.playMusic("Subscriber");
    }
}
