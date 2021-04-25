package a;

public class cilent {
    public static void main(String[] args) {
        Fruit afruit = new AConF().CreateF();
        Vegetables aVgetables = new AConV().CreateV();
        afruit.eat();

        Fruit bfruit = new BConF().CreateF();
        Vegetables bVgetables = new BConV().CreateV();
        bfruit.eat();

    }
}
