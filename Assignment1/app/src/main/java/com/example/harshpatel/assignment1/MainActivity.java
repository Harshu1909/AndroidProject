package com.example.harshpatel.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login,clear;

    String UsernameString,PasswordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);
        clear = (Button)findViewById(R.id.clear);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                UsernameString = username.getText().toString();
                PasswordString = password.getText().toString();

                if (UsernameString.equals("Admin") && PasswordString.equals("Admin")){

                    Intent viewitemlist = new Intent(MainActivity.this,ViewItemList.class);
                    startActivity(viewitemlist);
                }
                else{

                    Toast.makeText(MainActivity.this, "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                }

            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username.setText("");
                password.setText("");
            }
        });



    }

    public void registration(View view) {

        Intent registration =  new Intent(MainActivity.this,registration.class);
        startActivity(registration);
    }
}
