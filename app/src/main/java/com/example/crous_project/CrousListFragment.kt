package com.example.crous_project

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val ARG_CROUS = "crous"

class CrousListFragment : Fragment() {
    private lateinit var crous: ArrayList<Crous>
    private lateinit var adapter: CrousAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val argCrous = requireArguments().getSerializable(ARG_CROUS) as ArrayList<Crous>?
        crous = argCrous ?: ArrayList()
        adapter = CrousAdapter(crous)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_crous_list, container, false)
        val rcvCrous = view.findViewById<RecyclerView>(R.id.f_crous_list_rcv_crous)
        rcvCrous.layoutManager = LinearLayoutManager(context)
        rcvCrous.adapter = adapter


        return view;
    }

    companion object {
        @JvmStatic
        fun newInstance(crous: ArrayList<Crous>) =
            CrousListFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_CROUS, crous)
                }
            }
    }




}