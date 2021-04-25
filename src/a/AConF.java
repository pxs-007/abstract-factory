package a;

public class AConF implements AFruitAndVegetales{
    @Override
    public Fruit CreateF() {
        return new Apple();
    }

    @Override
    public Vegetables CreateV() {
        return null;
    }
}
