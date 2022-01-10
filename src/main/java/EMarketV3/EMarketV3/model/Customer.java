package EMarketV3.EMarketV3.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name="CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @Size(min=5 , max = 20)
    private String customerName;
    private String address;
    @Email
    private String email;
    private String phone;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public Customer(String nameCustomer, String address, String email, String phone) {
        super();
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Customer() {
        super();

    }

    public Long getIdCustomer() {
        return customerId;
    }

    public void setIdCustomer(Long idCustomer) {
        this.customerId = idCustomer;
    }

    public String getNameCustomer() {
        return customerName;
    }

    public void setNameCustomer(String nameCustomer) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
