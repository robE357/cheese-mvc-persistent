package org.launchcode.controllers;


import org.launchcode.models.data.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryDao categoryDao;

    //TODO #3 Add index handler
    @RequestMapping(value="")
    public String index(Model model) {
        model.addAttribute("title", "Categories");
        model.addAttribute("categories", categoryDao.findAll());
        return "category/index";
    }
    //TODO #4 Add "Add" handler methods
}
