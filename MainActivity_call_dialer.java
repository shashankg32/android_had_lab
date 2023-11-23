package com.example.a413_shashank_phone_dial;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity_call_dialer extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 
 EditText t1 = findViewById(R.id.text1);
 Button call = findViewById(R.id.button);
 call.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 String num = t1.getText().toString();
// Uri uri = Uri.parse("tel:6360897825");
 Intent it = new Intent(Intent.ACTION_DIAL);
 it.setData(Uri.parse("tel:" + num));
 startActivity(it);
}
 });
 }
}