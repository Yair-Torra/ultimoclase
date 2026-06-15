package com.example.ultimoclase

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val toolbar =
            findViewById<Toolbar>(R.id.topAppBar)
        setSupportActionBar(toolbar);
    }
    fun onClickFAB(view: View) {
        Toast.makeText(this, "Floating Action Button Clicked", Toast.LENGTH_LONG).show()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.mnuNuevo -> {
                Toast.makeText(this, "Click en Nuevo", Toast.LENGTH_LONG).show()
                true
            }
            R.id.mnuBuscar -> {
                Toast.makeText(this, "Click en Buscar", Toast.LENGTH_LONG).show()
                true
            }
            R.id.mnuSetting -> {
                Toast.makeText(this, "Click en Settings", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
