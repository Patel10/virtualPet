public class VirtualPet {


    private String name;
    private int Hunger;
    private int Sleepy;
    private int Bored;

    public VirtualPet(String n ) {
        name = n;
        Sleepy = 1;
        Hunger = 1;
        Bored = 1;
    }

     public String getName(){
        return name;
    }
    public int getHunger(){
        return Hunger;
    }
    public int getSleepy(){
        return Sleepy;
    }
    public int getBored(){
        return Bored;
    }
public void setHunger(int h) {
    Hunger = h;
}
public void setSleepy(int s) {
    Sleepy = s;
}
public void setBored(int b) {
    Bored = b;
}
public void modifyHunger ( int h) {
    Hunger += h;
}
public static void modifySleepy  ( int s) {
    Sleepy += s;
}
public void modifyBored ( int b) {
    Bored += b;
}

public void tick() {
    Sleepy += 1;
    Hunger += 1;
    Bored += 1;
}

}
