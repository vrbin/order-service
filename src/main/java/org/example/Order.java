package org.example;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;
    private String firstName;
    private String lastName;
    private String productRefs;
    public Order() {}

    public Order(long id, String firstName, String lastName, String productRefs) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.productRefs = productRefs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProductRefs() {
        return productRefs;
    }

    public void setProductRefs(String productRefs) {
        this.productRefs = productRefs;
    }
}
