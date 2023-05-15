package src;

public class FirePokemon extends Pokemon {
    /* variables */
    private String infernoScore;
    private String flameScore;

    /* constructor */
    public FirePokemon(String name, String sound, String food, String ability, String scratchType, String infernoScore, String flameScore) {
        super(name, sound, food, ability, scratchType);
        this.infernoScore = infernoScore;
        this.flameScore = flameScore;
    }

    /* methods */
    @Override
    public void scratch() {
        System.out.println("A fire pokemon like " + name + " uses his "  + scratchType + " for a fierce scratch attack");
    }
    public void inferno() {
        System.out.println(name + "'s inferno is " + infernoScore);
    }

    public void flameThrower() {
        System.out.println(name + "'s flame thrower is " + flameScore);
    }

    /* getters & setters */
    public String getInfernoScore() {
        return infernoScore;
    }

    public String getFlameScore() {
        return flameScore;
    }

    public void setInfernoScore(String infernoScore) {
        this.infernoScore = infernoScore;
    }

    public void setFlameScore(String flameScore) {
        this.flameScore = flameScore;
    }
}
