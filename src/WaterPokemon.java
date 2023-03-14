package src;

public class WaterPokemon extends Pokemon {
    /* variables */
    private String canonScore;
    private String danceScore;

    /* constructors */
    public WaterPokemon(String name, String sound, String food, String ability, String scratchType, String canonScore, String danceScore) {
        super(name, sound, food, ability, scratchType);
        this.canonScore = canonScore;
        this.danceScore = danceScore;
    }

    /* methods */
    @Override
    public void scratch() {
        System.out.println("A water pokemon like " + name + " uses his "  + scratchType + " for a powerful scratch attack");
    }
    public void hydroCanon() {
        System.out.println(name + "'s hydro canon is " + canonScore);
    }

    public void rainDance() {
        System.out.println(name + "'s rain dance is " + danceScore);
    }

    /* getters & setters */
    public String getCanonScore() {
        return canonScore;
    }

    public String getDanceScore() {
        return danceScore;
    }

    public void setCanonScore(String canonScore) {
        this.canonScore = canonScore;
    }

    public void setDanceScore(String danceScore) {
        this.danceScore = danceScore;
    }
}
