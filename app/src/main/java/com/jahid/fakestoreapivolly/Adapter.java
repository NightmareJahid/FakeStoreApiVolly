package com.jahid.fakestoreapivolly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<HolderView> {

    Context context;
    List<Items> productData;

    public Adapter(Context context, List<Items> productData) {
        this.context = context;
        this.productData = productData;
    }

    @NonNull
    @Override
    public HolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.desgin_view,parent,false);
        return new HolderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderView holder, int position) {
        final Items itemsPosition = productData.get(position);

        holder.titleView.setText(itemsPosition.getTitle());
        holder.categoryView.setText(itemsPosition.getCategory());
        holder.descriptionView.setText(itemsPosition.getDescription());

        Picasso.get().load(itemsPosition.getImgUrl()).into(holder.imageView);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = holder.titleView.getText().toString();

                Toast.makeText(context, title, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return productData.size();
    }
}
