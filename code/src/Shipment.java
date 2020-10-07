import java.util.Date;
import java.util.List;

public class Shipment {
    private String shipmentNumber, shipmentMethod
    private Date shipmentDate, estimatedArrival;
    private List<ShipmentLog> shipmentLogs;

    public boolean addShipmentLog(ShipmentLog shipmentLog) {
        shipmentLogs.add(shipmentLog);
        return true;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }
    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String getShipmentMethod() {
        return shipmentMethod;
    }
    public void setShipmentMethod(String shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }
    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Date getEstimatedArrival() {
        return estimatedArrival;
    }
    public void setEstimatedArrival(Date estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
    }

    public List<ShipmentLog> getShipmentLogs() {
        return shipmentLogs;
    }
    public void setShipmentLogs(List<ShipmentLog> shipmentLogs) {
        this.shipmentLogs = shipmentLogs;
    }
}