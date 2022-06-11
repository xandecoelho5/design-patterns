package br.com.xandecoelho5.flyweight.map.model;

public class PixelType {

    private final Character character;
    private final Integer treasureReward;

    public PixelType(Character character, Integer treasureReward) {
        this.character = character;
        this.treasureReward = treasureReward;
    }

    public Character getCharacter() {
        return character;
    }

    public Integer getTreasureReward() {
        return treasureReward;
    }
}
