package com.example.firstscreenleroy

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


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
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/82306061.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/15163427.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/81955972.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/81955990.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/82950315.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/14149519.jpg",
            "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,h_240,c_pad,b_white,d_photoiscoming.png/LMCode/18142904.jpg"
        )
        val ivArray  = arrayListOf<ImageView>(iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12)
        for (i in 0..11) {
            Picasso.get().load(image_url[i]).into(ivArray[i])
        }


//        val displaymetrics = resources.displayMetrics
//        var m = displaymetrics.widthPixels
//        m += R.integer.width
//    textView2.text = m.toString()

    }


    fun onClickButton(view: View) {
      val toast =  Toast.makeText(applicationContext, "Кнопка нажата", Toast.LENGTH_SHORT)
        toast.show()
    }
}