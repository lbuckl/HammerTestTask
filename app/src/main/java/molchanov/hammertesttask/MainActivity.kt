package molchanov.hammertesttask

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import molchanov.hammertesttask.ui.BasketFragment
import molchanov.hammertesttask.ui.MarketMenuFragment
import molchanov.hammertesttask.ui.ProfileFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, MarketMenuFragment.newInstance())
                .commit()
        }

        findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
            .setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.bottom_view_menu -> {
                        val menuLastFragment = supportFragmentManager.findFragmentByTag("menuFragment")
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_container, MarketMenuFragment.newInstance(),"menuFragment")
                            .commit()
                        true
                    }
                    R.id.bottom_view_profile -> {
                        val profileLastFragment = supportFragmentManager.findFragmentByTag("profileFragment")
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_container, ProfileFragment.newInstance(),"profileFragment")
                            .commit()
                        true
                    }
                    R.id.bottom_view_basket -> {
                        val basketLastFragment = supportFragmentManager.findFragmentByTag("basketFragment")
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_container, BasketFragment.newInstance(),"basketFragment")
                            .commit()
                        true
                    }
                    else -> false
                }
            }
    }

    /**
     * Функция для замены фрагмента в контейнере
     * если фрагмент ещё живой, то возвращает его в контейнер
     * если фрагмента нет, то создаёт новый
     */
    private fun replaceFragment(findFragment: Fragment?, newFragment: Fragment, flag:String){
        supportFragmentManager.beginTransaction().apply {
            if (findFragment == null) {
                replace(R.id.main_container, newFragment, flag)
                    .addToBackStack("Contacts")
                    .commitAllowingStateLoss()
            } else {
                replace(R.id.main_container, findFragment, flag)
                    .commitAllowingStateLoss()
            }
        }
    }

}