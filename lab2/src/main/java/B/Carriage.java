package B;

public class Carriage {
    int id;

    public Carriage(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carriage carriage = (Carriage) o;

        return id == carriage.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "id=" + id +
                '}';
    }
}
