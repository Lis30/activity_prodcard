package com.projects.activity_prodcard.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.activity_prodcard.R;
import com.projects.activity_prodcard.repository.ResDescription;

import java.util.ArrayList;
import java.util.List;

public class ShopFragAdapter extends RecyclerView.Adapter<ShopFragAdapter.ShopViewHolder>{

    private ResDescription resDescription;
    List<String> capacity;
    List<String> color;
    Context context;

    public ShopFragAdapter(ResDescription resDescription) {
               this.resDescription = resDescription;
        this.color = new ArrayList<>();
        this.capacity = new ArrayList<>();
    }


    public ShopFragAdapter(Context context) {
        this.context = context;
        this.color = new ArrayList<>();
        this.capacity = new ArrayList<>();
    }

    public void addItems(ResDescription resDescription){
        resDescription.getClass();
    }

    public void addColor(List<String> colors) {
        color.addAll(colors);
        notifyDataSetChanged();
    }

    public void addCap(List<String> caps) {
        capacity.addAll(caps);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View ShopInfo = LayoutInflater.from(context).inflate(R.layout.fragment_shop, parent, false);
        return new ShopFragAdapter.ShopViewHolder(ShopInfo);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
        holder.cameratxt.setText(resDescription.getCamera());
        holder.chipTxt.setText(resDescription.getCPU());
        holder.memoryTxt.setText(resDescription.getSsd());
        holder.sdCardXtx.setText(resDescription.getSd());
        holder.capacity1.setText(resDescription.getCapacity().get(0));
        holder.capacity2.setText(resDescription.getCapacity().get(1));
        holder.colorBtn1.setBackgroundResource(Integer.parseInt(resDescription.getColor().get(0)));
        holder.colorBtn2.setBackgroundResource(Integer.parseInt(resDescription.getColor().get(1)));
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView chipTxt, cameratxt, memoryTxt, sdCardXtx, capacity1, capacity2;
        Button colorBtn1, colorBtn2;




        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView chipTxt = itemView.findViewById(R.id.chipTxt);
            TextView  cameratxt = itemView.findViewById(R.id.cameratxt);
            TextView  memoryTxt = itemView.findViewById(R.id.memoryTxt);
            TextView  sdCardXtx = itemView.findViewById(R.id.sdCardTxt);
            Button colorBtn1 = itemView.findViewById(R.id.button);
            Button colorBtn2 = itemView.findViewById(R.id.button2);
            TextView  capacity1 = itemView.findViewById(R.id.first_cap);
            TextView  capacity2 = itemView.findViewById(R.id.second_cap);

        }

        @Override
        public void onClick(View view) {

        }
    }

}
