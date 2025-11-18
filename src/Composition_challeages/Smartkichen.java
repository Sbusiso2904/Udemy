package Composition_challeages;

public class Smartkichen {
    private CoffeeMaker brewMaster;
    private DishWasher dishwashrer;
    private Refrigerator iceBox;
}

class  CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("CoffeeMaker is already brewing");
            hasWorkToDo = false;
        }
    }
}

class  Refrigerator(){

}


}

class DishWasher(){

}

