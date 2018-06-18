package com.example.harshpatel.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewItemList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item_list);
    }

    public void FirstItem(View view) {

        Intent firstitem = new Intent(ViewItemList.this,ViewItemDetails.class);
        startActivity(firstitem);
    }
}
