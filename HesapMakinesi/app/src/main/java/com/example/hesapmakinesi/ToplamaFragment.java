package com.example.hesapmakinesi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hesapmakinesi.databinding.FragmentToplamaBinding;

import java.util.ArrayList;

public class ToplamaFragment extends Fragment{


    private FragmentToplamaBinding binding;
    private String curr, ress;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        curr = "";
        ress = "";
        binding = FragmentToplamaBinding.inflate(inflater, container, false);

        binding.button1.setOnClickListener(view -> {
            curr = curr + 1;
            displayOne();
        });

        binding.button2.setOnClickListener(view -> {
            //binding.textView.setText(binding.button2.getText());
            curr = curr + 2;
            displayOne();
        });

        binding.button3.setOnClickListener(view -> {
            //binding.textView.setText(binding.button2.getText());
            curr = curr + 3;
            displayOne();
        });

        binding.button4.setOnClickListener(view -> {
            //binding.textView.setText(binding.button2.getText());
            curr = curr + 4;
            displayOne();
        });

        binding.button5.setOnClickListener(view -> {
            //binding.textView.setText(binding.button2.getText());
            curr = curr + 5;
            displayOne();
        });

        binding.button6.setOnClickListener(view -> {
            //binding.textView.setText(binding.button2.getText());
            curr = curr + 6;
            displayOne();
        });

        binding.button7.setOnClickListener(view -> {
            //binding.textView.setText(binding.button2.getText());
            curr = curr + 7;
            displayOne();
        });

        binding.button8.setOnClickListener(view -> {
            //binding.textView.setText(binding.button2.getText());
            curr = curr + 8;
            displayOne();
        });

        binding.button9.setOnClickListener(view -> {
            //binding.textView.setText(binding.button2.getText());
            curr = curr + 9;
            displayOne();
        });

        binding.buttonArti.setOnClickListener(view -> {
            curr = curr + "+";
            displayOne();

        });

        binding.buttonEsittir.setOnClickListener(view -> {
            binding.ciktiToplam.setText(String.valueOf(toplama(binding.textView.getText().toString())));
            displayOne();
        });

        return binding.getRoot();

    }
    public void displayOne(){
        binding.textView.setText(curr);
    }
    int readNumber(int id ) {
        return Integer.parseInt(binding.textView.getText().toString());
    }

    public int toplama(String value) {
        int result = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < value.length(); i++){
            if(value.charAt(i) != '+')
                stringBuilder.append(value.charAt(i));
            else{
                arrayList.add(stringBuilder.toString());
                stringBuilder.delete(0,stringBuilder.length());
            }
            if((i+1) == value.length())
                arrayList.add(stringBuilder.toString());
        }
        for (String s : arrayList) {
            result += Integer.parseInt(s);
        }

        for(int i = 0 ; i < arrayList.size(); i++){
            System.err.print(arrayList.get(i));
            if((i+1) != arrayList.size())
                System.err.print("+");
            else
                System.err.print("=");
        }

        System.out.println(result);
        System.out.println(binding.textView.getText());
        return result;
    }
    }
