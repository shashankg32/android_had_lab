package com.example.a413_shashank_calc;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity_calculator extends AppCompatActivity {
 boolean isNewOp = true;
 String oldNumber = "";
 EditText ed1;
 String op = "";
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 ed1 = findViewById(R.id.input_output_field);
 }
 public void numberEvent(View view){
 if(isNewOp) {ed1.setText("");isNewOp = false;}
 String number = ed1.getText().toString();
 switch (view.getId()){
 case R.id.b1:
 number += "1";
 break;
 case R.id.b2:
 number += "2";
 break;
 case R.id.b3:
 number += "3";
 break;
 case R.id.b4:
 number += "4";
 break;
 case R.id.b5:
 number += "5";
 break;
 case R.id.b6:
 number += "6";
 break;
 case R.id.b7:
 number += "7";
 break;
 case R.id.b8:
 number += "8";
break;
 case R.id.b9:
 number += "9";
 break;
 case R.id.b0:
 number += "0";
 break;
 }
 ed1.setText(number);
 }
 public void operatorEvent(View view){
 isNewOp = true;
 oldNumber = ed1.getText().toString();
 switch (view.getId()){
 case R.id.b_add: op = "+"; break;
 case R.id.b_sub: op = "-"; break;
 case R.id.b_product: op = "*"; break;
 case R.id.b_divide: op = "/"; break;
 }
 }
 public void equalEvent(View view) {
 String newNumber = ed1.getText().toString();
 double result = 0.0;
 switch (op){
 case "+":
 result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
 break;
 case "-":
 result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
 break;
 case "*":
 result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
 break;
 case "/":
 result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
 break;
 }
 ed1.setText(result+"");
 }
 public void acEvent(View view){
 ed1.setText("0");
 isNewOp = true;
 }
 }