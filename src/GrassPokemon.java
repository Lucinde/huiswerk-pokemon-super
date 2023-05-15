package src;

public class GrassPokemon extends Pokemon {
    /* variables */
    private String bladeScore;
    private String beamScore;


    /* constructor */
    public GrassPokemon(String name, String sound, String food, String ability, String scratchType, String bladeScore, String beamScore) {
        super(name, sound, food, ability, scratchType);
        this.bladeScore = bladeScore;
        this.beamScore = beamScore;
    }

    /* methods */

    @Override
    public void scratch() {
        System.out.println("A grass pokemon like " + name + " uses his " + scratchType + " for a harsh scratch attack");
    }

    public void leaveBlade() {
        System.out.println(name + "'s leave blade is " + bladeScore);
    }

    public void solarBeam() {
        System.out.println(name + "'s solar beam is " + beamScore);
    }

    /* getters & setters */
    public String getBladeScore() {
        return bladeScore;
    }

    public String getBeamScore() {
        return beamScore;
    }

    public void setBladeScore(String bladeScore) {
        this.bladeScore = bladeScore;
    }

    public void setBeamScore(String beamScore) {
        this.beamScore = beamScore;
    }
}
