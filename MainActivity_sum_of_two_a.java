package com.example.a413_shashank_sum_of_two_num;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity_sum_of_two_a extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 EditText textbox1;
 Button click;
 textbox1 = findViewById(R.id.editTextNumber1);
 click = findViewById(R.id.button);
 EditText textbox2;
 Button sign;
textbox2 = findViewById(R.id.editTextNumber2);
 click = findViewById(R.id.button);
 click.setOnClickListener(v -> {
 Intent it = new Intent(MainActivity.this, 
Sum_display.class);
 Bundle b1 = new Bundle();
 String a = textbox1.getText().toString();
 String b = textbox2.getText().toString();
 Integer num1 = Integer.parseInt(a);
 Integer num2 = Integer.parseInt(a);
 Integer sum = num1+num2;
 b1.putString("total",sum.toString());
 it.putExtras(b1);
 startActivity(it);
 });
 }
}