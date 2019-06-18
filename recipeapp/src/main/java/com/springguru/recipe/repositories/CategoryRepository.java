package com.springguru.recipe.repositories;

import com.springguru.recipe.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
