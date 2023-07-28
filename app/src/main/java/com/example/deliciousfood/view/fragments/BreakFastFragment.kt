package com.example.deliciousfood.view.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.deliciousfood.view.activities.FoodDetailsActivity
import com.example.deliciousfood.models.FoodModel
import com.example.deliciousfood.utils.FoodUtils.getBreakfastRecipes
import com.example.deliciousfood.view.adapters.RecipeAdapter
import com.example.deliciousfood.databinding.FragmentBreakFastBinding


class BreakFastFragment : Fragment() {
    lateinit var binding: FragmentBreakFastBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentBreakFastBinding.inflate(inflater, container, false)
        val root: View = binding.getRoot()
        //Functions To Call

        val breakfastRecipeList = getBreakfastRecipes()

        val adapter = RecipeAdapter(requireContext(), breakfastRecipeList)
        binding.listViewRecipes.setAdapter(adapter)

        binding.listViewRecipes.setOnItemClickListener { parent, view, position, id ->
            // Handle item click here, for example, show a toast with the selected recipe's name
            val selectedRecipe: FoodModel = breakfastRecipeList.get(position)
            startActivity(Intent(requireContext(), FoodDetailsActivity::class.java).putExtra("name",selectedRecipe.name).putExtra("difficulty",selectedRecipe.difficulty).putExtra("type",selectedRecipe.type).putExtra("ingredients",selectedRecipe.ingredients).putExtra("noOfPeople",selectedRecipe.noOfPeople.toString()))
        }
        return root
    }

}