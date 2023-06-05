package counter;

public class Man {
    private int hp = 100;
    private boolean isAlive = true;
    private String name;
    private Weapon ak47 = new Weapon();

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public Man() {
        setName("Denis" + (int) (Math.random() * 180));
        System.out.println("Создали " + name);
    }

    public void попадание(Man он) {
        int урон = ak47.getFire();
        он.hp = он.hp - урон;
        System.out.println("Урон -" + урон);
        if (он.hp < 1) {
            он.setAlive(false);
            System.out.println("ПОГИБ!!!");
        }

    }


}
//private int Count;
//todo прочитать про класс фабрики


//public int getCount() {return Count;}

