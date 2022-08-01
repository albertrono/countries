package com.example.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view:View){
        if (kenyacheckBox.isChecked) textresult.text="Kenya: Correct answer"
        if (tanzaniacheckBox.isChecked) textresult.text="Tanzania: Correct answer"
        if (ugandacheckBox.isChecked) textresult.text="Uganda: Incorrect answer"

    }
    fun onSelect(view: View){
        if (YesRadio.isChecked) textresults.text="Yes, am certified"
        if (NoRadio.isChecked) textresults.text="No, am not certified"
        if (Notradio.isChecked) textresults.text="Not, I dont no"
    }



    }
