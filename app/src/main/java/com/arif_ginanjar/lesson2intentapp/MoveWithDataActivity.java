package com.arif_ginanjar.lesson2intentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    public static String EXTRA_AGE = "extra_age";
    public static String EXTRA_NAME = "extra_name";
    private TextView activity_move_with_data_recived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        activity_move_with_data_recived = (TextView)findViewById(R.id.activity_move_with_data_recived);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        Integer age = getIntent().getIntExtra(EXTRA_AGE, 0);

        String text = "Name : "+name+", Your Age : "+age+" Year.";
        activity_move_with_data_recived.setText(text);
    }
}
