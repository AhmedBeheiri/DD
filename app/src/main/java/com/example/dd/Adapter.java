package com.example.dd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context mcontext;
    private ArrayList<Items> mItems;

    public Adapter(Context context, ArrayList<Items> items){
        mcontext = context;
        mItems = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.items,parent,false);
        return new ViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Items currentItems = mItems.get(position);
        String imageUrl = currentItems.getmImageUrl();
        String url = currentItems.getmUrl();
        String title = currentItems.getmTitle();
        String description = currentItems.getmDescription();
        String content = currentItems.getmContent();
        int Published = currentItems.getmPublished();

        holder.mtextview.setText(title);
        holder.mtextview1.setText(description);
        holder.mtextview2.setText(url);
        holder.mtextview3.setText("Published at :" + Published);
        holder.mtextview4.setText(content);
        Picasso.get().load(imageUrl).into(holder.mimageView);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mimageView;
        public TextView mtextview;
        public TextView mtextview1;
        public TextView mtextview2;
        public TextView mtextview3;
        public TextView mtextview4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mimageView = itemView.findViewById(R.id.image_view);
            mtextview = itemView.findViewById(R.id.text_Title);
            mtextview1 = itemView.findViewById(R.id.text_Description);
            mtextview2 = itemView.findViewById(R.id.text_url);
            mtextview3 = itemView.findViewById(R.id.text_PublishedAt);
            mtextview4 = itemView.findViewById(R.id.text_Content);
        }
    }
}
