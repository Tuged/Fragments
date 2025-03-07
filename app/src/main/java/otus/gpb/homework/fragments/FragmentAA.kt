package otus.gpb.homework.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment

class FragmentAA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.text_aa).setTextColor(ColorGenerator.generateColor())
        view.setBackgroundColor(ColorGenerator.generateColor())
        view.findViewById<Button>(R.id.btn_openAB).setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.frameforAB,FragmentAB())
                .addToBackStack("")
                .commit()
//            view.findViewById<Button>(R.id.btn_openAB).isVisible = false
        }
    }
}