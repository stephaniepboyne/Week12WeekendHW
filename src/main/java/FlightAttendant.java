public class FlightAttendant extends CabinCrewMember{

    public FlightAttendant(String name, Rank rankType) {
        super(name, rankType.getRank());
    }

    public String makeAnnouncement() {
        return "The captain has turned on the Fasten Seat Belt sign.";
    }
}
