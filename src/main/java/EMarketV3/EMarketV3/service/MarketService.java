package EMarketV3.EMarketV3.service;

import EMarketV3.EMarketV3.model.*;
import EMarketV3.EMarketV3.repositories.IMarket;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

public class MarketService implements IMarket {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Long addCategory(Category c) {
        return c.getCategoryId();
    }

    @Override
    public List<Category> listCategories() {
        Query req=em.createQuery("select c from Category c");
        return req.getResultList();
    }

    @Override
    public Category getCategory(Long catId) {
        return em.find(Category.class,catId);
    }

    @Override
    public void deleteCategory(Long catId) {
        Category c=em.find(Category.class, catId);
        em.remove(c);
    }

    @Override
    public void updateCategory(Category c) {
        em.merge(c);
    }

    @Override
    public Long addProduct(Product p, Long catId) {
        Category c=getCategory(catId);
        p.setCategory(c);
        em.persist(p);
        return p.getIdProduct();
    }

    @Override
    public List<Product> listProducts() {
        Query req=em.createQuery("select p from `Product` p");
        return req.getResultList();
    }

    @Override
    public List<Product> listProductsByKw(String kw) {
        Query req=em.createQuery("select p from `Product` p where p.designation like  :x or p.description like :x");
        req.setParameter("x", "%"+kw+"%");
        return req.getResultList();
    }

    @Override
    public List<Product> listProductsSelected() {
        Query req=em.createQuery("select p from `Product` p where p.selected=true");
        return req.getResultList();
    }

    @Override
    public List<Product> listProductsByCategory(Long catId) {
        Query req=em.createQuery("select p from `Product` p where p.category.categoryId=:x");
        req.setParameter("x", catId);
        return req.getResultList();
    }

    @Override
    public Product getProduct(Long pId) {

        return em.find(Product.class, pId);
    }

    @Override
    public void deleteProduct(Long pId) {
        Product p=getProduct(pId);
        em.remove(p);
    }

    @Override
    public void updateProduct(Product p) {
        em.merge(p);
    }

    @Override
    public void addUser(User u) {
        em.persist(u);
    }

    @Override
    public void attributeRole(Role r, Long userId) {
        User u=em.find(User.class, userId);
        u.getRoles().add(r);
        em.persist(r);
    }

    @Override
    public Order saveOrder(Cart ca, Customer c) {
        em.persist(c);
        Order o=new Order();
        o.setOrderDate(new Date());
        o.setItems(ca.getItems());
        for(OrderLine ol:ca.getItems()){
            em.persist(ol);
        }
        em.persist(o);
        return o;
    }
}
