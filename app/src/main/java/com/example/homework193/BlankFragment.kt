package com.example.homework193

import android.os.Bundle
import android.provider.Settings.Global.putInt
import android.provider.Settings.Global.putString
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank.view.*


class BlankFragment : Fragment() {

    private lateinit var root:View
    private var image:Int? = null
    private var head: String? = null
    private var message: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            image = it.getInt("image")
            head = it.getString("header")
            message = it.getString("message")

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root =  inflater.inflate(R.layout.fragment_blank, container, false)

        root.imageOfView.setImageResource(image!!)
        root.header_title.text = head

        root.messageTxt.text = message
        return root
    }

    companion object {

        @JvmStatic
        fun newInstance(image:Int, head:String, message:String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putInt("image", image)
                    putString("header", head)
                    putString("message", message)
                }
            }
    }
}