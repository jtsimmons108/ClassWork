package chapter9;

public class BandBooster{

    private String name;
    private int numBoxes;


    public BandBooster(String name){
        this.name = name;
        numBoxes = 0;
    }

    public void updateSales(int amount){
        numBoxes += amount;
    }

    public String getName(){
        return name;
    }

    public int getNumBoxes(){
        return numBoxes;
    }


    public String toString(){
        return name + ": " + numBoxes;
    }

}