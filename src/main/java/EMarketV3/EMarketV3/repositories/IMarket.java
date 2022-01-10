package EMarketV3.EMarketV3.repositories;

import EMarketV3.EMarketV3.model.*;

import java.util.List;

public interface IMarket {
    /* CATEGORIE  */
    public Long addCategory(Category c );
    public List<Category> listCategories();
    public Category getCategory(Long catId);
    public void deleteCategory(Long catId);
    public void updateCategory(Category c);
    /* PRODUIT  */
    public Long addProduct(Product p, Long  catId);
    public List<Product> listProducts();
    public List<Product> listProductsByKw(String kw);
    public List<Product> listProductsSelected();
    public List<Product> listProductsByCategory(Long catId);
    public Product getProduct(Long pId);
    public void deleteProduct(Long pId);
    public void updateProduct(Product p);

    /* USER  */
    public void addUser(User u );
    public void attributeRole(Role r, Long userId);
    public Order saveOrder(Cart ca , Customer c);
}
