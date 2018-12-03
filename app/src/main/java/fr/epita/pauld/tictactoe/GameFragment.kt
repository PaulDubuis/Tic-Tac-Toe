package fr.epita.pauld.tictactoe

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_game.*


class GameFragment : Fragment() {
    private var param1: String? = null

    val row : MutableList<MutableList<Button>> = arrayListOf()
    val column :  MutableList<Button> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("user_name")
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tv : TextView = player_name.findViewById(R.id.player_name)
        tv.setText("O (" + param1 + ")")

        for (i in 0..9) {
            column.add(view.findViewById(R.id.bt + i))
        }

    }

    interface OnGameFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
    }
}
