package com.example.pitch.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.pitch.R
import com.example.pitch.doencas.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
<<<<<<< HEAD
        super.onActivityCreated(savedInstanceState)
=======

>>>>>>> de2d011ef306c065a25a641933862a6cfd75c8f4
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_doencas, container, false)

        val vCovidButton: TextView = root.findViewById(R.id.button_covid)
        val vAidsButton: TextView = root.findViewById(R.id.button_AIDS)
        val vDengueButton: TextView = root.findViewById(R.id.button_dengue)
        val vGripeButton: TextView = root.findViewById(R.id.button_gripe)
        val vHanseniaseButton: TextView = root.findViewById(R.id.button_hanseniase)
        val vTuberculoseButton: TextView = root.findViewById(R.id.button_tuberculose)

        val vCovidActivity = Intent(this@DashboardFragment.context, CovidActivity::class.java)
        val vAidsActivity = Intent(this@DashboardFragment.context, AidsActivity::class.java)
        val vDengueActivity = Intent(this@DashboardFragment.context, DengueActivity::class.java)
        val vGripeActivity = Intent(this@DashboardFragment.context, GripeActivity::class.java)
        val vHanseniaseActivity = Intent(this@DashboardFragment.context, HanseniaseActivity::class.java)
        val vTuberculoseActivity = Intent(this@DashboardFragment.context, TuberculoseActivity::class.java)

        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            vCovidButton.text = it
        })

<<<<<<< HEAD
        vCovidButton.setOnClickListener{
            startActivity(vCovidActivity)
        }

        vAidsButton.setOnClickListener{
            startActivity(vAidsActivity)
        }

        vDengueButton.setOnClickListener{
            startActivity(vDengueActivity)
        }

        vGripeButton.setOnClickListener{
            startActivity(vGripeActivity)
        }

        vHanseniaseButton.setOnClickListener{
            startActivity(vHanseniaseActivity)
        }

        vTuberculoseButton.setOnClickListener{
            startActivity(vTuberculoseActivity)
        }

=======
        button_covid.setOnClickListener {
            requireActivity().run {
                startActivity(Intent(this, Covid::class.java))
                finish()
            }
        }
>>>>>>> de2d011ef306c065a25a641933862a6cfd75c8f4
        return root
    }

}
