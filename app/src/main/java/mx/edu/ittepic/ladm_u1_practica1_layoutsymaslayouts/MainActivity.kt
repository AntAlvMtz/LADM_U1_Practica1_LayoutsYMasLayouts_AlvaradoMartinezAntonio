package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        agregaruta.setOnClickListener {
            agregarRuta()
        }

    }

    private fun agregarRuta() {
        val intent = Intent(this, Agregar_ruta::class.java)
        startActivity(intent)
    }

}