package com.example.deliciousfood.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.deliciousfood.models.FoodModel
import com.example.deliciousfood.R


class RecipeAdapter(context: Context?, recipes: ArrayList<FoodModel>) :
    ArrayAdapter<FoodModel>(context!!, 0, recipes) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        if (convertView == null) {
            convertView =
                LayoutInflater.from(context).inflate(R.layout.recipe_list, parent, false)
        }

        val recipe: FoodModel? = getItem(position)
        val nameTextView: TextView = convertView!!.findViewById(R.id.textViewRecipeName)

        if (recipe != null) {
            nameTextView.text = recipe.name.toString() + " - " + recipe.noOfPeople.toString()+" People"
        }

        return convertView
    }
}

