package molchanov.hammertesttask.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import molchanov.hammertesttask.databinding.FragmentMarketMenuBinding

class MarketMenuFragment:Fragment() {

    companion object {
        //lateinit var viewModel: WeatherListViewModel
        fun newInstance() = MarketMenuFragment()
    }

    private var _binding: FragmentMarketMenuBinding? = null
    private val binding: FragmentMarketMenuBinding
    get() {
        return _binding!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        Log.v("@@@","Start")
        _binding = FragmentMarketMenuBinding.inflate(inflater)

        return binding.root
    }
}