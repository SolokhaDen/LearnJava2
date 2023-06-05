package counter;

public class Weapon {
    private int fire;


    public Weapon() {
        System.out.println("Выдали Weapon");
        fire = (int) (Math.random() * 180);
        System.out.println("Урон " + fire);
    }

    public int getFire() {
        return fire;
    }

    public int setFire(int fire) {
        return this.fire = fire;
    }
}
