package com.yunusemre.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yunusemre.odev4.databinding.FragmentSayfaXBinding;


public class SayfaX extends Fragment {

        private FragmentSayfaXBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
                binding = FragmentSayfaXBinding.inflate(inflater,container,false);


            binding.xGoY.setOnClickListener(v -> {
                Navigation.findNavController(v).navigate(R.id.xGoingY);
            });



        return binding.getRoot();
    }
}