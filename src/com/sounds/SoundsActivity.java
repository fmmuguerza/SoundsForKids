package com.sounds;

import android.os.Bundle;
import android.app.Activity;
import android.media.AudioManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class SoundsActivity extends Activity {
	SoundManager snd;
	int perro,pajaro,vaca;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sounds);
        snd = new SoundManager(getApplicationContext());
        
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
 
        perro = snd.load(R.raw.perro);
        pajaro = snd.load(R.raw.pajaro);
        vaca = snd.load(R.raw.vaca);
       
         
        final Button button = (Button) findViewById(R.id.dog);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView txtNombre=(TextView) findViewById(R.id.textView1);
                txtNombre.setText("A dog");
                snd.play(perro);
            }
        });
        final Button button2 = (Button) findViewById(R.id.bird);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView txtNombre=(TextView) findViewById(R.id.textView1);
                txtNombre.setText("A bird");
                snd.play(pajaro);
            }
        });
        final Button button3 = (Button) findViewById(R.id.cow);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView txtNombre=(TextView) findViewById(R.id.textView1);
                txtNombre.setText("A cow !!!!");
                snd.play(vaca);
            }
        });
 
    }
  
}