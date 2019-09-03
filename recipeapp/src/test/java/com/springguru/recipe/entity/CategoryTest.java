package com.springguru.recipe.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long id = 4l;

        category.setId(id);

        assertTrue(category.getId().equals(id));
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}