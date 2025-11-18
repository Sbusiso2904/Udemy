package Composition_challeages;

public class main {
    public static void main(String[] args) {
        Smartkichen kitchen = new Smartkichen();

        kitchen.getBrewMaster().brewCoffee();
        kitchen.getIceBox().OrderFood();
        kitchen.getDishWasher().DoDishes();

    }
}
