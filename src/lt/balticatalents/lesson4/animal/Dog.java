package lt.balticatalents.lesson4.animal;

class Dog extends Animal {
    private String tail;

    public Dog(int body, boolean hasBrain, String tail) {
        super(body, hasBrain);
        this.tail = tail;
    }

    @Override
    String getType() {
        return null;
    }
}
