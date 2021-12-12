package com.example.mianterm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragme_thabtname.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragme_thabtname : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragme_thabtname, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var txt_email = view.findViewById<EditText>(R.id.txt_email)
        var txt_password = view.findViewById<EditText>(R.id.txt_password)
        var txt_tekrar_Password = view.findViewById<EditText>(R.id.txt_tekrar_Password)
        var txt_number = view.findViewById<EditText>(R.id.txt_number)
        var txt_addres = view.findViewById<EditText>(R.id.txt_addres)
        var txt_codeposti = view.findViewById<EditText>(R.id.txt_codeposti)
        var chbx_ghavanin=view.findViewById<CheckBox>(R.id.chbx_ghavanin)
        var btn_thabt = view.findViewById<Button>(R.id.btn_thabt)
    }

    btn_thabt.setOnclickListener {

        if (!txt_number.text.toString().startWith("09")){
            Toast.makeText(context,"شماره موبایل باید از 09 شروع شود",Toast.LENGTH_SHORT).show()
        }
        elseif(txt_number.text.to){


        }
        else if(txt_number.text.toString()=="" txt_number.text.tostring()=="" txt_number)
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragme_thabtname.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragme_thabtname().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}