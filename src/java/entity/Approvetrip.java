/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author GraceTina
 */
@Entity
public class Approvetrip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;
    private Long staffId;
    private Long tripId;
    
     @Column(nullable = false, length = 50)
    private String destination;
    @Column(nullable = false, length = 30)
    private String departuredate;
    @Column(nullable = false, length = 30)
    private String returndate;
    @Column(nullable = false, length = 40)
    private String passcount;
    @Column(nullable = false, length = 20)
    private String duration;

    public Approvetrip() {
    }
    
    

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getDriverId() {
        return staffId;
    }

    public void setDriverId(Long driverId) {
        this.staffId = staffId;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public String getPasscount() {
        return passcount;
    }

    public void setPasscount(String passcount) {
        this.passcount = passcount;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.vehicleId);
        hash = 67 * hash + Objects.hashCode(this.staffId);
        hash = 67 * hash + Objects.hashCode(this.tripId);
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
        final Approvetrip other = (Approvetrip) obj;
        if (!Objects.equals(this.vehicleId, other.vehicleId)) {
            return false;
        }
        if (!Objects.equals(this.staffId, other.staffId)) {
            return false;
        }
        if (!Objects.equals(this.tripId, other.tripId)) {
            return false;
        }
        return true;
    }
    
    
      
    
}
