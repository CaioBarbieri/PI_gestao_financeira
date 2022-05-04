package com.example.pigestofinanceira.toolbarmenu


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.pigestofinanceira.R
import com.example.pigestofinanceira.databinding.ActivityToolbarMenuBinding
import com.example.pigestofinanceira.fragments.*


class ToolbarMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityToolbarMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarMenuBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_toolbar_menu)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbarmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.listadesejos -> {
                val frag = ListaDesejosFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            R.id.calculadora -> {
                val frag = CalculadoraFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            R.id.sobre -> {
                val frag = SobreFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            else -> {
                val frag = ConfiguracoesFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}