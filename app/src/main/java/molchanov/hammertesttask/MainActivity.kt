package molchanov.hammertesttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import molchanov.hammertesttask.ui.MarketMenuFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //if(savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container,MarketMenuFragment.newInstance())
                .commit()
        //}
    }
}