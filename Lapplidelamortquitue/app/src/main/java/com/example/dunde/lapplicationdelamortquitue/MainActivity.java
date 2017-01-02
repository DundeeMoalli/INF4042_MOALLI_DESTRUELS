package com.example.dunde.lapplicationdelamortquitue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

}
    public void JouerOnclick(View v) {
        Button Jouer = (Button) v;
        ((Button) v).setText("clicked");

        Intent i = new Intent(this, secondactivity.class);
        startActivity(i);  //Fonctionnalité qui permet de passer d'une activité à une autre. En utilisant la fonction ci-dessus, lorsque//celle ci sera activée
    }

        public void QuitterOnclick(View f) {
            Intent homeIntent = new Intent(Intent.ACTION_MAIN);
            homeIntent.addCategory( Intent.CATEGORY_HOME );
            homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(homeIntent);
        System.exit(0);
    }

    public void TrollOnClick (View x) {
        Button Troll = (Button) x;
        Intent l = new Intent(this, Video.class);
        startActivity(l);
    }

    public void AideOnClick (View help) {
        ImageButton Aide = (ImageButton) help;
        Toast toast= Toast.makeText(MainActivity.this,"Notre jeu n'est pas dur.\n Vous pouvez juste déplacer Dark Vador avec votre doigt :)",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }





}
