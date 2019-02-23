package com.earthdefensesystem.fanbarfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FavoritesActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sportsSpinner, teamSpinner;

    Button mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        sportsSpinner = findViewById(R.id.sports_spinner);
        ArrayAdapter<CharSequence> sportsAdapter = ArrayAdapter.createFromResource(this, loadSportsData(), android.R.layout.simple_spinner_item);
        sportsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sportsSpinner.setAdapter(sportsAdapter);
        sportsSpinner.setOnItemSelectedListener(this);

        teamSpinner = findViewById(R.id.team_spinner);
        ArrayAdapter<CharSequence> teamAdapter = ArrayAdapter.createFromResource(this, loadTeamData(), android.R.layout.simple_spinner_item);
        sportsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        teamSpinner.setAdapter(teamAdapter);
        teamSpinner.setOnItemSelectedListener(this);

        mapButton = findViewById(R.id.map_button);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(FavoritesActivity.this,
                        MapsActivity.class);
                startActivity(myIntent);
            }
        });



    }

    private void loadSportsData() {
        ArrayList<Pins> sports = PinDbDao.listSports();

    }

    private void loadTeamData() {
        ArrayList<Pins> teams = PinDbDao.listTeams();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String teamText = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), teamText, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
