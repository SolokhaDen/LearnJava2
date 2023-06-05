package counter;

public class Weapon{
    private int Fire;


    public Weapon() {
        System.out.println("Создали Weapon");
        Fire = (int) (Math.random() * 180);
    }
    public int getFire() {
        return Fire;
    }

    public int setFire (int Fire) {
        return this.Fire = Fire;
    }
}
