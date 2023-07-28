package com.example.deliciousfood.view.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.deliciousfood.view.activities.FoodDetailsActivity
import com.example.deliciousfood.models.FoodModel
import com.example.deliciousfood.utils.FoodUtils
import com.example.deliciousfood.view.adapters.RecipeAdapter
import com.example.deliciousfood.databinding.FragmentDinnerBinding

class DinnerFragment : Fragment() {
    lateinit var binding: FragmentDinnerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDinnerBinding.inflate(inflater, container, false)
        val root: View = binding.getRoot()

        val dinnerRecipeList = FoodUtils.getDinnerRecipes()
        val adapter = RecipeAdapter(requireContext(), dinnerRecipeList)
        binding.listViewRecipes.setAdapter(adapter)

        binding.listViewRecipes.setOnItemClickListener { parent, view, position, id ->
            // Handle item click here, for example, show a toast with the selected recipe's name
            val selectedRecipe: FoodModel = dinnerRecipeList.get(position)
            startActivity(Intent(requireContext(), FoodDetailsActivity::class.java).putExtra("name",selectedRecipe.name).putExtra("difficulty",selectedRecipe.difficulty).putExtra("type",selectedRecipe.type).putExtra("ingredients",selectedRecipe.ingredients).putExtra("noOfPeople",selectedRecipe.noOfPeople.toString()))
        }
        return root
    }
}