package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Increases Team A Score by 3 points
    public void plusThreeA(View view) {
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }

    //Increases Team A Score by 2 points
    public void plusTwoA(View view) {
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }

    //Increases Team A Score by 1 points
    public void freeThrowA(View view) {
        scoreA++;
        displayForTeamA(scoreA);
    }

    //Increases Team B Score by 3 points
    public void plusThreeB(View view) {
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    //Increases Team B Score by 2 points
    public void plusTwoB(View view) {
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }

    //Increases Team B Score by 1 points
    public void freeThrowB(View view) {
        scoreB++;
        displayForTeamB(scoreB);
    }

    //Resets the team scores
    public void resetScores(View view) {
        scoreA=scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    //Display the score of Team A
    private void displayForTeamA(int scoreA) {
        TextView scoreViewA=(TextView) findViewById(R.id.teamA_score);
        scoreViewA.setText(String.valueOf(scoreA));
    }

    //Display the score of Team B
    private void displayForTeamB(int scoreB) {
        TextView scoreViewB=(TextView) findViewById(R.id.teamB_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }

}
