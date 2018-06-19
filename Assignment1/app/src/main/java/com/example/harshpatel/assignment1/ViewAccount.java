package com.example.harshpatel.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ViewAccount extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_account);
        String firstName = getIntent().getStringExtra("firstName");
        String lastName = getIntent().getStringExtra("lastName");
        String UserName = getIntent().getStringExtra("username");
        String Gender = getIntent().getStringExtra("gender");
        //(EditText)findViewById(R.id.Fname).set
    }
    public void update(View view) {

        Intent updateAccount =  new Intent(ViewAccount.this,UpdateAccount.class);
        startActivity(updateAccount);
    }


    public void logout(View view) {

        Toast.makeText(this, "You are logout.", Toast.LENGTH_SHORT).show();
        Intent viewitemlist = new Intent(ViewAccount.this,MainActivity.class);
        startActivity(viewitemlist);
    }
}


