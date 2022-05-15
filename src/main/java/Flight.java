import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureTime){
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.cabinCrewMembers = new ArrayList<>();
        this.bookedPassengers = new ArrayList<>();
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }


    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public void setBookedPassengers(ArrayList<Passenger> passengers) {
        this.bookedPassengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int availableSeats(Plane plane, ArrayList<Passenger> bookedPassengers){
        return plane.getCapacity() - bookedPassengers.size();
    }

    public void bookPassenger(Plane plane, ArrayList<Passenger> bookedPassengers, Passenger passenger){
        if (availableSeats(plane, bookedPassengers) >= 1){
            bookedPassengers.add(passenger);
        }
    }


}
