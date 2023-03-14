package src;

public abstract class Pokemon {
    /* variables */
    protected String name;
    private String sound;
    private String food;
    private String ability;
    protected String scratchType;

    /* constructor */
    public Pokemon(String name, String sound, String food, String ability, String scratchType) {
        this.name = name;
        this.sound = sound;
        this.food = food;
        this.ability = ability;
        this.scratchType = scratchType;
    }

    /* methods */
    public void eats() {
        System.out.println(name + " eats: " + food);
    }

    public void speaks() {
        System.out.println(name + " says: " + sound);
    }

    public abstract void scratch();

    /* getters & setters */
    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getAbility() {
        return ability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
