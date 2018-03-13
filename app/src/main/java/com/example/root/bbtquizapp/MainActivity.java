package com.example.root.bbtquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private RadioButton radioButton_1d, radioButton_4b, radioButton_2a, radioButton_3c;
    private CheckBox checkBox_7a, checkBox_7b, checkBox_7c, checkBox_7d;
    private EditText editText_5, editText_6;
    int grade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton_1d = (RadioButton) findViewById(R.id.radioButton_1d);
        radioButton_2a = (RadioButton) findViewById(R.id.radioButton_2a);
        radioButton_3c = (RadioButton) findViewById(R.id.radioButton_3c);
        radioButton_4b = (RadioButton) findViewById(R.id.radioButton_4b);
        checkBox_7b = (CheckBox) findViewById(R.id.checkBox_7b);
        checkBox_7d = (CheckBox) findViewById(R.id.checkBox_7d);
        checkBox_7a = (CheckBox) findViewById(R.id.checkBox_7a);
        checkBox_7c = (CheckBox) findViewById(R.id.checkBox_7c);
        editText_5 = (EditText) findViewById(R.id.editText_5);
        editText_6 = (EditText) findViewById(R.id.editText_6);

    }

    public void Submit(View view) {
        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        if (name.length() == 0) {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
        } else calculateScore(grade);


    }

    public void calculateScore(int grade) {
        if (radioButton_1d.isChecked()) grade++;
        if (radioButton_2a.isChecked()) grade++;
        if (radioButton_3c.isChecked()) grade++;
        if (radioButton_4b.isChecked()) grade++;
        String answer = editText_5.getText().toString();
        if (Objects.equals(answer.trim().toLowerCase(), "the comic center")) {
            grade++;
        }
        String answer1 = editText_6.getText().toString();
        if (Objects.equals(answer1.trim().toLowerCase(), "halley wolowitz")) {
            grade++;
        }
        if (!checkBox_7a.isChecked() && checkBox_7b.isChecked() && !checkBox_7c.isChecked() && checkBox_7d.isChecked())
            grade++;
        Toast.makeText(this, "Your score is " + grade, Toast.LENGTH_SHORT).show();

    }


}
