interface MusicInstrument{
    public String sounds();
    public String instrumentFamily();
}

class Guitar implements MusicInstrument{
    @Override
    public String sounds() {
        return "Chrngg!";
    }
    public String instrumentFamily(){
        return "String";
    }
}

class Flute implements MusicInstrument{
    @Override
    public String sounds() {
        return "Foo!";
    }
    public String instrumentFamily(){
        return "Woodwind";
    }
}

class Drum implements MusicInstrument{
    @Override
    public String sounds() {
        return "Dum!";
    }
    public String instrumentFamily(){
        return "Percussion";
    }
}

public class Main {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Flute f = new Flute();
        Drum d = new Drum();

        System.out.println("Guitar sounds: " + g.sounds());
        System.out.println("Guitar family: " + g.instrumentFamily());
        System.out.println("Flute sounds: " + f.sounds());
        System.out.println("Flute family: " + f.instrumentFamily());
        System.out.println("Drum sounds: " + d.sounds());
        System.out.println("Drum family: " + d.instrumentFamily());

    }
}
