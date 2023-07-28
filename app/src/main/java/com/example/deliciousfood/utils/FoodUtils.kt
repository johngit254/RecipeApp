
package com.example.deliciousfood.utils

import com.example.deliciousfood.models.FoodModel

object FoodUtils {
    fun getBreakfastRecipes(): ArrayList<FoodModel>
    {
        val breakfastFoodList: ArrayList<FoodModel> = ArrayList()
        breakfastFoodList.add(FoodModel("Omelette","Breakfast","Beginner","Eggs, Milk, Cheese, Onions, Mushrooms, Salt, Black Pepper.",2))
        breakfastFoodList.add(FoodModel("Pancakes","Breakfast","Intermediate","Flour, Milk, Eggs, Baking Powder, Salt, Butter.",5))
        breakfastFoodList.add(FoodModel("Avocado Toast","Breakfast","Advanced","Bread, Avocado, Salt, Black Pepper, Lemon Juice, Red Pepper Flakes.",10))

        return breakfastFoodList
    }
    fun getLunchRecipes(): ArrayList<FoodModel>
    {
        val lunchFoodList: ArrayList<FoodModel> = ArrayList()

        lunchFoodList.add(FoodModel("Rice+Beans","Lunch","Beginner","Rice, Beans, Tomatoes, Onions, Salt (optional).",2))
        lunchFoodList.add(FoodModel("Chapo Beef","Lunch","Intermediate","Flour, Baking Powder, Oil, Butternut, Beef, Onions, Tomatoes",5))
        lunchFoodList.add(FoodModel("Ugali Beef","Lunch","Advanced","Maize Flour, Cooking Oil, Beef, Tomato, Cucumber, Onion.",10))

        return lunchFoodList
    }
    fun getDinnerRecipes(): ArrayList<FoodModel>
    {
        var dinnerFoodList: ArrayList<FoodModel> = ArrayList()

        dinnerFoodList.add(FoodModel("Ugali+Mayai","Dinner","Beginner"," Maize Flour, Eggs, Onion, Tomato, Cooking Oil,",2))
        dinnerFoodList.add(FoodModel("Rice+Chicken","Dinner","Intermediate","Chicken, Lemon, Rice, Salt, Black Pepper, Coconut Oil.",5))
        dinnerFoodList.add(FoodModel("Pilau+Beef","Dinner","Advanced","Rice, Pilau Masala, Beef, Garlic, Paprika,Soy Sauce.",10))

        return dinnerFoodList
    }
    fun getSnacksRecipes(): ArrayList<FoodModel>
    {
        var snacksFoodList: ArrayList<FoodModel> = ArrayList()

        snacksFoodList.add(FoodModel("Chips","Snacks","Beginner","Potatoes, Cooking Oil, Salt,",2))
        snacksFoodList.add(FoodModel("Samosa","Snacks","Intermediate","Flour, Minced Meat, Pepper,",5))
        snacksFoodList.add(FoodModel("Burger","Snacks","Advanced"," Buns, Burger Meat, Cheese, Lettuce,Cherry Tomatoes, Ketchup.",10))

        return snacksFoodList
    }}