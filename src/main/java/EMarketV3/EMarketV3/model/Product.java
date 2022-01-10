package EMarketV3.EMarketV3.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="PRODUCT")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @NotEmpty
    @Size(min=4, max=15)
    private String designation;
    private String description;
    private double price;
    private int quantity;
    private boolean selected;
    private String photo;
    @ManyToOne
    @JoinColumn(name="idCategory")
    private Category category;

    public Product( String designation, String description, double price, int quantity, boolean selected, String photo) {
        super();
        this.designation = designation;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.selected = selected;
        this.photo = photo;
    }

    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getIdProduct() {
        return productId;
    }

    public void setIdProduct(Long idProduct) {
        this.productId = productId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
