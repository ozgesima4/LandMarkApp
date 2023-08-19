package com.sima.landmarkapp;

import static com.sima.landmarkapp.MainActivity.choseLandMArk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.sima.landmarkapp.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandMArkAdapter extends RecyclerView.Adapter<LandMArkAdapter.LAndMArkViewHolder> {

    ArrayList<LandMark> landmarkıtem;

    public LandMArkAdapter(ArrayList<LandMark> landmarkıtem) {
        this.landmarkıtem = landmarkıtem;
    }


    @NonNull
    @Override
    public LAndMArkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {   //xmlimizi bağlama işlemi burda yappılır

       RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LAndMArkViewHolder(recyclerRowBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull LAndMArkViewHolder holder, @SuppressLint("RecyclerView") int position) {  //değerini ver xmlin
       holder.binding.recyclerViewTextView.setText(landmarkıtem.get(position).name);

       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                                        //this yerine holder.itemview.getcontext kullanırız
               Intent intent=new Intent(holder.itemView.getContext(), DetailsActivity.class);
          //     choseLandMArk=landmarkıtem.get(position);
          //     intent.putExtra("landmark",landmarkıtem.get(position));
               singleton singleton= com.sima.landmarkapp.singleton.getInstance();
               singleton.setSentlandmark(landmarkıtem.get(position));

               holder.itemView.getContext().startActivity(intent);

           }
       });

    }

    @Override
    public int getItemCount() {
        return landmarkıtem.size();
    }                                                       //kaç tane öğen var


    public class LAndMArkViewHolder extends RecyclerView.ViewHolder{   //ıtemleri tutar mantık olarak
        private  RecyclerRowBinding binding;

        public LAndMArkViewHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }

}
