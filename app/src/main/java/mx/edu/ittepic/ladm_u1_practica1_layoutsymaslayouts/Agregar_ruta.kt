package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityAgregarRutaBinding

class Agregar_ruta : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityAgregarRutaBinding
    var cadena = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgregarRutaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

       /* val navController = findNavController(R.id.nav_host_fragment_content_agregar_ruta)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)*/


        //Aquí está el botón pa agregrar
        binding.fab.setOnClickListener { view ->
            if (binding.ruta.text.isEmpty() || binding.precio.text.isEmpty() || binding.fecha.text.isEmpty()){
                Toast.makeText(this,"TIENES QUE LLENAR TODOS LOS CAMPOS", Toast.LENGTH_LONG).show()
            }else{
                cadena = binding.ruta.text.toString()+" "+binding.precio.text.toString()+" "+binding.fecha.text.toString()
                val intent = Intent(this, Mis_rutas::class.java)
                intent.putExtra("cadena",cadena)
                startActivity(intent)
            }
        }

    }

    /*override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_agregar_ruta)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }*/
}