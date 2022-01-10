package EMarketV3.EMarketV3.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ORDER_LINE")
public class OrderLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLine;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    private int quantity;
    private double price;

    public OrderLine() {
    }

    public OrderLine(Order ordered, Product product, int quantity, double price) {
        super();
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getIdLine() {
        return idLine;
    }

    public void setIdLine(Long idLine) {
        this.idLine = idLine;
    }

    public Order getOrdered() {
        return order;
    }

    public void setOrdered(Order ordered) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
