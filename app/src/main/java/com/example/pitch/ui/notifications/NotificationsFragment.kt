package com.example.pitch.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.pitch.MainActivity4
import com.example.pitch.R
import kotlinx.android.synthetic.main.fragment_farmacias.*

class NotificationsFragment : Fragment() {

    private fun openNextActivity() {
        val intent = Intent(context, MainActivity4::class.java)
        startActivity(intent)
    }

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_farmacias, container, false)
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {

        })

        return root
    }
}
