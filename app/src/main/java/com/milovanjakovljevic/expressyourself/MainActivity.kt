package com.milovanjakovljevic.expressyourself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ime:String = "Milovan"
        val godinaRodjenja=1999
        var trenutnaGodina = 2023
        var godine:Int

        godine = trenutnaGodina-godinaRodjenja
        Log.i("Info","$ime ima $godine godina")
        trenutnaGodina++

        Log.i("Info","Sledece godine ce imati ${trenutnaGodina-godinaRodjenja} godina")

    }
}