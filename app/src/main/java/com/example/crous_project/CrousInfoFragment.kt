package com.example.crous_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

private const val ARG_INFO = "info"

class CrousInfoFragment : Fragment() {
    private lateinit var crous: ArrayList<Crous>
    private lateinit var adapter : CrousAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //  val argBooks = requireArguments().getSerializable(ARG_BOOKS) as ArrayList<Book>?
        // books = argBooks ?: ArrayList()
        //  adapter = CrousAdapter(crous)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_crous_info, container, false)

        //  val rcvBooks = view.findViewById<RecyclerView>(R.id.f_crous_info_rcv_info)
        //rcvBooks.layoutManager = LinearLayoutManager(context)
        // rcvBooks.adapter = adapter

        return view;
    }

    /*
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CrousInfoFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_BOOKS, books)
                }
            }
    }
    */
}