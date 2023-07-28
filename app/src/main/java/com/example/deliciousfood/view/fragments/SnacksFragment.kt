package com.example.deliciousfood.view.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.deliciousfood.view.activities.FoodDetailsActivity
import com.example.deliciousfood.models.FoodModel
import com.example.deliciousfood.utils.FoodUtils.getSnacksRecipes
import com.example.deliciousfood.view.adapters.RecipeAdapter
import com.example.deliciousfood.databinding.FragmentSnacksBinding

class SnacksFragment : Fragment() {
    lateinit var binding: FragmentSnacksBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSnacksBinding.inflate(inflater, container, false)
        val root: View = binding.getRoot()
        //Functions To Call

        val snacksRecipeList = getSnacksRecipes()

        val adapter = RecipeAdapter(requireContext(), snacksRecipeList)
        binding.listViewRecipes.setAdapter(adapter)

        binding.listViewRecipes.setOnItemClickListener { parent, view, position, id ->
            // Handle item click here, for example, show a toast with the selected recipe's name
            val selectedRecipe: FoodModel = snacksRecipeList.get(position)
            startActivity(Intent(requireContext(), FoodDetailsActivity::class.java).putExtra("name",selectedRecipe.name).putExtra("difficulty",selectedRecipe.difficulty).putExtra("type",selectedRecipe.type).putExtra("ingredients",selectedRecipe.ingredients).putExtra("noOfPeople",selectedRecipe.noOfPeople.toString()))
        }
        return root
    }
}