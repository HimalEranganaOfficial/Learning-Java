package modifiers.accessmodifiers;

class a {

    private int number = 10;

    private void display() {
        System.out.println("Hello Java");
    }

    public int getNumber() {
        return number;
    }

    public void showMessage() {
        display();
    }
}