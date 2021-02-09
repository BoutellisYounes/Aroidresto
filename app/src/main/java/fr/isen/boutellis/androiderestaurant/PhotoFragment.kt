package fr.isen.boutellis.androiderestaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import fr.isen.boutellis.androiderestaurant.R
import fr.isen.boutellis.androiderestaurant.databinding.FragmentPhotoBinding

class PhotoFragment : Fragment() {

    private lateinit var binding : FragmentPhotoBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhotoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val url = arguments?.getString(URL)

        if(url?.isNotEmpty() == true) {
            Picasso.get().load(url).placeholder(R.drawable.appresto).into(binding.photo)
        }
    }

    companion object {
        fun newInstance(url: String)= PhotoFragment().apply { arguments = Bundle().apply { putString(URL, url) } }

        const val URL = "URL"
    }
}