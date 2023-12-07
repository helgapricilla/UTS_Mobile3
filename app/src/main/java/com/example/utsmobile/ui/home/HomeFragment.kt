package com.example.utsmobile.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.utsmobile.R
import com.example.utsmobile.databinding.FragmentHomeBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.utsmobile.Category



class HomeFragment : Fragment() {

    private lateinit var recyclerViewAdapter: CategoryAdapter
    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        recyclerViewAdapter = CategoryAdapter(createCategories())
        recyclerView.adapter = recyclerViewAdapter
    }
    private fun createCategories(): List<Category> {
        val categories = mutableListOf<Category>()
        categories.add(Category(R.drawable.yoga, "Yoga"))
        categories.add(Category(R.drawable.gym, "Gym"))
        categories.add(Category(R.drawable.cardio, "Cardio"))
        categories.add(Category(R.drawable.stretch, "Stretch"))
        categories.add(Category(R.drawable.fullbody, "Full Body"))

        // Add more categories as needed
        return categories
    }


}