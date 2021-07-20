package com.example.hello_women;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UserListActivity extends AppCompatActivity  {

   Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

         Button button1 = findViewById(R.id.Tips_for_safety);
         Button button2 = findViewById(R.id.escapefromthreat);
         Button button3 = findViewById(R.id.pictures);
         Button button4 = findViewById(R.id.sendSMS);

         button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent activityChangeIntent = new Intent(UserListActivity.this, Tips_for_safety.class);
                UserListActivity.this.startActivity(activityChangeIntent);
            }
        });
         button2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 Intent intent = new Intent(UserListActivity.this, Escapefromthreat.class);
                 UserListActivity.this.startActivity(intent);
             }
         });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(UserListActivity.this, pictures.class);
                UserListActivity.this.startActivity(intent);
            }
        });



        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(UserListActivity.this, SMS.class);
                UserListActivity.this.startActivity(intent);
            }
        });


    }

}

