package com.example.crous_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), CrousCreator {
    private var TAG = MainActivity::class.java.simpleName
    private val listCrous = ListCrous()
    private val MINIR = Crous(
        id = "r486",
        name = "MINI R",
        type = "Cafétéria",
        zone = "Orléans",
        description = "Situé dans le hall du bâtiment",
        favorite = false,
        linkPhoto = "http://www.stockcrous.fr/Photos%20stuctures/500x/Orleans/Campus/CAFETERIAS/MINI%20R/MINI%20R.jpg",
        latitude = 47.845765,
        longitude = 1.936779,
        info = "Localisation Situé dans le hall",
        adress = "MINI R Campus 45000 Orléans"
    )

    private val RULahitolle = Crous(
        id = "r782",
        name = "RULahitolle",
        type = "Restaurant",
        zone = "Bourges",
        description = "Situé près de l'INSA et de l'antenne ",
        favorite = false,
        linkPhoto = "http://www.stockcrous.fr/Photos%20stuctures/500x/Bourges/RU%20LAHITOLLE/RU_lahitolle.jpeg",
        latitude = 47.0810645,
        longitude = 2.414766,
        info = "Localisation Situé près de l'INSA",
        adress = "RU Lahitolle 15 rue Maurice Roy 1800"
    )
    private val LAnatidé = Crous(
        id = "r481",
        name = "L'Anatidé",
        type = "Restaurant",
        zone = "Orléans",
        description = "Situé près du collegium Sciences",
        favorite = false,
        linkPhoto = "http://www.stockcrous.fr/Photos%20stuctures/500x/Orleans/Campus/CAFETERIAS/MINI%20R/MINI%20R.jpg",
        latitude = 47.845765,
        longitude = 1.936779,
        info = "Localisation Situé dans le hall",
        adress = "L'Anatidé Campus 45000 Orléans"
    )
    private lateinit var btnCreateCrous: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listCrous.addCrous(MINIR)
        listCrous.addCrous(RULahitolle)
        listCrous.addCrous(LAnatidé)

        btnCreateCrous = findViewById(R.id.a_main_btn_create_crous)

        btnCreateCrous.setOnClickListener {
            displayCreateCrous()
        }

        displayCrousList()
    }
    private fun displayCrousList() {
        btnCreateCrous.visibility = View.VISIBLE
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment = CrousListFragment.newInstance(listCrous.getAllCrous())
        fragmentTransaction.replace(R.id.a_main_lyt_fragment_container, fragment)
        fragmentTransaction.commit()
    }


    /*override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.main_menu_delete -> {
                bookshelf.clear()
                displayBookList()
                true
            }
            // If we got here, the user's action was not recognized.
            else -> super.onOptionsItemSelected(item)
        }
    }*/

    private fun displayCreateCrous() {
        btnCreateCrous.visibility = View.GONE
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment = CreateCrousFragment.newInstance()
        fragmentTransaction.replace(R.id.a_main_lyt_fragment_container, fragment)
        fragmentTransaction.commit()
    }

    override fun onCrousCreated(crous: Crous) {
        listCrous.addCrous(crous);
        displayCrousList()
    }
}