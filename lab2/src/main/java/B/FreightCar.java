package B;

public class FreightCar extends Carriage{
    private double volume;

    public FreightCar(int id, double volume) {
        super(id);
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FreightCar that = (FreightCar) o;

        if (id != that.id) return false;
        return Double.compare(that.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "FreightCar{" +
                "id=" + id +
                ", volume=" + volume +
                '}';
    }
}
