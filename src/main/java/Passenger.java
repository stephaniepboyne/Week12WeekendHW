import java.util.ArrayList;

public class Passenger {
    private String name;
    private ArrayList<Bag> bags;

    public Passenger(String name) {
        this.name = name;
        this.bags = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bag> getBags() {
        return this.bags;
    }

    public void setBags(ArrayList<Bag> bags) {
        this.bags = bags;
    }

    public int getNumberOfBags(){
        return this.bags.size();
    }

    public void addBag(Bag bag){
        this.bags.add(bag);
    }
}
