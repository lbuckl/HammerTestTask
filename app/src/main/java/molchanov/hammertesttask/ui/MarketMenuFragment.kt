package molchanov.hammertesttask.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gb.weather.view.weatherlist.WeatherListRecyclerAdapter
import molchanov.hammertesttask.databinding.FragmentMarketMenuBinding
import molchanov.hammertesttask.viewmodel.MenuListAppState
import molchanov.hammertesttask.viewmodel.MenuListViewModel

class MarketMenuFragment:Fragment() {

    companion object {
        lateinit var viewModel: MenuListViewModel
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
        _binding = FragmentMarketMenuBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MenuListViewModel::class.java]
        viewModel.getLiveData().observe(viewLifecycleOwner) { t -> renderData(t) }
    }

    private fun renderData(menuListAppState: MenuListAppState){
        when (menuListAppState){
            is MenuListAppState.Succes ->{
                binding.recyclerview.adapter = WeatherListRecyclerAdapter(menuListAppState.menuListDTO)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}