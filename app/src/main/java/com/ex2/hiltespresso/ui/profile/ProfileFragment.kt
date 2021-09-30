package com.ex2.hiltespresso.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ex2.hiltespresso.data.DataRepoImpl

class ProfileFragment : Fragment() {

    val viewModel by viewModels<ProfileViewModel> {
        ProfileViewModel.Factory(repo = DataRepoImpl())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.name_label)
            .text = viewModel.getProfile().name
    }

}