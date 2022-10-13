package molchanov.hammertesttask.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import molchanov.hammertesttask.databinding.FragmentMarkertMenuBinding

class MarketMenuFragment:Fragment() {

    companion object {
        //lateinit var viewModel: WeatherListViewModel
        fun newInstance() = MarketMenuFragment()
    }

    private var _binding: FragmentMarkertMenuBinding? = null
    private val binding: FragmentMarkertMenuBinding
    get() {
        return _binding!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        Log.v("@@@","Start")
        _binding = FragmentMarkertMenuBinding.inflate(inflater)

        //binding.collapsingToolbar.title = "Test Title"
        return binding.root
    }
}