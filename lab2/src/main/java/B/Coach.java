package B;

public class Coach extends Carriage {

    enum ComfortLevel {
        LOW, MID, HIGHT
    }

    private int passangerAmount;
    private int baggageAmount;
    private ComfortLevel comfortLevel;



    public Coach(int id, int passangerAmount, int baggageAmount) {
        super(id);
        this.passangerAmount = passangerAmount;
        this.baggageAmount = baggageAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setPassangerAmount(int passangerAmount) {
        this.passangerAmount = passangerAmount;
    }

    public ComfortLevel getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(ComfortLevel comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    public int getPassangerAmount() {
        return passangerAmount;
    }

    public int getBaggageAmount() {
        return baggageAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coach that = (Coach) o;

        if (id != that.id) return false;
        if (passangerAmount != that.passangerAmount) return false;
        return baggageAmount == that.baggageAmount;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + passangerAmount;
        result = 31 * result + baggageAmount;
        return result;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "id=" + id +
                ", passangerAmount=" + passangerAmount +
                ", baggageAmount=" + baggageAmount +
                '}';
    }

}