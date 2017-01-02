package com.example.dunde.lapplicationdelamortquitue;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Game extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On créer un objet "com.example.dunde.lapplicationdelamortquitue.GameView" qui est le code principal du jeu
        gameView=new GameView(this);

        // et on l'affiche.
        setContentView(gameView);
    }

}
