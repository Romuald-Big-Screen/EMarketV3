package EMarketV3.EMarketV3.service;

import EMarketV3.EMarketV3.model.*;
import EMarketV3.EMarketV3.repositories.ICategoriesAdmin;
import EMarketV3.EMarketV3.repositories.IMarket;

import java.util.List;

public class AdminService implements ICategoriesAdmin {

    private IMarket market;

    @Override
    public Long addCategory(Category c) {
        return market.addCategory(c);
    }

    @Override
    public void deleteCategory(Long catId) {
        market.deleteCategory(catId);
    }

    @Override
    public void updateCategory(Category c) {
        market.updateCategory(c);
    }

    @Override
    public void addUser(User u) {
        market.addUser(u);
    }

    @Override
    public void attributeRole(Role r, Long userId) {
        market.attributeRole(r,userId);
    }

    @Override
    public Long addProduct(Product p, Long catId) {
        return market.addProduct(p, catId);
    }

    @Override
    public void deleteProduct(Long pId) {
        market.deleteProduct(pId);
    }

    @Override
    public void updateProduct(Product p) {
        market.updateProduct(p);
    }

    @Override
    public List<Category> listCategories() {
        return market.listCategories();
    }

    @Override
    public Category getCategory(Long catId) {
        return market.getCategory(catId);
    }

    @Override
    public List<Product> listProducts() {
        return market.listProducts();
    }

    @Override
    public List<Product> listProductsByKw(String kw) {
        return market.listProductsByKw(kw);
    }

    @Override
    public List<Product> productsByCategory(Long catId) {
        return market.listProductsByCategory(catId);
    }

    @Override
    public List<Product> listProductsSelected() {
        return market.listProductsSelected();
    }

    @Override
    public Product getProduct(Long pId) {
        return market.getProduct(pId);
    }

    @Override
    public Order saveOrder(Cart ca, Customer c) {
        return market.saveOrder(ca, c);
    }
}
