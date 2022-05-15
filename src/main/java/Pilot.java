public class Pilot extends CabinCrewMember {

    private String licenceNumber;

    public Pilot(String name, Rank rankType, String licenceNumber) {
        super(name, rankType.getRank());
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String canFly(){
        return "I can fly!";
    }
}
