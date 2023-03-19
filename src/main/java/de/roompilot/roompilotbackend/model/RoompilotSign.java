package de.roompilot.roompilotbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class RoompilotSign {

    @Id
    private String macAddress;
    private String ipAddress;
    private double batteryLevel;
    private String name;

    private String room;
    private String subtitle;
    private String description;
    private Date lastUpdate;

    public RoompilotSign() {
    }

    public String getMacAddress() {
        return macAddress;
    }

    public RoompilotSign setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public RoompilotSign setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public RoompilotSign setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
        return this;
    }

    public String getName() {
        return name;
    }

    public RoompilotSign setName(String name) {
        this.name = name;
        return this;
    }

    public String getRoom() {
        return room;
    }

    public RoompilotSign setRoom(String room) {
        this.room = room;
        return this;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public RoompilotSign setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RoompilotSign setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public RoompilotSign setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }


}
