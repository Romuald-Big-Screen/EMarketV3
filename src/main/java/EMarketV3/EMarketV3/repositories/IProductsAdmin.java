package EMarketV3.EMarketV3.repositories;

import EMarketV3.EMarketV3.model.Product;

public interface IProductsAdmin extends ISurfer {
    public Long addProduct(Product p,Long catId);
    public void deleteProduct(Long pId);
    public void updateProduct(Product p);
}
