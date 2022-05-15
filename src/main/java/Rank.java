public enum Rank {

    PILOT(1),
    OFFICER(2),
    ATTENDANT(3);

    private final int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return this.rank;
    }

}
