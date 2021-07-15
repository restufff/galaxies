package com.rf.galaxy.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rf.galaxy.R;
import com.rf.galaxy.model.Galaxy;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_GALAXY = "extra_galaxy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);
        TextView scale = findViewById(R.id.tv_scale_detail);
        TextView distance = findViewById(R.id.tv_distance_detail);
        TextView year = findViewById(R.id.tv_year_detail);
        TextView cons = findViewById(R.id.tv_cons_detail);

        Galaxy galaxy = getIntent().getParcelableExtra(EXTRA_GALAXY);

        Glide.with(this).load(galaxy.getPhoto()).into(imageView);
        name.setText(galaxy.getName());
        description.setText(galaxy.getDescrption());
        scale.setText(galaxy.getScale());
        distance.setText(galaxy.getDistance());
        year.setText(galaxy.getYear());
        cons.setText(galaxy.getCons());

    }
}
