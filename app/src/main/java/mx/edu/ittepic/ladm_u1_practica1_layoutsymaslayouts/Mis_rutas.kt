package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityMisRutasBinding

class Mis_rutas : AppCompatActivity() {

    private lateinit var binding: ActivityMisRutasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMisRutasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_mis_rutas)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        val bundle = intent.extras
        val cadena = bundle?.getString("cadena")
        Toast.makeText(this,cadena,Toast.LENGTH_LONG).show()
    }
}