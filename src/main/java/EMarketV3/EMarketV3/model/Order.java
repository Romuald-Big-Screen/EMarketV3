package EMarketV3.EMarketV3.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="ORDER")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Date orderDate;


    @OneToMany(mappedBy="order")
    private Collection<OrderLine> items;

    @ManyToOne
    @JoinColumn(name="costumerId")
    private Customer customer;

    public Order(Date orderDate, Collection<OrderLine> items, Customer customer) {
        super();
        this.orderDate = orderDate;
        this.items = items;
        this.customer = customer;
    }

    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Collection<OrderLine> getItems() {
        return items;
    }

    public void setItems(Collection<OrderLine> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
