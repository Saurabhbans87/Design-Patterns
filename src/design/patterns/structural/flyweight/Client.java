/**
 * Create by saurabh
 * Date: 28/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        PlayMusicTrack playMusicTrack1 = new PlayMusicTrack("Dil","Arjit","Love");
        playMusicTrack1.playMusic("Subscriber1");

        PlayMusicTrack playMusicTrack2 = new PlayMusicTrack("Honey","Json","Senorita");
        playMusicTrack2.playMusic("Subscriber2");
    }
}
