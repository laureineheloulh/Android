package com.example.crous_project

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import android.widget.Button
import android.widget.EditText


class CreateCrousFragment : Fragment() {
    private lateinit var crousCreatorListener: CrousCreator
    private lateinit var nameEdt: EditText
    private lateinit var typeEdt: EditText
    private lateinit var zoneEdt: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_create_crous, container, false)

        nameEdt = rootView.findViewById<EditText>(R.id.f_create_crous_edt_name)
        typeEdt = rootView.findViewById<EditText>(R.id.f_create_crous_edt_type)
        zoneEdt = rootView.findViewById<EditText>(R.id.f_create_crous_edt_zone)

        rootView.findViewById<Button>(R.id.f_create_crous_btn_save).setOnClickListener {
            saveCrous()
        }

        ObjectAnimator.ofFloat(
            rootView.findViewById(R.id.f_create_crous_lyt_form_container),
            "translationY",
            600f,
            0f
        )
            .apply {
                interpolator = BounceInterpolator()
                duration = 700
                start()
            }


        return rootView
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is CrousCreator) {
            crousCreatorListener = context
        } else {
            throw RuntimeException("$context must implement MyActivityCallback")
        }
    }

    private fun saveCrous() {
        val name = nameEdt.text.toString()
        val type = typeEdt.text.toString()
        val zone = zoneEdt.text.toString()
        val crous = Crous("11p",name, type, zone,"okk",false,null,42.5,15.2,"info","adress" )
        crousCreatorListener.onCrousCreated(crous)


    }


    companion object {
        @JvmStatic
        fun newInstance() = CreateCrousFragment()
    }

}