package EMarketV3.EMarketV3.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="CATEGORY")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long categoryId;

    @NotEmpty
    @Size(min=4, max=15)
    private String categoryName;
    @Size(min=3, max=15)
    private String description;
    @Lob
    private byte[] photo;
    private String photoName;

    @OneToMany(mappedBy="category")
    private List<Product> products;

    public Category(String categoryName, String description, byte[] photo, String photoName, List<Product> products) {
        super();
        this.categoryName = categoryName;
        this.description = description;
        this.photo = photo;
        this.photoName = photoName;
        this.products = products;
    }

    public Category() {
        super();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
