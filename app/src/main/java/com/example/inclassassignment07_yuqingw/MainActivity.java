package com.example.inclassassignment07_yuqingw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
    }

    public void addPerson(View view) {
        Intent intent = new Intent(this, OwnActivity.class);
        startActivityForResult(intent, Request.ADD_PERSON);
    }

    @Override
    protected void onActivityResult(int request, int result, Intent data) {
        if (request == Request.ADD_PERSON && result == RESULT_OK) {
            Person p = (Person) data.getSerializableExtra(Keys.PERSON);
            textView.setText(p.toString());
        }
    }


}