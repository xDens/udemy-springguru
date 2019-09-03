package com.springguru.recipe.service;

import com.springguru.recipe.entity.Recipe;
import com.springguru.recipe.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository repository;

    //default constructor;
    public RecipeServiceImpl() {}

    public RecipeServiceImpl(RecipeRepository repository) {
        this.repository = repository;
    }

    public Set<Recipe> getRecipes() {
        return (Set<Recipe>) repository.findAll();
    }
}
