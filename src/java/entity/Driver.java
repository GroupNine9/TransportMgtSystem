
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author GraceTina
 */
@Entity
public class Driver implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;
    private String Fueldrawn;
    private String Destination;
    private String receiptNo;
    private String TimeIn;
    private String TimeOut;
    private String staffId;
    private String KmOfJourney;

    public Driver() {
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getFueldrawn() {
        return Fueldrawn;
    }

    public void setFueldrawn(String Fueldrawn) {
        this.Fueldrawn = Fueldrawn;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getTimeIn() {
        return TimeIn;
    }

    public void setTimeIn(String TimeIn) {
        this.TimeIn = TimeIn;
    }

    public String getTimeOut() {
        return TimeOut;
    }

    public void setTimeOut(String TimeOut) {
        this.TimeOut = TimeOut;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getKmOfJourney() {
        return KmOfJourney;
    }

    public void setKmOfJourney(String KmOfJourney) {
        this.KmOfJourney = KmOfJourney;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.vehicleId);
        hash = 61 * hash + Objects.hashCode(this.staffId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Driver other = (Driver) obj;
        if (!Objects.equals(this.staffId, other.staffId)) {
            return false;
        }
        if (!Objects.equals(this.vehicleId, other.vehicleId)) {
            return false;
        }
        return true;
    }
    
    
    
}
