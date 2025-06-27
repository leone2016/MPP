package lesson4.lecture;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    private List<Position> positions;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        this.positions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
}
