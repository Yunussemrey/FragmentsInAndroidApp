package com.yunusemre.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yunusemre.odev4.databinding.FragmentSayfaYBinding;




public class SayfaY extends Fragment {
    private FragmentSayfaYBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            binding = FragmentSayfaYBinding.inflate(inflater,container,false);


                binding.goAna.setOnClickListener(v -> {
                    Navigation.findNavController(v).navigate(R.id.goingAna);
                });


            return binding.getRoot();
    }
}