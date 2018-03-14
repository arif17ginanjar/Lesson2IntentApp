package com.arif_ginanjar.lesson2intentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button activity_main_move_activity;
    private Button activity_main_move_activity_wdata;
    private Button activity_main_dial_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main_move_activity = (Button)findViewById(R.id.activity_main_move_activity);
        activity_main_move_activity.setOnClickListener(this);

        activity_main_move_activity_wdata = (Button)findViewById(R.id.activity_main_move_activity_wdata);
        activity_main_move_activity_wdata.setOnClickListener(this);

        activity_main_dial_num = (Button)findViewById(R.id.activity_main_dial_num);
        activity_main_dial_num.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.activity_main_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.activity_main_move_activity_wdata:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);

                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Arif Ginanjar");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 21);

                startActivity(moveWithDataIntent);
                break;
            case R.id.activity_main_dial_num:
                String phoneNumber = "083821713915";

                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));

                startActivity(dialPhoneIntent);
                break;
        }
    }
}
