package lab1;

import java.util.List;

public class House {
    private List<Room> rooms;
    private String address;

    public House(final List<Room> rooms, final String address) {
        this.rooms = rooms;
        this.address = address;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (final var room : rooms) {
            builder.append(room).append('\n');
        }
        return "House{" +
                "rooms=\n" + builder +
                ", address='" + address + '\'' +
                '}';
    }

    
}
