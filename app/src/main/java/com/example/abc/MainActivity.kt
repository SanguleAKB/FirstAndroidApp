package com.example.abc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btnOne)
        val buttonEdu = findViewById<Button>(R.id.btnTwo)
        val buttonWork = findViewById<Button>(R.id.btnThree)

        buttonSkills.setOnClickListener(){

            intent = Intent(this,SkillsActivity::class.java)

            startActivity(intent)


        }

        buttonEdu.setOnClickListener(){

            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }

        buttonWork.setOnClickListener(){

            intent = Intent(this,WorkActivity::class.java)
        }
    }
}