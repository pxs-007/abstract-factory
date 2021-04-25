package a;

public class AConV implements AFruitAndVegetales{
    @Override
    public Fruit CreateF() {
        return null;
    }

    @Override
    public Vegetables CreateV() {
        return new cabbage();
    }
}
