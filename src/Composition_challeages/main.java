package Composition_challeages;

public class main {
    public static void main(String[] args) {

        Smartkichen kitchen = new Smartkichen();

//
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//
//        kitchen.getBrewMaster().brewCoffee();
//        kitchen.getIceBox().OrderFood();
//        kitchen.getDishWasher().DoDishes();

        kitchen.setKitchenState(true, true, true);
        kitchen.doKichenWork();

    }
}
