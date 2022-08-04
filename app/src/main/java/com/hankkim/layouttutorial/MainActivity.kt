package com.hankkim.layouttutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLinearHor: Button = findViewById<Button>(R.id.btnLinearHor)
        btnLinearHor.setOnClickListener {
            val intent = Intent(this, LinearLayoutHorizontal::class.java)
            startActivity(intent)
        }
        val btnLinearVer: Button = findViewById<Button>(R.id.btnLinearVer)
        btnLinearVer.setOnClickListener {
            val intent = Intent(this, LinearLayoutVertical::class.java)
            startActivity(intent)
        }
        val btnRelative: Button = findViewById<Button>(R.id.btnRelative)
        btnRelative.setOnClickListener {
            val intent = Intent(this, RelativeLayout::class.java)
            startActivity(intent)
        }
        val btnTable: Button = findViewById<Button>(R.id.btnTable)
        btnTable.setOnClickListener {
            val intent = Intent(this, TableLayout::class.java)
            startActivity(intent)
        }
        val btnFrame: Button = findViewById<Button>(R.id.btnFrame)
        btnFrame.setOnClickListener {
            val intent = Intent(this, FrameLayout::class.java)
            startActivity(intent)
        }
        val btnDrawer: Button = findViewById<Button>(R.id.btnDrawer)
        btnDrawer.setOnClickListener {
            val intent = Intent(this, DrawerLayout::class.java)
            startActivity(intent)
        }
        val btnConstraint: Button = findViewById<Button>(R.id.btnConstraint)
        btnConstraint.setOnClickListener {
            val intent = Intent(this, ConstraintLayout::class.java)
            startActivity(intent)
        }
    }
}