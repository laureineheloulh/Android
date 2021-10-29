package com.example.crous_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

const val CROUS_DETAIL = "BOOK_TO_CREATE_KEYCROUS_DETAIL"

class CrousDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crous_detail)
        viewDetail()
    }



    fun viewDetail() {
        /* val author = findViewById<EditText>(R.id.a_create_book_edt_author).text.toString()
     val title = findViewById<EditText>(R.id.a_create_book_edt_title).text.toString()
    val date = findViewById<EditText>(R.id.a_create_book_edt_date).text.toString()
    val book = Book(title, author, date);

    val returnIntent = Intent()
    returnIntent.putExtra(CROUS_DETAIL, book)
    setResult(RESULT_OK, returnIntent)
    finish()*/
    }
}