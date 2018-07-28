
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
public class Staff implements Serializable 
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long staffId;
    
    @Column(nullable = false, length = 20)
    private String surName;
    @Column(nullable = false, length = 70)
    private String otherNames;
    @Column(nullable = false, length = 15, unique = true)
    private String nationalId;
    @Column(nullable = false, length = 15, unique = true)
    private String phoneNo;
    @Column(nullable = false, length = 70, unique = true)
    private String emailAddr;
    @Column(nullable = false, length = 50)
    private String password;
    //@Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private String staffRole;

    public Staff() 
    {
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public Long getStaffId() 
    {
        return staffId;
    }

    public void setStaffId(Long staffId) 
    {
        this.staffId = staffId;
    }

    public String getSurName() 
    {
        return surName;
    }

    public void setSurName(String surName) 
    {
        this.surName = surName;
    }

    public String getOtherNames() 
    {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.staffId);
        hash = 79 * hash + Objects.hashCode(this.nationalId);
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
        final Staff other = (Staff) obj;
        if (!Objects.equals(this.nationalId, other.nationalId)) {
            return false;
        }
        return Objects.equals(this.staffId, other.staffId);
    }
}
