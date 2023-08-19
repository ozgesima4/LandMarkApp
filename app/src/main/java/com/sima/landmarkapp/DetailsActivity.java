package com.sima.landmarkapp;

import static com.sima.landmarkapp.MainActivity.choseLandMArk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.sima.landmarkapp.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

     //   Intent intent=new Intent();
        //casting

    //    LandMark selectedLandMark= (LandMark) intent.getSerializableExtra("landmark");
    //    LandMark selectedLandMark=choseLandMArk;
        singleton singleton= com.sima.landmarkapp.singleton.getInstance();
        LandMark selectedLandMark=  singleton.getSentlandmark();

        binding.textView.setText(selectedLandMark.city);
        binding.textView2.setText(selectedLandMark.name);
        binding.imageView.setImageResource(selectedLandMark.image);


    }
}