package com.jahid.fakestoreapivolly;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderView extends RecyclerView.ViewHolder {

    TextView titleView,categoryView,descriptionView;
    ImageView imageView;
    public HolderView(@NonNull View itemView) {
        super(itemView);
        titleView = itemView.findViewById(R.id.titleId);
        categoryView = itemView.findViewById(R.id.categoryId);
        descriptionView = itemView.findViewById(R.id.descriptionId);
        imageView = itemView.findViewById(R.id.imageId);
    }
}
