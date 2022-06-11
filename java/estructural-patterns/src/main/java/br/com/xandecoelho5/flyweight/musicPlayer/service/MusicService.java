package br.com.xandecoelho5.flyweight.musicPlayer.service;

import br.com.xandecoelho5.flyweight.musicPlayer.model.Music;
import br.com.xandecoelho5.flyweight.musicPlayer.musicFlyweight.FlyWeightFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MusicService {
    private final Map<String, Map<String, Music>> memory;

    public MusicService() {
        memory = new HashMap<>();
    }

    public void listenMusic(String user, String desc) {
        Map<String, Music> userPlayList = memory.computeIfAbsent(user, k -> new HashMap<>());

        Music song = userPlayList.get(desc);
        if (song == null) {
            song = new Music(FlyWeightFactory.getInstance().getMusic(desc));
            userPlayList.put(desc, song);
        }
        System.out.printf("%s is listenning '%s'%n", user, song.getMusicFlyweight().getName());
        song.listenning();
    }

    public void report() {
        Set<String> users = memory.keySet();
        for (String user : users) {
            int timeCounter = 0;
            System.out.println("---------");
            System.out.println(user + " has listen...");
            Collection<Music> musics = memory.get(user).values();
            for (Music music : musics) {
                System.out.printf("%s/%s %d times%n",
                        music.getMusicFlyweight().getArtist(),
                        music.getMusicFlyweight().getName(),
                        music.getPlayerQty());
                timeCounter += (music.getPlayerQty() * music.getMusicFlyweight().getDurationInSeconds());
            }
            System.out.printf("%s has listen music for %d seconds%n", user, timeCounter);
        }
        System.out.println("Total of musics in flyWeight's memory: " + FlyWeightFactory.getInstance().getSize());
    }
}
