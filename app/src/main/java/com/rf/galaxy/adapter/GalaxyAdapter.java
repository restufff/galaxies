package com.rf.galaxy.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rf.galaxy.R;
import com.rf.galaxy.activities.DetailActivity;
import com.rf.galaxy.model.Galaxy;

import java.util.ArrayList;

public class GalaxyAdapter extends RecyclerView.Adapter<GalaxyAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Galaxy> listGalaxy;

    public GalaxyAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Galaxy> getListGalaxy() {
        return listGalaxy;
    }

    public void setListGalaxy(ArrayList<Galaxy> listGalaxy) {
        this.listGalaxy = listGalaxy;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ListViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        holder.tvName.setText(getListGalaxy().get(position).getName());
        holder.tvDistance.setText(getListGalaxy().get(position).getDistance());

        Glide.with(context).load(getListGalaxy().get(position).getPhoto()).into(holder.imgList);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailActivity = new Intent(context, DetailActivity.class);
                detailActivity.putExtra(DetailActivity.EXTRA_GALAXY, listGalaxy.get(position));
                context.startActivity(detailActivity);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListGalaxy().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvDistance;
        ImageView imgList;
        RelativeLayout relativeLayout;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name_list);
            tvDistance = itemView.findViewById(R.id.tv_distance_list);
            imgList = itemView.findViewById(R.id.img_detail);
            relativeLayout = itemView.findViewById(R.id.relative_layout);
        }
    }
}
