package mainpackage.class2;

import java.time.LocalDate;

public class Client {
    private String name, eventType, address;
    private int id;
    private LocalDate dateOfEvent;

    public Client(String name, String eventType, int id, String address, LocalDate dateOfEvent) {
        this.name = name;
        this.eventType = eventType;
        this.id = id;
        this.address = address;
        this.dateOfEvent = dateOfEvent;
    }

    public Client(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public Client(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(LocalDate dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", eventType='" + eventType + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", dateOfEvent=" + dateOfEvent +
                '}';
    }
}
