package counter;

public class Weapon {
    private int fire;
    public int getFire() {
        return fire;
    }
    public int setFire(int fire) {
        return this.fire = fire;
    }

    public Weapon() {
        //System.out.println("Появилось оружие ");
        fire = (int) (Math.random() * 180);
        System.out.println("Появилось оружие (Урон " + fire + ")");
    }

}


