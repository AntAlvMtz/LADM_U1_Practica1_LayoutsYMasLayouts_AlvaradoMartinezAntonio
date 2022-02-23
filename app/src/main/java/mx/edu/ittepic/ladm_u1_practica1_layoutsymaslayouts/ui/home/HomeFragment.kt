package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    var vector = ArrayList<String>()
    var mensaje = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        if(vector.size<=0) mensaje = "NO HAY RUTAS POR MOSTRAR"
        else mensaje = "LISTA DE RUTAS TOMADAS"

        binding.texto.setText(mensaje)


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}