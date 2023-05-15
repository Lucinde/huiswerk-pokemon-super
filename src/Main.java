package src;

public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "Pika Pika", "everything", "static", "nails", "awesome", "amazing");
        ElectricPokemon jolteon = new ElectricPokemon("Jolteon", "Jogy Jogy", "hearty grains", "volt absorb", "claws", "great", "super awesome");
        FirePokemon charmeleon = new FirePokemon("Charmeleon", "Char Char", "burned meat", "blaze","burning tail","burning hot", "full of power");
        FirePokemon flareon = new FirePokemon("Flareon", "Fla Fla", "anything spicy (and ice cubes", "Flash Fire", "razor ears", "quick and effective", "spicy");
        WaterPokemon sharpedo = new WaterPokemon("Sharpedo", "Sha Sha", "small wailmer", "rough skin", "sharp teeth","blasting loud", "very slow");
        WaterPokemon wailord = new WaterPokemon("Wailord", "Wal Wal", "wishiwashi", "water veil", "heavy fins","reaching far", "clumsy");
        GrassPokemon venusaur = new GrassPokemon("Venusaur", "Venu Venu", "insects", "overgrow", "poisonous flower","really sharp", "very bright");
        GrassPokemon bellossom = new GrassPokemon("Bellossom", "Bel Bel", "sunlight", "chlorophyll", "floral skirt with sharp edges","blunt", "shining like a thousand suns");

        System.out.println("Everything you want to know about " + pikachu.name.toUpperCase());
        pikachu.eats();
        pikachu.speaks();
        pikachu.scratch();
        pikachu.thunderPunch();
        pikachu.voltTackle();
        System.out.println("------------");

        System.out.println("Everything you want to know about " + jolteon.name.toUpperCase());
        jolteon.eats();
        jolteon.speaks();
        jolteon.scratch();
        jolteon.thunderPunch();
        jolteon.voltTackle();
        System.out.println("------------");

        System.out.println("Everything you want to know about " + charmeleon.name.toUpperCase());
        charmeleon.eats();
        charmeleon.speaks();
        charmeleon.scratch();
        charmeleon.flameThrower();
        charmeleon.inferno();
        System.out.println("------------");

        System.out.println("Everything you want to know about " + flareon.name.toUpperCase());
        flareon.eats();
        flareon.speaks();
        flareon.scratch();
        flareon.flameThrower();
        flareon.inferno();
        System.out.println("------------");

        System.out.println("Everything you want to know about " + sharpedo.name.toUpperCase());
        sharpedo.eats();
        sharpedo.speaks();
        sharpedo.scratch();
        sharpedo.rainDance();
        sharpedo.hydroCanon();
        System.out.println("------------");

        System.out.println("Everything you want to know about " + wailord.name.toUpperCase());
        wailord.eats();
        wailord.speaks();
        wailord.scratch();
        wailord.rainDance();
        wailord.hydroCanon();
        System.out.println("------------");

        System.out.println("Everything you want to know about " + venusaur.name.toUpperCase());
        venusaur.eats();
        venusaur.speaks();
        venusaur.scratch();
        venusaur.leaveBlade();
        venusaur.solarBeam();
        System.out.println("------------");

        System.out.println("Everything you want to know about " + bellossom.name.toUpperCase());
        bellossom.eats();
        bellossom.speaks();
        bellossom.scratch();
        bellossom.leaveBlade();
        bellossom.solarBeam();
        System.out.println("------------");

        /* een Pokemon met het type Grass en Fire in zich */
        GrassFirePokemon scovillian = new GrassFirePokemon("Scovillain", "Sco Sco", "hot peppers", "spicy abstract", "spicy energy");
        scovillian.setInfernoScore("fiery");
        scovillian.setBeamScore("blasting");

        System.out.println("Everything you want to know about " + scovillian.name.toUpperCase());
        scovillian.eats();
        scovillian.speaks();
        scovillian.scratch();
        scovillian.inferno();
        scovillian.solarBeam();
        System.out.println("------------");

    }
}
