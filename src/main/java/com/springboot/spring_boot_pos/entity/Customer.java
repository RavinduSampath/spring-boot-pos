package com.springboot.spring_boot_pos.entity;


import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Type;

import java.util.ArrayList;

@Entity//data base ekk kiiyal kiyanne
@Table(name="customer")//datbase eke tble ek penn ona vidiya me thiyenne
//@TypeDefs({
//    @TypeDef(name = "json", typeClass = JsonType.class)
//})

public class Customer {
    @Id//primary key ek intial karal denne mehem
    @Column(name="customer_id",length = 45)//me import karal thiyenne table eke me colomn eke nam penn ona mehemai kiyan eka me kiyal thiyenne primary key ek kiyal kiyal thinyan nisa not null kiyal dan on na
    private int customerId;
    @Column(name="customer_name",length = 100,nullable = false)
    private String customerName;
    @Column(name="customer_address",length = 255)
    private String customerAddress;

    @Column(name="customer_salary",length = 10)
    private double customerSalary;

    //@Type(type="json")
    @Column(name="contact_numbers",length = 10,columnDefinition = "json")
    private String contactNumber;//meka arraylist kiyl gahuva nam numbers deka thunak denn puluvan eth e dependancy ek mage vada na hemin hoya ganimu

    @Column(name="nic",length = 10)
    private String nic;

    @Column(name="active",columnDefinition = "TINYINT default 1")//meek boolian vagem ekk dekam ekam vage thamai vada default ekk dila thiyenne value ekk ave nathoth eka danna kiyala
    private boolean active;


    //public Customer() {}    me thiyen no argument constracter ekk


    public Customer(int customerId, String customerName, String customerAddress, double coustomerSalary, String contactNumber, String nic, boolean active) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerSalary = coustomerSalary;
        this.contactNumber = contactNumber;
        this.nic = nic;
        this.active = active;
    }//me all argument constracter ekk

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getCoustomerSalary() {
        return customerSalary;
    }

    public void setCoustomerSalary(double coustomerSalary) {
        this.customerSalary = coustomerSalary;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", coustomerSalary=" + customerSalary +
                ", contactNumber='" + contactNumber + '\'' +
                ", nic='" + nic + '\'' +
                ", active=" + active +
                '}';
    }
}
