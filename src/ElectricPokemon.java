package src;

public class ElectricPokemon extends Pokemon {
    /* variables */
    private String punchScore;
    private String tackleScore;

    /* constructors */
    public ElectricPokemon(String name, String sound, String food, String ability, String scratchType, String punchScore, String tackleScore) {
        super(name, sound, food, ability, scratchType);
        this.punchScore = punchScore;
        this.tackleScore = tackleScore;
    }

    /* methods */
    @Override
    public void scratch() {
        System.out.println("An electric pokemon like " + name + " uses his electric "  + scratchType + " for a lightning scratch attack");
    }
    public void thunderPunch() {
        System.out.println(name + "'s thunderpunch is " + punchScore);
    }

    public void voltTackle() {
        System.out.println(name + "'s volt tackle is " + tackleScore);
    }

    /* getters & setters */

    public void setPunchScore(String punchScore) {
        this.punchScore = punchScore;
    }

    public void setTackleScore(String tackleScore) {
        this.tackleScore = tackleScore;
    }

    public String getPunchScore() {
        return punchScore;
    }

    public String getTackleScore() {
        return tackleScore;
    }
}
