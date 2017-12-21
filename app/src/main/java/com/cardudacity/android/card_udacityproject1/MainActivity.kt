package com.cardudacity.android.card_udacityproject1

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_cont.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToGame(v: View) {

     var intent:Intent = Intent(android.content.Intent.ACTION_VIEW)
        intent.setData(Uri.parse("https://github.com/suwalszczyzna/MadTadpoles/"))
        var chooser: Intent = Intent.createChooser(intent, "www")
        startActivity(intent)
    }


    fun goToNextLayout(v:View){

        var btn = v.id
        println("zmienna $btn")

        if (btn == myButtonLRL.id)
        {
            setContentView(R.layout.activity_cont)
        }
        if (btn == myButtonCL.id)
        {
            setContentView(R.layout.activity_main)
        }

//        var intent:Intent = Intent(context, DestActivity::class.java)
//        startActivity(intent)

    }
}
