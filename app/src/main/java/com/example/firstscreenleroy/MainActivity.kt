package com.example.firstscreenleroy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image_url = arrayListOf<String>(
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/82325622.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/82019008.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/82187261.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/81953829.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/13654484.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/82306061.jpg"
        )
        Picasso.get().load(image_url[1]).into(ivFirst)
//        val displaymetrics = resources.displayMetrics
//        var m = displaymetrics.widthPixels
//        m += R.integer.width
//    textView2.text = m.toString()

    }
}