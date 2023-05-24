package modifikatoryDostupa;

public class Modifiers {

    static private int privateI = 1;
    static int defaultI = 2;
    static protected int protectedI = 3;
    static public int publicI = 4;

    public void method(){
        privateI = 1;
    }

}

class Mod2 {

    public void method(){
        // Modifiers.privateI = 1; Не можем
        Modifiers.publicI = 1;
        Modifiers.protectedI = 1;
        Modifiers.publicI = 1;
    }
}
