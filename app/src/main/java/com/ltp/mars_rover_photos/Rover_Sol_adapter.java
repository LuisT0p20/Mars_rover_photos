package com.ltp.mars_rover_photos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ltp.mars_rover_photos.Model.PhotosRover;
import com.ltp.mars_rover_photos.Rover_sol_custom;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Rover_Sol_adapter extends RecyclerView.Adapter<Rover_sol_custom> {
    private Context context;
    private List<PhotosRover> photosRoverList;

    public Rover_Sol_adapter(Context context, List<PhotosRover> photosRoverList) {
        this.context = context;
        this.photosRoverList = photosRoverList;
    }

    @NonNull
    @Override
    public Rover_sol_custom onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Rover_sol_custom(LayoutInflater.
                from(context).inflate(R.layout.mars_sol_img,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull Rover_sol_custom holder, int position) {
        holder.txtSol.setText(photosRoverList.get(position).getSol());
        holder.txtName.setText(photosRoverList.get(position).getRover().getName());
        holder.txtLanding.setText(photosRoverList.get(position).getRover().getLanding_date());
        holder.txtLaunch.setText(photosRoverList.get(position).getRover().getLaunch_date());
        holder.txtStatus.setText(photosRoverList.get(position).getRover().getStatus());

        if (photosRoverList.get(position).getImg_src() != null){
            Picasso.get().load(photosRoverList.get(position).getImg_src()).into(holder.imgSolMars);

        }
    }

    @Override
    public int getItemCount() {
        return photosRoverList.size();
    }
}
