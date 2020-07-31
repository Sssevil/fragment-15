package com.example.homework15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseClass(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setClick()
    }

    private fun setClick() {
        btn1.setOnClickListener(this)
        btn2.setOnClickListener (this)
    }

    override fun onClick(view: View?) {
        val url=url.text.toString()
        val phone=tel.text.toString().toInt()
        when(view?.id){
            R.id.btn1-> {
                setupUrls()
                val intent=Intent(Intent.ACTION_VIEW, Uri.parse("http:$url"))
                startActivity(intent)
            }
            R.id.btn2->{
                setupNumber()
                val intent=Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phone"))
                startActivity(intent)
            }

        }
    }
}