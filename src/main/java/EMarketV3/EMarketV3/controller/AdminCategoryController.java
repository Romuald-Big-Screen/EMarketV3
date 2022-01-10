package EMarketV3.EMarketV3.controller;

import EMarketV3.EMarketV3.repositories.ICategoriesAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/catAdmin")
public class AdminCategoryController {
    @Autowired
    private ICategoriesAdmin service;
    @RequestMapping(value ="/index")
    public String index(Model model){
         return "addCategories";
    }

}
