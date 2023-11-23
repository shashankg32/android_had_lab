package com.example.a413_shankg_media_player;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity_media_player extends AppCompatActivity {
 MediaPlayer mediaPlayer;
 int forwardTime = 5000;
 int backwardTime = 5000;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 mediaPlayer = MediaPlayer.create(this, R.raw.song);
 TextView songTitle = findViewById(R.id.songname);
 songTitle.setText("chandrachooda shiva shankara");
 Button play = findViewById(R.id.play);
 play.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Toast.makeText(getApplicationContext(), "Playing Song", 
Toast.LENGTH_LONG).show();
 mediaPlayer.start();
 }
 });
 Button pause = findViewById(R.id.pause);
 pause.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Toast.makeText(getApplicationContext(), "Pausing Song", 
Toast.LENGTH_LONG).show();
 mediaPlayer.pause();
 }
});
 Button forward = findViewById(R.id.forward);
 forward.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 int currentPos = mediaPlayer.getCurrentPosition();
 if ((currentPos + forwardTime) <= mediaPlayer.getDuration()) {
 mediaPlayer.seekTo(currentPos + forwardTime);
 }
 }
 });
 Button rewind = findViewById(R.id.rewind);
 rewind.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 int currentPos = mediaPlayer.getCurrentPosition();
 if ((currentPos - backwardTime) >= 0) {
 mediaPlayer.seekTo(currentPos - backwardTime);
 }
 }
 });
 Button stop = findViewById(R.id.stop);
 stop.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Toast.makeText(getApplicationContext(), "Stopping Song", 
Toast.LENGTH_LONG).show();
 mediaPlayer.stop();
 mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.song);
 }
 });
 Button restart = findViewById(R.id.restart);
 restart.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Toast.makeText(getApplicationContext(), "Restarting Song", 
Toast.LENGTH_LONG).show();
 mediaPlayer.seekTo(0);
 mediaPlayer.start();
 }
 });
 }
}Toast.LENGTH_LONG).show();
 mediaPlayer.seekTo(0);
 mediaPlayer.start();
 }
 });
 }
}