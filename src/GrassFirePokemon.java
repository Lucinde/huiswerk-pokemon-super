package src;

public class GrassFirePokemon extends Pokemon {
    private GrassPokemon myGrass;
    private FirePokemon myFire;

    /* constructor */
    public GrassFirePokemon(String name, String sound, String food, String ability, String scratchType) {
        super(name, sound, food, ability, scratchType);
        myFire = new FirePokemon(name, sound, food, ability, scratchType, "great", "good");
        myGrass = new GrassPokemon(name, sound, food, ability, scratchType, "good", "great");
    }

    /* methodes */
    public String getInfernoScore() {
        return myFire.getInfernoScore();
    }

    public void setInfernoScore(String infernoScore) {
        myFire.setInfernoScore(infernoScore);
    }

    public String getBeamScore() {
        return myGrass.getBeamScore();
    }

    public void setBeamScore(String beamScore) {
        myGrass.setBeamScore(beamScore);
    }

    public void solarBeam() {
        myGrass.solarBeam();
    }

    public void inferno() {
        myFire.inferno();
    }

    @Override
    public void scratch() {
        System.out.println("A grass fire pokemon like " + name + " uses his "  + scratchType + " for a fierce scratch attack");
    }
}
