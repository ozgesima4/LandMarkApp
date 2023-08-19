package com.sima.landmarkapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.sima.landmarkapp.databinding.ActivityDetailsBinding;
import com.sima.landmarkapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList <LandMark> LandMarkLİst;
    static LandMark choseLandMArk;

      private ActivityMainBinding binding;  //view binding find by ıd den dah averimlidir bu yüzden böyle tanım lazım

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        LandMarkLİst=new ArrayList<>();


        // data girişleri sınıf aracılığıyla

        LandMark kapadokya=new LandMark("nevşehir","peri bacaları",R.drawable.peribacalari);
        LandMark trabzon=new LandMark("trabzon","uzungöl",R.drawable.trabzon);
        LandMark agri=new LandMark("ağrı","ishak paşa sarayı",R.drawable.saray);

        LandMarkLİst.add(kapadokya);
        LandMarkLİst.add(trabzon);
        LandMarkLİst.add(agri);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandMArkAdapter landMark=new LandMArkAdapter(LandMarkLİst);
        binding.recyclerView.setAdapter(landMark);


    }
}