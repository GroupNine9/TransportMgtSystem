/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.sql.Date;
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
public class Maintenance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;
    @Column(nullable = false, length = 70)
    private String Department;
    @Column(nullable = false, length = 30)
    private String Odometernumber;
    @Column(nullable = false)
    private Float Fuel ;
    @Column(nullable = false)
    private Date DateIn;
    @Column(nullable = false)
    private Date PromisedDate;
    @Column(nullable = false, length = 20)
    private String EngineNumber;
    @Column(nullable = false, length = 50)
    private String ContactPerson;
    @Column(nullable = false, length = 50)
    private String Model;
    @Column(nullable = false, length = 20)
    private String VehicleCondition;

    public Maintenance() {
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getOdometernumber() {
        return Odometernumber;
    }

    public void setOdometernumber(String Odometernumber) {
        this.Odometernumber = Odometernumber;
    }

    public Float getFuel() {
        return Fuel;
    }

    public void setFuel(Float Fuel) {
        this.Fuel = Fuel;
    }
    
    public Date getDateIn() {
        return DateIn;
    }

    public void setDateIn(Date DateIn) {
        this.DateIn = DateIn;
    }

    public Date getPromisedDate() {
        return PromisedDate;
    }

    public void setPromisedDate(Date PromisedDate) {
        this.PromisedDate = PromisedDate;
    }

    public String getEngineNumber() {
        return EngineNumber;
    }

    public void setEngineNumber(String EngineNumber) {
        this.EngineNumber = EngineNumber;
    }

    public String getContactPerson() {
        return ContactPerson;
    }

    public void setContactPerson(String ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getVehicleCondition() {
        return VehicleCondition;
    }

    public void setVehicleCondition(String VehicleCondition) {
        this.VehicleCondition = VehicleCondition;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.vehicleId);
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
        final Maintenance other = (Maintenance) obj;
        return Objects.equals(this.vehicleId, other.vehicleId);
    }
    
}
