package com.springguru.recipe.service;

import com.springguru.recipe.entity.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
