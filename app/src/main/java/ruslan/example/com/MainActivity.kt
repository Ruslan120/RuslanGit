package ruslan.example.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openNewYear(view: View) {
        val newYear = Intent (this, newYearText::class.java)
        startActivity(newYear)
    }
    fun openPictures(view: View) {
        val pictures = Intent (this, Pictures::class.java)
        startActivity(pictures)
    }
    fun openWhatIs(view: View) {
        val whatIs = Intent (this, WhatIsPicture::class.java)
        startActivity(whatIs)
    }
}
