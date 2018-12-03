package fr.epita.pauld.tictactoe

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    val user_name : String = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        start_button.setOnClickListener{
            (activity as MainActivity).onStartButtonClick()
        }
    }

    interface MainFragmentInteractionListener {
        fun onStartButtonClick()
    }
}
