package Composition_challeages;

public class Smartkichen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishwasher;

    public DishWasher getDishWasher(){
        return dishwasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    // no arguments construtors
    public Smartkichen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishwasher = new DishWasher();
    }


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

class  Refrigerator{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }


    public void OrderFood() {
        if (hasWorkToDo) {
            System.out.println("Refrigerator is keeping the food cool");
            hasWorkToDo = false;
        }
    }

}


class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void DoDishes() {
        if (hasWorkToDo) {
            System.out.println("DishWasher is washing dishes");
            hasWorkToDo = false;
        }
    }

}

