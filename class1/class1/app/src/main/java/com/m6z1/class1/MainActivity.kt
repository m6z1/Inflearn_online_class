package com.m6z1.class1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.m6z1.class1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        //이벤트 처리
        val image1 = binding.image1
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }
        val image2 = binding.image2
        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()

            var intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }
        val image3 = binding.image3
        image3.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()

            var intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }
        val image4 = binding.image4
        image4.setOnClickListener {
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()

            var intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }
        val image5 = binding.image5
        image5.setOnClickListener {
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_LONG).show()

            var intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }
        val image6 = binding.image6
        image6.setOnClickListener {
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_LONG).show()

            var intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }
        val image7 = binding.image7
        image7.setOnClickListener {
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_LONG).show()

            var intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }

    }
}