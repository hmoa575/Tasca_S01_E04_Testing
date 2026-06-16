package level02;

import java.util.Objects;

public class Exercise04Assertion_House {
    private final String address;

    public Exercise04Assertion_House(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise04Assertion_House house = (Exercise04Assertion_House) o;
        return Objects.equals(address, house.address);
    }
    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
    @Override
    public String toString() {
        return "Exercise04Assertion_House{" +
                "address='" + address + '\'' +
                '}';
    }
}
