package com.example.dunde.lapplicationdelamortquitue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class secondactivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity); }


    public void RetourOnclick(View f) {
        Button Retour = (Button) f;
        Intent q = new Intent(this, MainActivity.class);
        startActivity(q);
    }

    public void TroisiemeOnclick(View z) {
        Button Troisieme = (Button) z;
        Intent p = new Intent(this, requetehttp.class);
        startActivity(p);
    }


    public void JEUOnclick(View k) {
        Button JEU = (Button) k;
        Intent v = new Intent(this, Game.class);
        startActivity(v);
    }

}
