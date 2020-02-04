package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int pointofa =0;
    int pointofb =0;
    public void teamaget3(View view)
    {
        pointofa=pointofa+3;
        displayForTeamA(pointofa);
    }
    public void teamaget2(View view)
    {
        pointofa=pointofa+2;
        displayForTeamA(pointofa);
    }
    public void teamaget1(View view)
    {
        pointofa=pointofa+1;
        displayForTeamA(pointofa);
    }
    public void teambget3(View view)
    {
        pointofb=pointofb+3;
        displayForTeamB(pointofb);
    }
    public void teambget2(View view)
    {
        pointofb=pointofb+2;
        displayForTeamB(pointofb);
    }
    public void teambget1(View view)
    {
        pointofb=pointofb+1;
        displayForTeamB(pointofb);
    }
    public void teamsreset(View view)
    {
        pointofa=0;
        displayForTeamA(pointofa);
        pointofb=0;
        displayForTeamB(pointofb);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
