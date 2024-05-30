package com.inventory.model;
import java.util.Date;
import java.util.List;
import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


   // private boolean isActive;

    private String name;

    @Column(unique = true,nullable = false)
    private String userName;

    private String password;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id") // This annotation defines the foreign key column in Address table
    private List<Address> address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id") // This annotation defines the foreign key column in UserOrder table
    private List<UserOrder> order;
    
    private Role role;

   
    private String createdBy;

   
    private Date createdAt;

    private String updatedBy;
    
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<UserOrder> getOrder() {
        return order;
    }

    public void setOrder(List<UserOrder> order) {
        this.order = order;
    }

    public User() {
      
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User(String name, String userName, String password, List<Address> address, Role role, List<UserOrder> order,
            String createdBy, Date createdAt, String updatedBy, Date updatedAt) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.role = role;
        this.order = order;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

   
    // public boolean isActive() {
    //     return isActive;
    // }

    // public void setActive(boolean isActive) {
    //     this.isActive = isActive;
    // }

  
   




}
