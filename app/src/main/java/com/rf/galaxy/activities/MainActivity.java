package com.rf.galaxy.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.rf.galaxy.R;
import com.rf.galaxy.adapter.GalaxyAdapter;
import com.rf.galaxy.model.Galaxy;
import com.rf.galaxy.model.GalaxyData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Galaxy> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(GalaxyData.getListData());
        showRecyclerViewList();
    }

    private void showRecyclerViewList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GalaxyAdapter galaxyAdapter = new GalaxyAdapter(this);
        galaxyAdapter.setListGalaxy(list);
        recyclerView.setAdapter(galaxyAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(MainActivity.this,AboutActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }


}