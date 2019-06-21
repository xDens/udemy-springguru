package com.springguru.recipe.controller;

import com.springguru.recipe.entity.Category;
import com.springguru.recipe.entity.UnitOfMeasure;
import com.springguru.recipe.repositories.CategoryRepository;
import com.springguru.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {
    private static Logger LOG = Logger.getLogger("IndexController");

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @GetMapping("/")
    public String index() {
        Optional<Category> catOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        LOG.log(Level.INFO, "Category ID is: " + catOptional.get().getId());
        return "index";
    }

}
