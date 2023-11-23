package com.example.a413_shashank_sum_of_two_num;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class Sum_display_sum_of_two_b extends AppCompatActivity {
 TextView receiver_msg;
@Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_sum_display);
 TextView sum;
 String nameFromFirstActivity = "";
 sum = findViewById(R.id.sum_display_field);
 nameFromFirstActivity = 
getIntent().getStringExtra("total");
 sum.setText(nameFromFirstActivity);
 }
}