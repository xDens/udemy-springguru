package com.springguru.recipe.controller;

import com.springguru.recipe.service.RecipeService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    //private static Logger LOG = Logger.getLogger("IndexController");

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }

}
