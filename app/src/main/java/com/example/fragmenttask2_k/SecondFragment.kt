package com.example.fragmenttask2_k

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val textView: TextView = view.findViewById(R.id.textView)
        //fetch data
        val args = this.arguments
        val inputData = args?.get("data")
        textView.text = inputData.toString()
        return view
    }
}