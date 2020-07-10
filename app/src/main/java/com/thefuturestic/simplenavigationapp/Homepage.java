package com.thefuturestic.simplenavigationapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class Homepage extends Fragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v = inflater.inflate(R.layout.home_page_fragment,
                    container, false);


            Button oneBtn =  (Button) v.findViewById(R.id.fragment_one_btn);
            Button twoBtn = (Button) v.findViewById(R.id.fragment_two_btn);

            oneBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getContext(),"Hello",Toast.LENGTH_SHORT).show();
                    FragmentOne nextFrag= new FragmentOne();
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.home_container, nextFrag, "findThisFragment")
                            .addToBackStack(null)
                            .commit();

                }
            });

            twoBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTwo nextFrag = new FragmentTwo();
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.home_container, nextFrag, "findThisFragment")
                            .addToBackStack(null)
                            .commit();
                }
            });


            return v;
        }

    }
