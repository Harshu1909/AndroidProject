package com.example.harshpatel.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {

    EditText Fname,Lname,Username,Password,Cpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Fname = (EditText)findViewById(R.id.Fname);
        Lname = (EditText)findViewById(R.id.Lname);
        Username = (EditText)findViewById(R.id.Username);
        Password = (EditText)findViewById(R.id.Password);
        Cpassword = (EditText)findViewById(R.id.Cpassword);

    }

    public void register(View view) {

        Toast.makeText(this, "New User has been register", Toast.LENGTH_SHORT).show();
    }

    public void clear(View view) {

        Fname.setText("");
        Lname.setText("");
        Username.setText("");
        Password.setText("");
        Cpassword.setText("");

    }
}
