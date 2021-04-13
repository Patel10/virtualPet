package virtual_pet;
public class VirtualPet {
// tried my best to complete the coding assignment.

    private String name;
    private int hunger;
    private int sleepy;
    private int bored;

    public VirtualPet(String name, int hunger, int sleepy, int bored){


        this.name = name;
        this.sleepy = sleepy;
        this.hunger = hunger;
        this.bored = bored;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getSleepy() {
        return sleepy;
    }

    public int getBored() {
        return bored;
    }



    public void setHunger(int h) {
        hunger = h;
    }

    public void setSleepy(int s) {
        sleepy = s;
    }

    public void setBored(int b) {
        bored = b;
    }

    public void modifyHunger(int h) {
        hunger += h;
    }

    public void updateSleepy(int s) {
        sleepy += s;
    }

    public void updateHunger(int h) {
        bored += h;
    }
    public void updateBored(int b ) {

    }

    public void tick() {
        updateSleepy(+3);
        updateHunger(+3);
        updateBored(+3);



    }

}
