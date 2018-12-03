package fr.epita.pauld.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), MainFragment.MainFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val mainFrag = MainFragment()

        fragmentTransaction.add(R.id.mainContainer, mainFrag)
        fragmentTransaction.commit()

        /*supportFragmentManager
            .beginTransaction()
            .replace(R.id.mainContainer, MainFragment())
            .commit()
            */
    }

    override fun onStartButtonClick() {
        Toast.makeText(this, "you clicked", Toast.LENGTH_SHORT).show()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.mainContainer, GameFragment())
            .addToBackStack(null)
            .commit()
    }
}
