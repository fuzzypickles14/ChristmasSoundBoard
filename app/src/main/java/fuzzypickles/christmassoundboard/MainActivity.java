package fuzzypickles.christmassoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupSounds();
    }

    protected void setupSounds() {
        Button hoButton = findViewById(R.id.hoButton);
        Button merryButton = findViewById(R.id.merryButton);
        Button rudolphButton = findViewById(R.id.rudolphButton);
        Button jingleButton = findViewById(R.id.jingleButton);

        final MediaPlayer hohoho = MediaPlayer.create(this, R.raw.hohoho);
        final MediaPlayer jingle = MediaPlayer.create(this, R.raw.jingle);
        final MediaPlayer beefAndCheese = MediaPlayer.create(this, R.raw.beefandcheese);
        final MediaPlayer merryChristmas = MediaPlayer.create(this, R.raw.merrychristmas);

        hoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hohoho.start();
            }
        });

        merryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                merryChristmas.start();
            }
        });

        rudolphButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beefAndCheese.start();
            }
        });

        jingleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jingle.start();
            }
        });

    }
}
