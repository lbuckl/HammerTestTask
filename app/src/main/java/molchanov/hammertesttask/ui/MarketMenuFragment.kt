package molchanov.hammertesttask.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gb.weather.domain.Weather
import com.gb.weather.domain.getCities
import com.gb.weather.view.weatherlist.WeatherListRecyclerAdapter
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v("@@@","getCities")
        binding.recyclerview.adapter = WeatherListRecyclerAdapter(getCities())
    }
}