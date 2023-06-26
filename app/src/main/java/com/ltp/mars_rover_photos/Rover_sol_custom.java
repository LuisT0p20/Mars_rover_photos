package com.ltp.mars_rover_photos;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Rover_sol_custom extends RecyclerView.ViewHolder {
    TextView txtSol,txtName,txtLanding,txtLaunch,txtStatus;
    ImageView imgSolMars;
    CardView cardView;
    public Rover_sol_custom(@NonNull View itemView) {
        super(itemView);

        txtSol = itemView.findViewById(R.id.txtSolMars);
        txtName = itemView.findViewById(R.id.txtNameSolMars);
        txtLanding = itemView.findViewById(R.id.txtLandingSolMars);
        txtLaunch = itemView.findViewById(R.id.txtLaunchSolMars);
        txtStatus = itemView.findViewById(R.id.txtStatusSolMars);
        imgSolMars = itemView.findViewById(R.id.imgSolMars);
        cardView = itemView.findViewById(R.id.card_sol);
    }
}
