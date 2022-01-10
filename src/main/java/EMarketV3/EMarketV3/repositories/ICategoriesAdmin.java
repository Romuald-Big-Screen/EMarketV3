package EMarketV3.EMarketV3.repositories;

import EMarketV3.EMarketV3.model.Category;
import EMarketV3.EMarketV3.model.Role;
import EMarketV3.EMarketV3.model.User;

public interface ICategoriesAdmin extends  IProductsAdmin {
    public Long addCategory(Category c);
    public void deleteCategory(Long catId);
    public void updateCategory(Category c);
    public void addUser(User u);
    public void attributeRole(Role r, Long userId);
}
