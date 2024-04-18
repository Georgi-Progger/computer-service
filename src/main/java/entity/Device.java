package entity;

import java.util.Date;


public class Device {
    private Long id;
    private String deviceName;
    private String technicalSpecifications;
    private String systemAndApplicationSoftware;
    private String location;
    private String responsibleUser;
    private String accountablePerson;
    private String inventoryNumber;
    private Date lastInventoryDate;

    public Device(Long id, String deviceName, String technicalSpecifications,
                  String systemAndApplicationSoftware, String location,
                  String responsibleUser, String accountablePerson,
                  String inventoryNumber, Date lastInventoryDate) {
        this.id = id;
        this.deviceName = deviceName;
        this.technicalSpecifications = technicalSpecifications;
        this.systemAndApplicationSoftware = systemAndApplicationSoftware;
        this.location = location;
        this.responsibleUser = responsibleUser;
        this.accountablePerson = accountablePerson;
        this.inventoryNumber = inventoryNumber;
        this.lastInventoryDate = lastInventoryDate;
    }

    public Device(Long id) {
        this.id = id;
    }

    public Device(Long id, String deviceName, String technicalSpecifications) {
        this(id);
        this.deviceName = deviceName;
        this.technicalSpecifications = technicalSpecifications;
    }


    public Device() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getTechnicalSpecifications() {
        return technicalSpecifications;
    }

    public void setTechnicalSpecifications(String technicalSpecifications) {
        this.technicalSpecifications = technicalSpecifications;
    }

    public String getSystemAndApplicationSoftware() {
        return systemAndApplicationSoftware;
    }

    public void setSystemAndApplicationSoftware(String systemAndApplicationSoftware) {
        this.systemAndApplicationSoftware = systemAndApplicationSoftware;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResponsibleUser() {
        return responsibleUser;
    }

    public void setResponsibleUser(String responsibleUser) {
        this.responsibleUser = responsibleUser;
    }

    public String getAccountablePerson() {
        return accountablePerson;
    }

    public void setAccountablePerson(String accountablePerson) {
        this.accountablePerson = accountablePerson;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public Date getLastInventoryDate() {
        return lastInventoryDate;
    }

    public void setLastInventoryDate(Date lastInventoryDate) {
        this.lastInventoryDate = lastInventoryDate;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", deviceName='" + deviceName + '\'' +
                ", technicalSpecifications='" + technicalSpecifications + '\'' +
                ", systemAndApplicationSoftware='" + systemAndApplicationSoftware + '\'' +
                ", location='" + location + '\'' +
                ", responsibleUser='" + responsibleUser + '\'' +
                ", accountablePerson='" + accountablePerson + '\'' +
                ", inventoryNumber='" + inventoryNumber + '\'' +
                ", lastInventoryDate=" + lastInventoryDate +
                '}';
    }

}
