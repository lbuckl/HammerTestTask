package molchanov.hammertesttask.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import molchanov.hammertesttask.databinding.FragmentBasketBinding

class BasketFragment:Fragment() {
    companion object {
        fun newInstance() = BasketFragment()
    }

    private var _bindingBasket: FragmentBasketBinding? = null
    private val bindingBasket: FragmentBasketBinding
        get() {
            return _bindingBasket!!
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _bindingBasket= FragmentBasketBinding.inflate(inflater)
        return bindingBasket.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _bindingBasket = null
    }
}