package com.springguru.recipe.repositories;

import com.springguru.recipe.entity.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
