package EMarketV3.EMarketV3.repositories;

import EMarketV3.EMarketV3.model.*;

import java.util.List;

public interface ISurfer {
    public List<Category> listCategories();
    public Category getCategory(Long catId);
    public List<Product> listProducts();
    public List<Product> listProductsByKw(String kw);
    public List<Product> productsByCategory(Long catId);
    public List<Product> listProductsSelected();
    public Product getProduct(Long pId);
    public Order saveOrder(Cart ca, Customer c);
}
